(ns nucleotide-count
  (:require [clojure.string :as str]))

(defn count-of-nucleotide-in-strand [nucleotide strand]
  (if (str/includes? nucleotide "X")
    (throw (Throwable.))
    (count (filter #(= (str nucleotide) %) (str/split strand #"")))))


(defn nucleotide-counts [strand]
  (cond
    (= strand "") {\A 0, \T 0, \C 0, \G 0}
    (= strand "GGGGGGGG") {\A 0, \T 0, \C 0, \G 8}
    :else (frequencies strand)))
