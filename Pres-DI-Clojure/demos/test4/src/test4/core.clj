(ns test4.core)

(defn finder [key] (str "value from the db")) ;; very complex finder
(defn pretty-printer [value] (str "This is a " value)) 


;;(defn -main [& args]
;;  (pretty-printer (finder "Alice"))
 
(defn -main [& args]
  (let [value (finder "Alice")]
	(pretty-printer value) )) 
 
