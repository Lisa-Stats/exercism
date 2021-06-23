(ns wordy
  (:require [clojure.string :as s]))

;;condp for words?

(defn get-nums [text]
  (re-seq #"\d" text))

(defn get-math [text]
  (re-seq #"\w+" text))

(defn evaluate [text]
  (cond ))
