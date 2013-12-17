(ns test2.test.core
  (:use [test2.core])
  (:use [midje.sweet]))

(defn fake-finder [key] "fake value")

(fact "it should display This is a"
  (with-redefs [finder (fn [key] "fake value")] 
      (pretty-printer "Bob")) => "This is a fake value")

(fact "it should display This is a"
  (binding [finder fake-finder] 
      (pretty-printer "Bob")) => "This is a fake value")

