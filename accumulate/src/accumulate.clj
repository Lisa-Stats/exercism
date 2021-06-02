(ns accumulate)

(defn accumulate [f coll]
  (loop [coll coll
         acc []]
    (if (empty? coll)
      acc
      (recur (rest coll) (conj acc (f (first coll)))))))
