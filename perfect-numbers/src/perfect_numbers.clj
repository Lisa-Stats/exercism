(ns perfect-numbers)

(defn divisor-sum [n]
  (if (neg? n)
    (throw (IllegalArgumentException.))
    (apply + (filter #(= 0 (mod n %)) (range 1 n)))))

(defn classify [n]
  (cond
    (= (divisor-sum n) n) :perfect
    (> (divisor-sum n) n) :abundant
    (< (divisor-sum n) n) :deficient
    :else :error))
