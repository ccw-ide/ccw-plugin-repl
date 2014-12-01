(ns repl-keybindings
  "Command(s) for working with the REPL"
  (:require [ccw.api.repl :as repl]
            [ccw.e4.dsl   :refer :all]))
 
(defcommand reset-components "Reset Components System")
(defkeybinding reset-components "Cmd+U R")
(defhandler reset-components (fn [_] (repl/send '(user/reset))))
