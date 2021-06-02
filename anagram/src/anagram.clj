(ns anagram
  (:require [clojure.string :refer [lower-case]]))

(defn anagram? [word1 word2]
  (let [w1 (lower-case word1)
        w2 (lower-case word2)]
    (and (not= w1 w2)
         (= (frequencies w1)
            (frequencies w2)))))

(defn anagrams-for [word prospect-list]
  (filter #(anagram? word %) prospect-list)
  )
