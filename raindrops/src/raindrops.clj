(ns raindrops
  (:require [clojure.set :as s]))

(defn divisibles [n]
  (into #{} (filter #(= 0 (mod n %)) (range 1 20))))

(defn convert [n]
  (cond
    (= true (s/subset? #{3 5 7} (divisibles n))) "PlingPlangPlong"
    (= true (s/subset? #{3 5} (divisibles n))) "PlingPlang"
    (= true (s/subset? #{3 7} (divisibles n))) "PlingPlong"
    (= true (s/subset? #{5 7} (divisibles n))) "PlangPlong"
    (some #{3} (divisibles n)) "Pling"
    (some #{5} (divisibles n)) "Plang"
    (some #{7} (divisibles n)) "Plong"
    :else (str n))
  )
