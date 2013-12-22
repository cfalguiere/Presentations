(ns test3.test.core
  (:use [test3.core])
  (:use [midje.sweet]))

(defn fake-finder [key] "fake value")

(fact "it should display This is a"
      (pretty-printer "Bob" fake-finder) => "This is a fake value")

