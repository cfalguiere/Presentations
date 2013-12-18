(ns test3.core)

(defn finder [key] (str "value from the db")) ;; very complex finder
(defn pretty-printer [key finder] (str "This is a " (finder key) )) 


(defn -main [& args]
  (pretty-printer "Alice" finder))

