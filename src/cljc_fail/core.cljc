#?(:clj
    (ns cljc-fail.core
      (:require [clojure.core.typed :as t])))

#(inc 'a)
; => (t/check-ns)
;Initializing core.typed ...
;Building core.typed base environments ...
;Finished building base environments
;"Elapsed time: 6214.616942 msecs"
;core.typed initialized.
;Start collecting cljc-fail.core
;WARNING: File for cljc-fail.core not found on classpath: cljc_fail/core.cljc
;Finished collecting cljc-fail.core
;Collected 1 namespaces in 114.423761 msecs
;WARNING: File for cljc-fail.core not found on classpath: cljc_fail/core.cljc
;WARNING: File for cljc-fail.core not found on classpath: cljc_fail/core.cljc
;Not checking cljc-fail.core (ns form missing)
;Checked 1 namespaces  in 120.673717 msecs
; :ok
