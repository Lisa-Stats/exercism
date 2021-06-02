(ns leap)

(defn leap-year? [year]
  (if (= 0 (mod year 4))
    (if (= 0 (mod year 100))
      (if (= 0 (mod year 400))
        true
        false)
      true)
    false))
