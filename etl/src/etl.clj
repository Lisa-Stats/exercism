(ns etl
  (:require [clojure.string :as str]))


(defn transform-old [source]
  (let [s1 (apply str/lower-case source)]

    (zipmap (into [] (flatten (map second [s1])))

            (into [] (mapcat (fn [[n x]] (repeat (count x) n)) s1)))))

(into [] "Hello")


(def points
  {"a"  1
   "b"  3
   "c" 3
   "d" 2 "e" 1
   "f"  4 "g"  2 "h" 4 "i" 1 "j" 8
   "k"  5 "l"  1 "m" 3 "n" 1 "o" 1
   "p"  3 "q" 10 "r" 1 "s" 1 "t" 1
   "u"  1 "v"  4 "w" 4 "x" 8 "y" 4
   "z" 1})

(get points "a")

;;- when fn initializes we start w/ an empty map on line 39 (arg 'm' which is the first arg of anon fn)
;;- k and v refer to each key value pair inside associative coll on 40
;;-> just the way the reducer works, not destructured
;;- take each v and lower-case each string inside of that v
;;- after we build new map with zipmap, we merge it with our new associative coll (m)
;;-> have to use merge b/c for each new key that zipmap is reducing over, zipmap creates a new map

(defn transform [source]
  (reduce-kv
   (fn [m k v]
     (let [new-keys (map str/lower-case v)]
       (merge m (zipmap new-keys (repeat k)))))
   {}
   source))
