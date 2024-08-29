(ns macros
  (:require [cherry.core :refer [defclass]]))

(defmacro create-class [class-name]
  `(defclass ~class-name))

;; (defmacro create-class [class-name]
;;   `(cherry.core/defclass ~class-name))

(defmacro simple-macro []
  `(prn :simple))
