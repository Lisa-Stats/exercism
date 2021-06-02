(ns atbash-cipher
  (:require [clojure.string :as s]))

(defn encode [coll]
  (let [ls (s/lower-case coll)
        ls1 (s/escape ls  {\, "" \. ""})
        ls2 (s/escape ls1 {\ ""})]
    (s/join " " (map s/join (partition-all 5 (s/replace ls2 #"a|b|c|d|e|f|g|h|i|j|k|l|m|n|o|p|q|r|s|t|u|v|w|x|y|z" {"a" "z" "b" "y" "c" "x" "d" "w" "e" "v" "f" "u" "g" "t" "h" "s" "i" "r" "j" "q" "k" "p" "l" "o" "m" "n" "n" "m" "o" "l" "p" "k" "q" "j" "r" "i" "s" "h" "t" "g" "u" "f" "v" "e" "w" "d" "x" "c" "y" "b" "z" "a" }))))))
