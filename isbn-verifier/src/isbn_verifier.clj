(ns isbn-verifier)

(defn isbn? [isbn] ;; <- arglist goes here
  ;; your code goes here
)

(x1 * 10 + x2 * 9 + x3 * 8 + x4 * 7 + x5 * 6 + x6 * 5 + x7 * 4 + x8 * 3 + x9 * 2 + x10 * 1) mod 11 == 0

(defn isbnn [coll]
  (loop [coll coll
         acc []]
    (if (empty? coll)
      acc
      (recur (rest coll) (conj acc (* (dec 10) (first coll)))))))

(map #(* (dec 3) %) [1 1 1])
