(ns react-to-save
  (:require [ccw.eclipse     :as e]
            [ccw.events      :as evt]
            [clojure.pprint  :as p]
            [ccw.api.repl    :as repl]
            [clojure.edn     :as edn]))
 
(defn on-saved-file
  "react to saved files by sneakily sending a noop clojure comment via the repl
   (if any) containing the namespace that the editor found the file corresponds to."
  [topic {repl :repl :keys [namespace absolute-path] :as data}]
  (repl/send repl (str ";; the namespace is " namespace))
  (repl/send repl (pr-str '(+ 3 4))))

(evt/subscribe :ccw.editor.saved #'on-saved-file)
