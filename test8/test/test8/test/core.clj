(ns test8.test.core
  (:use [test8.core])
  (:use [test8.fake])
  (:use [midje.sweet]))

(fact "it should display This is a"
      (pretty-printer "Bob") => "This is a fake value")

