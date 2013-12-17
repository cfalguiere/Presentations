(ns test1.test.core
  (:use [test1.core])
  (:use [midje.sweet]))

(fact "it should spit out strings"
  (log "hello") => "hello"
  (provided
    (write-log) => (fn [data] data)))  ;; echo stub