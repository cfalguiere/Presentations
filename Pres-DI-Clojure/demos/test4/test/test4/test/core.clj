(ns test4.test.core
  (:use [test4.core])
  (:use [midje.sweet]))

(fact "it should display This is a"
      (pretty-printer "fake value") => "This is a fake value")

