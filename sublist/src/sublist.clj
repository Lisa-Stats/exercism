(ns sublist
  (:require [clojure.set :as s]))

(defn sublist1 [list1]
  (into #{} list1))

(defn sublist2 [list2]
  (into #{} list2))


(defn classify [list1 list2]
  (cond
    (= true (= (sublist1 list1) (sublist2 list2))) :equal
    (= true (s/subset? (sublist1 list1) (sublist2 list2))) :sublist
    (= false (s/subset? (sublist1 list1) (sublist2 list2))) :superlist
    :else :unequal))

(s/subset? #{1 2} #{1 2 3})
