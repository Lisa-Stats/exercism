(ns grade-school)

(def db {})

(defn grade [db grade]
  (get db grade []))

;;this is good but does not convey meaning
(defn add [db name grade]
  (if (contains? db grade)
    (assoc db grade (conj (db grade) name))
    (assoc db grade [name])))

;;this is better b/c it is more idiomatic and conveys more meaning with the fnil
(defn add-fnil [db name grade]
  (update-in db [grade] (fnil conj []) name))

(defn add2 [db name grade]
  (update-in db [grade] concat [name]))

(defn sorted [db]
  (into {}
        (sort (for [[k v] db]
                [k (sort v)]))))

;; add name and grade to map with assoc
;; get students in a grade with get and use default value
;; sort map by names and grade with sort/juxt
;; -> use for/map to build map

;; if add '(if (true? (db grade))...' doesn't work but nil? does?
;;- data was not being stored into db b/c it was def'ed and data is immutable
;;-> have to redef it and then it works

;; futhermore, not a good idea to use '(= 0 (count db))' b/c we are looking for existence of grade and not just if something is in the db
