(ns test6.core)

(defn finder [dbname key] (str "value from db " dbname)) 
(defn pretty-printer [finder key] (str "This is a " (finder key)))

(defn -main [& args]
  (let [dbname "DBProd"
	printer (partial pretty-printer (partial finder dbname))]  
   (printer "Alice") ))
 
