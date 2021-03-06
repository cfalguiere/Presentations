(ns test2.test.core
  (:use [test2.core])
  (:use [clojure.test])
  (:use [midje.sweet]))

(defn fake-finder [key] "fake value")

(fact "it should display This is a"
  (with-redefs [finder fake-finder] 
      (pretty-printer "Bob")) => "This is a fake value")


(fact "it should use the fake finder"
  (binding [finder fake-finder] 
      (pretty-printer "Bob")) => "This is a fake value")

(deftest pretty-print-with-fake
  (is ( = "This is a fake value"
	  (binding [finder fake-finder] 
	    (pretty-printer "Bob")) )))


