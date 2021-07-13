(ns triangle)

;;equilateral - all sides equal

;;isosceles - 2 or more sides equal

;;scalene - no sides equal

;;valid triangle - all sides greater length than 0 and
;; - sum of the length of any 2 sides must be greater than or equal to the length of the third side

;;input - multiple args -> 3 numbers
;;- comparing the numbers
;;- always the same amount - destructure?

;;output - true or false

(defn is-valid? [& args]
  )

(defn equilateral? [& args]
  (let [[a b c] args]
    (if (> 0.1 (or a b c))
      false
      (= a b c))))

(defn isosceles? [] ;; <- arglist goes here
  ;; your code goes here
)

(defn scalene? [] ;; <- arglist goes here
  ;; your code goes here
)

(= 2 2 2)
