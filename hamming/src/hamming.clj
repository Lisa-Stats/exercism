(ns hamming
  (:require [clojure.data :as d]))

(defn distance [strand1 strand2]
  (if (not= (count strand1) (count strand2))
    nil
    (count (filter identity (first (d/diff (seq strand1) (seq strand2)))))))

(defn distance-two
  [a b]
  (when (= (count a) (count b))
    (count (filter false? (map = a b)))))
