(ns phone-number
  (:require [clojure.string :as s]))

(defn number [num-string]
  (let [str-apply (apply str (re-seq #"\d" num-string))
        str-apply2 (apply str (rest (re-seq #"\d" num-string)))
        str-apply-exch (str (first (second (partition-all 3 num-string))))
        str-neg "0000000000"]
    (cond
      (and (= 10 (count num-string)) (s/starts-with? num-string "0")) str-neg
      (and (= 10 (count num-string)) (s/starts-with? num-string "1")) str-neg
      (and (= 11 (count num-string)) (s/starts-with? num-string "1")) str-apply2
      (or (= 9 (count num-string)) (= 11 (count num-string))) str-neg
      (= "0" str-apply-exch) str-neg
      (= "1" str-apply-exch) str-neg
      :else str-apply
      )))

(defn area-code [num-string]
  (let [cleaned-str (apply str (re-seq #"\d" num-string))]
    (if (s/starts-with? num-string "1")
      (apply str (first (partition-all 3 (rest cleaned-str))))
      (apply str (first (partition-all 3 cleaned-str))))))

(defn start-code [num-string]
  (subs num-string 0 3))

(defn exchange-code [num-string]
  (subs num-string 3 6))

(defn end-code [num-string]
  (subs num-string 6 10))

(defn pretty-print [num-string]
  (let [cleaned-str (if (s/starts-with? num-string "1")
                      (apply str (rest (re-seq #"\d" num-string)))
                      (apply str (re-seq #"\d" num-string)))]
    (str "(" (start-code cleaned-str) ")" " " (exchange-code cleaned-str) "-" (end-code cleaned-str))))
