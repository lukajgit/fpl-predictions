(defproject fpl-predictions "0.1.0-SNAPSHOT"
  :description "Application for making predictions in Fantasy Premier league for educational purposes"
  :url "https://github.com/lukajgit/fpl-predictions"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [ring "1.9.5"]
                 [ring-server "0.5.0"]
                 [compojure "1.6.2"]
                 [ring/ring-defaults "0.3.3"]
                 [clj-http "3.12.3"]
                 [cheshire "5.10.2"]
                 [de.ubercode.clostache/clostache "1.4.0"]]
  :plugins [[lein-ring "0.12.6"]]
  :ring {:handler fpl-predictions.core/-main
         :port 8080}
  :main ^:skip-aot fpl-predictions.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
