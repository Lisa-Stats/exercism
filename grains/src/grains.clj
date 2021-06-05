(ns grains)

(defn square [n]
  (last (last (sort (apply assoc {} (interleave
                                     (range 1 (+ 1 n))
                                     (iterate (fn [n]
                                                (+' n n)) 1)))))))

(defn total []
  (apply + (vals (sort (apply assoc {} (interleave
                                       (range 1 65)
                                       (iterate (fn [n]
                                                  (+' n n)) 1)))))))
