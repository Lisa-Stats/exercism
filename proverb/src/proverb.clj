(ns proverb)

(defn recite [] ;; <- arglist goes here
    ;; your code goes here
)

(for [x '("nail")
      :let [y (first x)]]
  y)

(doseq [x1 ["nail" "shoe"]
        x2  ["nail" "shoe"]
        :let [y (first ["nail" "shoe"])]]
  (println "for want of a" x1 "the" x2 "was lost")
  (println "all for want of a" y))

(second '("hello" "there"))

(first ["hey" "three"])
