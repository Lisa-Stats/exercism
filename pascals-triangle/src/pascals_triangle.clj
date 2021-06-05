(ns pascals-triangle)

(def triangle)

(defn row [] ;; <- arglist goes here
  ;; your code goes here
  )


  ;; r = current row number, c = current column number
  ;; r! / c!(r - c)!

  (defn factorial [r]
    (reduce * (range 1 (inc r))))

  (defn pascal [r c]
    (/ (factorial r) (* (factorial (- r c)) (factorial c))))
