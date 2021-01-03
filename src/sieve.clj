(ns sieve)

(defn sieve [end]
  (let [range- (range 2 (inc end))]
    (reduce
     (fn [acc n]
       (if (>= (* n n) end)
         acc
         (filter (fn [n-]
                   (if (= n n-)
                     true
                     (->> n (mod n-) pos?)))
                 acc)))
     range-
     range-)))

