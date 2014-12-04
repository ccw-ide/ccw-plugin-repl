(ns repl-keybindings
  "Command(s) for working with the REPL"
  (:require [ccw.api.repl :as repl]
            [ccw.e4.dsl   :refer :all]))
 

(defcommand reset-components "Reset Components System" "Cmd+R R"
  [] (repl/send '(user/reset)))

(defcommand switch-to-repl "Switch to the REPL View" "Cmd+R S"
  [] (repl/show-repl))
