(defproject caesarhu/sql-formatter "0.1.0"
  :description "A Clojure port of great SQL formatter https://github.com/vertical-blank/sql-formatter."
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [com.github.vertical-blank/sql-formatter "1.0.3"]]
  :repl-options {:init-ns sql-formatter.core})
