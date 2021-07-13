(ns beer-song
  (:require [clojure.string :as s]))

(defn verse
  "Returns the nth verse of the song."[n]
  (cond
    (= 0 n) "No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.\n"
    (= 1 n) "1 bottle of beer on the wall, 1 bottle of beer.\nTake it down and pass it around, no more bottles of beer on the wall.\n"
    :else   (str n " bottles of beer on the wall, " n " bottles of beer.\nTake one down and pass it around, " (dec n) " " (if (= 1 (dec n))
                                                  "bottle"
                                                  "bottles") " of beer on the wall.\n")))

(defn sing
  "Given a start and an optional end, returns all verses in this interval. If
  end is not given, the whole song from start is sung."
  ([start] (sing start 0))
  ([start end]
   (->> (range start (dec end) -1)
        (map verse)
        (s/join "\n"))))

;;fixed number - use range
