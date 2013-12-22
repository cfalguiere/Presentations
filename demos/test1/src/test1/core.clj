(ns test1.core)

(defn finder [] #(str "value from db with " %)) 
(defn pretty-printer [key] (str "This is a " ((finder) key) ))

(defn -main [& args]
  (pretty-printer "Alice"))