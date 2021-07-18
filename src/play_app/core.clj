(ns play-app.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn add
  "Sums two numbers."
  [a b]
  (+ a b))

(defn ask []
  
  

;; (flush) is needed to display print values.
;; Otherwise the print value stays buffered until you hit enter.

 (do (println "What's your name? ") 
  
         (flush) 
  (let [answer (read-line)]
  (println (str "You typed \"" answer "\""))
;; What's your name? Clojure
;; "Clojure"
                                   )))