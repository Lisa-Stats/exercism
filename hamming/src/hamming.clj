(ns hamming
  (:require [clojure.string :as s]
            [clojure.set :as sets]))

(defn distance [strand1 strand2] ; <- arglist goes here
  ;; your code goes here
)

(map keyword (s/split "GCC" #""))

(merge-with - (frequencies ["G" "G" "A" "C" "T" "G" "A"])
            (frequencies ["G" "G" "A" "C" "T" "G" "A"]))

(merge-with - (frequencies ["A" "C" "T"])
            (frequencies ["G" "G" "A"]))

(keys (select-keys (frequencies ["S" "S" "G" "D"])(keys (frequencies ["S" "L" "W"]))))

(keys (select-keys (frequencies ["S" "S" "G" "D"])(keys (frequencies ["S" "L" "W"]))))

(keys (apply dissoc (frequencies ["L" "W" "G" "G" "G"])(keys (frequencies ["S" "L" "W"]))))
