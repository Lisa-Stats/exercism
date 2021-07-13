(ns wordy
  (:require [clojure.string :as s]))

;;condp or case for words?

;;some to find when math sign is in string

(defn get-nums [text]
  (re-seq #"\d" text))

(defn get-math [text]
  (re-seq #"\w" text))

(if (= true (s/includes?  "What is 1 plus 1?" "plus"))
  (+ 2 1)
  :error)

(let [st  "What is 1 plus 1?"]
  (cond
    (s/includes? st "plus") (s/replace st #"plus" "+" )
    (s/includes? st "minus")(s/replace st #"minus" "-" )))

(let [st  "What is 1 + 1?"]
  (cond
    (s/includes? st "+") (map read-string (re-seq #"\d+" st))
    (s/includes? st "minus")(s/replace st #"minus" "-" )))

(defn build [txt]
  (map read-string (get-nums txt)))


(defn evaluate [text]
  (cond ))
