(ns sublist
  (:require [clojure.set :as s]))

#_(defn sublist1 [list1]
  (into #{} list1))

#_(defn sublist2 [list2]
  (into #{} list2))

(defn check [vec1 vec2]
  (some #(= vec1 %)
        (partition (count vec1) 1 vec2)))

(defn classify [a b]
  (cond (and (= (count a) (count b)) (= a b)) :equal
        (and (> (count a) (count b)) (check b a)) :superlist
        (and (< (count a) (count b)) (check a b)) :sublist
        :else :unequal))

#_(defn classify2 [list1 list2]
  (cond
    (and (= true (= (sublist1 list1) (sublist2 list2)))) :equal
    (and (= true (s/subset? (sublist1 list1) (sublist2 list2)))) :sublist
    (and (= false (s/subset? (sublist1 list1) (sublist2 list2)))) :superlist
    :else :unequal))
