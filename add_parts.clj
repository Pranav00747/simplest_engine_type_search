(defn set_logos_part_no_cpy[g & m]
  (.exist (file g))
  (.exist (file m)) 
  (set_click_listen_url "https://www.twitter.com/sundarpichai" (set_image g))
  (set_click_listen_url "https://www.twitter.com/satyanadella" (set_image m))
  )

(defn set_main[]
  (def g "Google.png")
  (def m "Microsoft.png")
  (set_logos_part_no_cpy g m))

(set_main)
