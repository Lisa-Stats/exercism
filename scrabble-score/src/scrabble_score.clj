(ns scrabble-score
  (:require [clojure.string :as s]))

(def values
  {:a 1
   :b 3
   :c 3
   :d 2
   :e 1
   :f 4
   :g 2
   :h 4
   :i 1
   :j 8
   :k 5
   :l 1
   :m 3
   :n 1
   :o 1
   :p 3
   :q 10
   :r 1
   :s 1
   :t 1
   :u 1
   :v 4
   :w 4
   :x 8
   :y 4
   :z 10})

(defn score-letter [l]
  (let [l2 (s/lower-case l)]
    (values (keyword l2))))

(defn score-key [l]
  (let [l2 (s/lower-case l)]
    (keyword l2)))

(defn score-word [w]
  (let [w2 (s/split w #"")]
    (apply + (map values (map score-key w2)))))
