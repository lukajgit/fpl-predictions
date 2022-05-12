(ns fpl-predictions.service.api
  (:require [clj-http.client :as client]))

(defn allData []
  (client/get "https://fantasy.premierleague.com/api/bootstrap-static/" {:as :json}))

(defn fixtures []
  (client/get "https://fantasy.premierleague.com/api/fixtures/" {:as :json}))

(defn player [id]
  (client/get (str "https://fantasy.premierleague.com/api/element-summary/" id "/") {:as :json}))
