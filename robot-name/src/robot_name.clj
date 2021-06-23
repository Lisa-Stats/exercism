(ns robot-name
  (:require [clojure.string :as str]))

(defn rand-str [len]
  (apply str (take len (repeatedly #(char (+ (rand 26) 65))))))

(def create-robot-name
  (apply str (rand-str 2) (apply str (repeatedly 3 #(rand-int 10)))))

(defn robot []
  create-robot-name)

(defn robot-name [robot]
  (repeatedly 2 robot))

(defn reset-name [robot] ;; <- arglist goes here
  ;; your code goes here
  )

(apply str (rand-str 2) (apply str (repeatedly 3 #(rand-int 10))))

(repeatedly 3 #(rand-int 1000))
