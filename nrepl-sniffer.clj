(ns nrepl-sniffer
  (:require [ccw.eclipse     :as e]
            [ccw.events      :as evt]
            [clojure.pprint  :as p]))
 
(defn collect-responses
  "reacts to nrepl received responses by displaying them in an annoying but
   didactic popup."
  [topic data]
  (e/info-dialog "nrepl response"
    (with-out-str (p/pprint data))))

(evt/subscribe :ccw.repl.response collect-responses)
