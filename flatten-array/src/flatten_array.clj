(ns flatten-array)

(defn flatten [arr]
  (mapcat flatten arr))

(comment

  (defn flat [ls]
    (if (coll? ls)
      (mapcat flat ls)
      (list ls)))

  (defn flatt [ls]
    (mapcat flatt ls))

  )
