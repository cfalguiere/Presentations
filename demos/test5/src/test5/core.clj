(ns test5.core)

(defn finder [key] (str "value from the db")) ;; very complex finder
(defn pretty-printer [finder key] (str "This is a " (finder key)))

(def all-in-one-printer (partial pretty-printer finder)) 

(defn -main [& args]
   (all-in-one-printer "Alice"))
 
