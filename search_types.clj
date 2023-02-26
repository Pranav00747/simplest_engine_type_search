;; It works simply pattern 


(defn search_btn[actual_search & search_type]
     (def astr "Google")
     (def bstr "Bing")
     (cond 
        (= search_type astr)(if(actual_search not= "")(trap_search(actual_search+pat_search)))
        (= search_type bstr)(if(actual_search not= "") (trap_search(actual_search+pat_search)))
     ))

(search_btn "Google Main Boss" "Google")
(search_btn "Microsoft Main Boss" "Microsoft")
