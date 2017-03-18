(require '[cljs.build.api :as b]
  'cljs.closure)

(def mods (cljs.closure/index-node-modules {:faunadb "1.0.0"}))

(println "MODS" mods)

(b/watch "src"
  {:output-to "main.js"
   :output-dir "out"
   :main 'fauna-module.core
   :infer-externs true
   :optimizations :none
   :verbose true
   :closure-warnings {:non-standard-jsdoc :off}
   ;:npm-deps {:faunadb "1.0.0"}
   :foreign-libs (into mods
                   [])
   })
