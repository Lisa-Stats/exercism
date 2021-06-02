(ns nucleotide-count
  (:require [clojure.string :as str]))

(defn count-of-nucleotide-in-strand [nucleotide strand] ;; <- Arglist goes here
  ;; your code goes here
)


(defn nucleotide-counts [strand] ;; <- Arglist goes here
  ;; your code goes here
)

(map str/includes? "G" (str/split "GGGG" #""))

(keep #(= "G" %) (str/split "GGACG" #" "))
(flatten (str/split "GGGG" #""))

(into #{} (for [x "GAGCCTACTAACGGGAT"
                y "CATCGTAATGACGGCCT"]
            [x y]))

(defn same [coll1 coll2]
  (loop [coll1 coll1
         coll2 coll2
         acc []]
      (if (= coll1 coll2)
        (seq coll1)
        (recur (seq coll1) (+ 1 acc)))))
