;; # Namespace definition
;;
;; Define the module, and declare the dependencies. Use the standard ClojureScript modules
(ns solsort.apps.html5book
  (:require-macros
    [cljs.core.async.macros :refer  [go alt!]])
  (:require
    [reagent.ratom :as ratom :refer-macros [reaction]]
    [cljs.test :refer-macros  [deftest testing is run-tests]]
    [cljs.core.async :refer [>! <! chan put! take! timeout close!]]
    [re-frame.core :as re-frame :refer [subscribe register-sub register-handler dispatch dispatch-sync]]
    ))

(js/console.log :here)
