(ns isbn-verifier
  (:require [clojure.string :as str]))

;;last digit is X or #
;;count is 10
;;butlast are numbers

(defn prelim-check [isbn]
  (let [isbn1 (str/escape isbn {\- ""})
        isbn2 (apply str (map str (butlast isbn)))]
    (if (str/ends-with? isbn1 "A")
      false
      (if (or (= 11 (count isbn1)) (= 10 (count isbn1)))
        (if (str/includes? isbn2 "A")
          false
          (if (str/includes? isbn2 "X")
            false
            (if (str/includes? isbn2 "K")
              false
              true)))
        false))))

(defn isbn? [isbn]
  (if (= true (prelim-check isbn))
    (if (str/ends-with? isbn "X")
      (let [isbnx (str/escape isbn {\- ""})
            isbnxx (apply str (map str (butlast isbnx)))
            isbnxxx (into [] (map #(Integer/parseInt %) (map str (seq isbnxx))))
            isbn4x (conj isbnxxx 10)]
        (= 0 (mod (apply +
                       (map * isbn4x (reverse (range 1 11))))
                  11)))
      (let [isbn1 (str/escape isbn {\- ""})
            isbn2 (map #(Integer/parseInt %) (map str (seq isbn1)))]
        (= 0 (mod (apply +
                         (map * isbn2 (reverse (range 1 11))))
                  11))))
    false))
