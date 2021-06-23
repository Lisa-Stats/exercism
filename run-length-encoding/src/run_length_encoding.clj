(ns run-length-encoding
  (:require [clojure.string :as s]))

(defn run-length-encode
  "encodes a string with run-length-encoding"
  [string]
  (s/escape (apply str
                   (interleave (vals (frequencies string))
                               (keys (frequencies string)))) {\1 ""}))

(defn get-digits [cipher-text]
  (let [d (s/split cipher-text #"[A-Z]")]
    (if (empty? d)
      ["1"]
      d)))

(defn create-map [cipher-text]
  (let [l (s/split cipher-text #"\d+")]
    (apply assoc {} (interleave (map #(Integer/parseInt %)
                                     (get-digits cipher-text))
                               (filter (complement s/blank?) l)))))


(defn run-length-decode
  "decodes a run-length-encoded string"
  [cipher-text]
  (if (s/blank? cipher-text)
    ""
    (apply str (mapcat #(repeat (first %) (second %)) (create-map cipher-text)))))





(re-seq #"[0-9]|[A-Z]" "2A3BC")


(partition-by identity "2A3B4C")

(seq "2A3B4C")

(s/split "2A3B4C" #"\d")
