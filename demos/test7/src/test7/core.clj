(ns test7.core)

(def config { :dbname "DBProd" })

(defn finder [key] (str "value from db " (config :dbname))) 
(defn pretty-printer [finder key] (str "This is a " (finder key)))

(defn -main [& args]
  (let [printer (partial pretty-printer finder)]  
   (printer "Alice") ))
 
