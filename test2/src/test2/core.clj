(ns test2.core)

(defn ^:dynamic finder [key] (str "value from the db")) ;; very complex finder
(defn pretty-printer [key] (str "This is a " (finder key) )) 


(defn -main [& args]
  (pretty-printer "Alice"))

