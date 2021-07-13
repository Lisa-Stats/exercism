(ns complex-numbers)

(defn real [[a b]])

(defn imaginary [[a b]] ;; <- arglist goes here
  ;; your code goes here
)

(defn abs [[a b]] ;; <- arglist goes here
  ;; your code goes here
)

(defn conjugate [[a b]] ;; <- arglist goes here
  ;; your code goes here
)

(defn add [[a b] [c d]]
  [(+ a c) (+ b d)])

(defn sub [[a b] [c d]]
  [(- a c) (- b d)])

(defn mul [[a b] [c d]]
  [(* a c) (* b d)])

(defn div [[a b] [c d]] ;; <- arglist goes here
  ;; your code goes here
)
