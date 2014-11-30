(ns react-to-save
  (:require [ccw.eclipse     :as e]
            [ccw.events      :as evt]
            [clojure.pprint  :as p]
            [ccw.api.repl    :as repl]))
 
(defn on-saved-file
  "react to saved files by sneakily sending a noop clojure comment via the repl
   (if any) containing the namespace that the editor found the file corresponds to."
  [topic {:keys [namespace absolute-path repl] :as data}]
  (e/info-dialog "Saved data info"
    (with-out-str (p/pprint data)))
  (repl/send repl (str ";; the namespace is " namespace) false true false))

(evt/subscribe :ccw.editor.saved #'on-saved-file)
