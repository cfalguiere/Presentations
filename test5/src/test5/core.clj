(ns test5.core)

(defn finder [key] (str "value from the db")) ;; very complex finder
(defn pretty-printer [finder key] (str "This is a " (finder key))) 
(defn all-in-one [key] (partial pretty-printer finder)) 


(defn -main [& args]
  (println (all-in-one "Alice")))
 
