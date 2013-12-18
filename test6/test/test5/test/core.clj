(ns test6.test.core
  (:use [test5.core])
  (:use [midje.sweet]))

(defn fake-printer [key] "fake value")
     
(fact "it should display This is a"
      (pretty-printer fake-printer "Bob") => "This is a fake value")

