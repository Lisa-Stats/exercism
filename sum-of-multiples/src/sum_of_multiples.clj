(ns sum-of-multiples)

(defn sum-of-multiples [coll mn]
  (apply + (into #{} (mapcat #(range % mn %) coll))))

(defn sum-of-multiple [div-list num]
  (->> (range num)
       (filter (fn [n] (some #(zero? (rem n %)) div-list)))
       (reduce + 0)))
