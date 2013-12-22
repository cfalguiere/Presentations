(ns test7.test.core
  (:use [test7.core])
  (:use [midje.sweet]))

(defn fake-printer [key] "fake value")
     
(fact "it should display This is a"
      (pretty-printer fake-printer "Bob") => "This is a fake value")

