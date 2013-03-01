(defproject ciir/doxim "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :jvm-opts ["-Dfile.encoding=UTF-8" "-Xmx1900m"]
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.clojure/data.csv "0.1.2"]
                 [org.clojure/math.combinatorics "0.0.2"]
		 [ciir/utils "1.0.0-SNAPSHOT"]                 
                 [jaligner "1.0"]
                 [org.lemurproject.galago/core "3.4"]]
  :main ciir.doxim)
