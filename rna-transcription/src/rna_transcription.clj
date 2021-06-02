(ns rna-transcription
  (:require [clojure.string :as str]))

(defn to-rna [dna]
  (if (str/includes? dna "X")
    (throw (AssertionError.))
    (str/replace dna #"G|C|T|A" {"G" "C" "C" "G" "T" "A" "A" "U"}))
)
