(ns isogram
  (:require [clojure.string :as s]))

(defn isogram? [phrase]
  (let [p (s/escape phrase {\ ""
                            \- ""})
        p2 (s/lower-case p)]
    (if (every? #(= 1 %) (vals (frequencies p2)))
      true
      false)))
