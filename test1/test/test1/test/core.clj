(ns test1.test.core
  (:use [test1.core])
  (:use [midje.sweet]))

(fact "it should display This is a"
  (pretty-printer "Bob") => "This is a fake value"
  (provided
   (finder) => (fn [key] "fake value") )) ;; test stub