(ns fauna-module.core
  (:require ;faunadb
    ;[calculator :as calc]
    faunadb
    ))

(enable-console-print!)

(set! *warn-on-infer* true)

(def serverKey "fnACO-Y3xKAABJc-dhhmEyhwczj6H6hFSETaRtt0")

(defn -main [& args]
  (println "Hello faunadb!")
  ;(print "js/calc:" (calc/add 1 1))
  ;(let [client (new js/faunadb.Client #js {:secret serverKey})]
  ;  (print client)
  ;  )
  ;(print js/faunadb)
  )

(-main)

