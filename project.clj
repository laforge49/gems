(defproject gems "0.1.0-SNAPSHOT"
  :description "An application framework with support for interchanges, roles, order and aggregation."
  :url "https://github.com/laforge49/gems"
  :license {:name "APACHE LICENSE, VERSION 2.0"
            :url "https://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [org.clojure/core.async "1.3.618"]
                 [tupelo "21.07.08"]]
  :main ^:skip-aot ae.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
