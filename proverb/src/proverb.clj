(ns proverb
  (:require [clojure.string :as str]))

(defn phrase-create [phrase]
  (for [x (partition 2 1 phrase)
        :let [x1 (first x)
              x2 (second x)]]
    (str "For want of a " x1 " the " x2 " was lost.")))

(defn first-item [phrase]
  (first phrase))

(defn add-last-phrase [phrase]
  (conj (phrase-create phrase)
        (str "And all for the want of a " (first-item phrase) ".")))

(defn recite [phrase]
  (if (empty? phrase)
    ""
    (str/join "\n" (into []
                         (concat (rest (add-last-phrase phrase))
                                 [(first (add-last-phrase phrase))])))))
