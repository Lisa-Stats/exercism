(ns run-length-encoding
  (:require [clojure.string :as s]))

(defn run-length-encode
  "encodes a string with run-length-encoding"
  [string]
  (apply str (interleave (vals (frequencies string)) (keys (frequencies string)))))

(defn run-length-decode
  "decodes a run-length-encoded string"
  [cipher-text])

(read-string "BC")
