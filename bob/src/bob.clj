(ns bob
  (:require [clojure.string :as str]))

(defn response-for [s]
  (let [s2 (str/trim s)]
    (cond
      (str/includes? s2 "OK?") "Sure."
      (and (str/includes? s2 "A") (str/ends-with? s2 "?")) "Calm down, I know what I'm doing!"
      (str/includes? s2 "GO") "Whoa, chill out!"
      (str/ends-with? s2 "?") "Sure."
      (str/includes? s2 "A") "Whoa, chill out!"
      (empty? s2) "Fine. Be that way!"
      :else "Whatever.")))
