(ns test8.core
  (:use [test8 finder fake]) )

(defprotocol Finder
  (finder [this arg]))

(deftype FakeFinder []
  Finder
  (finder [this arg] (test8.fake/fake-finder arg)))

(deftype RealFinder []
  Finder
  (finder [this arg] (test8.finder/db-finder arg)))

(defn pretty-printer [value] (str "This is a "  value))

(defn -main [& args]
   (pretty-printer (finder (FakeFinder.) "Alice") ))
 
