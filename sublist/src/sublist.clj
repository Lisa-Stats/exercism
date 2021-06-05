(ns sublist
  (:require [clojure.set :as s]))

(defn sublist1 [list1]
  (into #{} list1))

(defn sublist2 [list2]
  (into #{} list2))

(defn checks
  [vec1 vec2]
  (if (or (some nil?
             (for [a vec1 b [vec2]]  (some #(= % a) b)))
       (some nil?
             (for [a vec2 b [vec1]]  (some #(= % a) b))))
    false
    true))


(defn classify [list1 list2]
  (cond
    (= true (= (sublist1 list1) (sublist2 list2))) :equal
    (= true (s/subset? (sublist1 list1) (sublist2 list2))) :sublist
    (= false (s/subset? (sublist1 list1) (sublist2 list2))) :superlist
    :else :unequal))
