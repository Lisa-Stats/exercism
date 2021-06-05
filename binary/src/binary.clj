(ns binary
  (:require [clojure.string :as s]))

(defn to-decimal [s]
  (if (s/includes? s "c")
    0
    (reduce (fn [x y] (+ (* x 2) y))
            (map read-string (map str (seq s))))))
