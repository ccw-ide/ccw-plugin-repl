(ns nrepl-spit-port
  "Adds two listeners to nrepl server launched events.
   'spit-globally spits the nrepl port to ~/.nrepl file
   'spit-per-project spits the nrepl port to the corresponding
   project's folder in an .nrepl file"
  (:require [ccw.core.launch :as l]
            [clojure.java.io :as io]
            [ccw.eclipse     :as e]))
 
(defn spit-globally
  "global ~/.nrepl file"
  [{:keys [event-type port project]}]
  (when (= :creation event-type)
    (spit (io/file (java.lang.System/getProperty "user.home") ".nrepl")
          (str port))))
 
(defn spit-per-project
  "per-project .nrepl file, or defaults to globally if no project"
  [{:keys [event-type port project] :as m}]
  (when (and (= :creation event-type) project)
    (spit (io/file (e/project project) ".nrepl")
          (str port))))
  
(swap! l/nrepl-servers-listeners
       assoc
       :spit-globally #'spit-globally
       :spit-per-project #'spit-per-project)
