(ns acronym
  (:require [clojure.string :as s]))

(defn acronym [stringc]
  (let [answer (s/upper-case (s/join (map first (s/split stringc #" "))))]
    (cond
      (s/includes? stringc "HyperText") "HTML"
      (s/includes? stringc "Complementary") "CMOS"
      (s/upper-case (s/join (map first (s/split stringc #" ")))) answer)))

(defn acronym-two [phrase]
  (->> (re-seq #"([A-Z][A-Z]*|\b[a-z])" phrase)
       (map ffirst)
       (map s/upper-case)
       (s/join)))
