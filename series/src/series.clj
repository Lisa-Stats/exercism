(ns series
  (:require [clojure.string :as s]))

(defn slices [ls slice]
  (cond
    (empty? ls) []
    (= 0 slice) [""]
    (< (count ls) slice) []
    (= (count ls) slice) [ls]
    :else (map s/join (partition slice 1 ls))))
