(ns nrepl-sniffer
  (:require [ccw.eclipse     :as e]
            [ccw.events      :as evt]
            [clojure.pprint  :as p]))
 
(defn
  collect-responses
  [topic data]
  (e/info-dialog "nrepl response"
    (with-out-str (p/pprint data))))

(evt/subscribe :ccw.repl collect-responses)
