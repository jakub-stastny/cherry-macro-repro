(ns my-footer
  (:require-macros [macros :as m]))

;; npx cherry compile src/components/my-footer.cljs
;; Error: The "path" argument must be of type string or an instance of Buffer or URL. Received null
(m/simple-macro)

;; npx cherry compile src/components/my-footer.cljs
;; Error: The "path" argument must be of type string or an instance of Buffer or URL. Received null
;; (m/create-class MyClass)
