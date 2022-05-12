(ns fpl-predictions.core
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [fpl-predictions.service.players :as players]
            [fpl-predictions.service.api :as api])
  (:gen-class))

(defroutes app
           (GET "/" [] (api/player 4))
           (route/not-found "404 Not Found"))

((api/allData) :body)

(def -main
  (wrap-defaults app site-defaults))