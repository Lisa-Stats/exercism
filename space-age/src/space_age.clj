(ns space-age)

(defn on-mercury [seconds]
  (let [default (* 31557600 0.2408467)]
    (Double. (format "%.2f" (/ seconds default)))))

(defn on-venus [seconds]
  (let [default (* 31557600 0.61519726)]
    (Double. (format "%.2f" (/ seconds default)))))

(defn on-earth [seconds]
  (Double. (format "%.2f" (/ seconds 31557600.0))))

(defn on-mars [seconds]
  (let [default (* 31557600 1.8808158)]
    (Double. (format "%.2f" (/ seconds default)))))

(defn on-jupiter [seconds]
  (let [default (* 31557600 11.862615)]
    (Double. (format "%.2f" (/ seconds default)))))

(defn on-saturn [seconds]
  (let [default (* 31557600 29.447498)]
    (Double. (format "%.2f" (/ seconds default)))))

(defn on-neptune [seconds]
  (let [default (* 31557600 164.79132)]
    (Double. (format "%.2f" (/ seconds default)))))

(defn on-uranus [seconds]
  (let [default (* 31557600 84.016846)]
    (Double. (format "%.2f" (/ seconds default)))))
