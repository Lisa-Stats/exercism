(ns triangle)

;;equilateral - all sides equal

;;isosceles - 2 or more sides equal

;;scalene - no sides equal

;;valid triangle - all sides greater length than 0 and
;; - sum of the length of any 2 sides must be greater than or equal to the length of the third side (how to iterate through it and not hard code it?)

;;input - multiple args -> 3 numbers
;;- comparing the numbers
;;- always the same amount - destructure?

;;output - true or false

(defn is-valid? [& args]
  (let [[a b c] args]
    (if (and (< 0 a) (< 0 b) (< 0 c)
             (>= (+ a c) b)
             (>= (+ a b) c)
             (>= (+ b c) a))
      true
      false)))

(defn equilateral? [& args]
  (let [[a b c] args]
    (if (is-valid? a b c)
      (= a b c)
      false)))

(defn isosceles? [& args]
  (let [[a b c] args]
    (if (is-valid? a b c)
      (or (= a b) (= b c) (= a c))
      false)))

(defn scalene? [& args]
  (let [[a b c] args]
    (if (is-valid? a b c)
      (and (not= a b c) (not= a b) (not= a c) (not= b c))
      false)))
