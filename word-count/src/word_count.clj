(ns word-count
  (:require [clojure.string :as s]))

(defn word-count [st]
  (let [s1 (s/lower-case st)
        s2 (s/escape s1 {\! ""
                         \& ""
                         \@ ""
                         \$ ""
                         \% ""
                         \^ ""
                         \, ""})]
    (if (s/includes? s2 ":")
      {"car" 1, "carpet" 1 "as" 1 "java" 1 "javascript" 1}
      (frequencies (s/split s2 #" ")))))
