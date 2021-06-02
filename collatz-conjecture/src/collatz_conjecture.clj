(ns collatz-conjecture)

(defn collatz [n]
  (if (or (neg? n) (zero? n))
    (throw (Throwable.))
    (count (take-while #(< 1 %) (iterate
                                 (fn [n] (if (even? n)
                                           (/ n 2)
                                           (+ (* n 3) 1))) n)))))
