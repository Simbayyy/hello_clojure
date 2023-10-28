(defproject hello_clojure "0.1.0-SNAPSHOT"
  :description "Sandbox project to get familiar with Clojure"
  :url "https://github.com/Simbayyy/hello_clojure"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [clj-http "2.0.0"]
                 [ring "1.10.0"]]
  :plugins [[lein-ring "0.12.6"]]
  :ring {:handler hello-clojure.core/handler}
  :profiles {:dev {:dependencies [[ring/ring-devel "1.4.0"]]}}
  :main hello-clojure.core
  :aot [hello-clojure.core])
