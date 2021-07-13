(ns roman-numerals
  (:require [clojure.pprint :refer [cl-format]]))

(defn numerals [n]
  (cl-format false "~@r" n))
