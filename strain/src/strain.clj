(ns strain)

(defn retain [pred? coll]
  (loop [coll coll
         acc []]
    (if (empty? coll)
      acc
      (if (pred? (first coll))
        (recur (rest coll) (conj acc (first coll)))
        (recur (rest coll) acc)))))

(defn discard [pred? coll]
  (loop [coll coll
         acc []]
    (if (empty? coll)
      acc
      (if (pred? (first coll))
        (recur (rest coll) acc)
        (recur (rest coll) (conj acc (first coll)))))))
