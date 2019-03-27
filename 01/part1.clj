(require '[clojure.string])

(defn sum [xs] (reduce + xs))
(defn to-int [xs] (map read-string xs))
(defn split [s] (clojure.string/split s #"\n"))

(def compute-frequency (comp sum to-int split slurp))

(println (compute-frequency "input"))
