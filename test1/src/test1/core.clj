(ns test1.core)

(defn write-log [] #(spit "data.log" %))   ;; fonction &agrave; stubber
(defn log [string] ((write-log) string)) ;; fonction &agrave; tester

(defn -main [& args]
  (log "test"))