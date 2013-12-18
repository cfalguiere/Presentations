(ns test6.core)

(defn finder [dbname key] (str "value from the db " dbname)) 
(defn pretty-printer [finder key] (str "This is a " (finder key)))

(defn -main [& args]
  (let [dbname "DBProd"
	all-in-one-printer (partial pretty-printer (partial finder dbname))]  
   (all-in-one-printer "Alice") ))
 
