#!/usr/bin/env nbb
;; nbb --classpath src:test test/run.cljs
(require '[clojure.test :as t] 'com-mapillary-graph-api.core-test)

(let [{:keys [fail error]} (t/run-tests 'com-mapillary-graph-api.core-test)]
  (js/process.exit (if (pos? (+ fail error)) 1 0)))
