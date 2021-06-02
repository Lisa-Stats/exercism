(ns phone-number
  (:require [clojure.string :as s]))

(defn number [num-string] ;; <- arglist goes here
      ;; your code goes here
)

(defn area-code [num-string] ;; <- arglist goes here
  ;; your code goes here
)

(defn pretty-print [stringy]
  (if (s/starts-with? stringy "1")
    (apply str (rest (s/escape stringy {\- ""
                                        \. ""
                                        \  ""
                                        \+ ""})))
    (s/escape stringy {\- ""
                       \. ""
                       \  ""
                       \+ ""
                       \( ""})))

(defn phone [stringy]
  (if (s/starts-with? stringy "1")
    (apply str (rest (s/escape stringy {\- ""
                                       \. ""
                                       \  ""
                                       \+ ""})))
    (s/escape stringy {\- ""
                       \. ""
                       \  ""
                       \+ ""})))

(rest "123")
