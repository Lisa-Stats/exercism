(ns run-length-encoding)

(defn run-length-encode [string]
  (->> string
       (partition-by identity)
       (mapcat (juxt count first))
       (remove #{1})
       (apply str)))

(defn to-int [s]
  (Integer/parseInt s))

(defn run-length-decode [string]
  (->> string
       (re-seq #"(\d*)(\D)")
       (mapcat (fn [[_ cnt ltr]]
                 (if (= cnt "")
                   ltr
                   (repeat (to-int cnt) ltr))))
       (apply str)))
