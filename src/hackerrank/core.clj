(ns hackerrank.core
  (:gen-class)
  (:require [clojure.string :as string]))

(defn query-heap
  "Query a heap. From hackerrank data structures
  section. Not very performant."
  [h query]
  (let [[q v] query]
    (case q
          1 (swap! h conj v)
          2 (let [f (partial remove #{v})]
              (swap! h f))
          3 (do
              (println (apply min @h))
              h))))

(defn rotate
  "Rotates a collection to the left when positive, to the right otherwise."
  [n coll]
  (if (< n 0)
    (rotate (+ (count coll) n) coll)
    (let [n n
         m (- (count coll) n)
         head (take n coll)
         tail (take-last m coll)]
     (concat tail head))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
