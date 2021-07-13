(ns say
  (:require [clojure.pprint :refer [cl-format]]
            [clojure.string :as s]))

(defn number [num]
  (if (<= 0 num 999999999999)
    (s/replace
     (cl-format false "~R" num)
     "," "")
    (throw (IllegalArgumentException.))))
