(ns learn-shell.core
  (:import (java.io InputStreamReader BufferedReader))
  (:use [clojure.java.shell :only [sh]]))

(sh "C:\\Users\\xuey\\Desktop\\cmder\\vendor\\msysgit\\bin\\ls.exe" "-al")

(sh "C:\\Program Files (x86)\\Internet Explorer\\iexplore.exe")

(sh "C:\\Users\\xuey\\Desktop\\cmder\\vendor\\msysgit\\bin\\cat.exe" "C:\\Users\\xuey\\a.txt")

(.exec (Runtime/getRuntime) "C:\\Program Files (x86)\\Internet Explorer\\iexplore.exe")


(to-array ["C:\\Users\\xuey\\Desktop\\cmder\\vendor\\msysgit\\bin\\cat.exe" "C:\\Users\\xuey\\a.txt"])


(.exitValue (.exec (Runtime/getRuntime) (into-array ["C:\\Users\\xuey\\Desktop\\cmder\\vendor\\msysgit\\bin\\cat.exe"
                                      "C:\\Users\\xuey\\a.txt"])))


(.readLine (BufferedReader. (InputStreamReader. (.getInputStream (.exec (Runtime/getRuntime)
                        "C:\\Users\\xuey\\Desktop\\cmder\\vendor\\msysgit\\bin\\ls.exe -al")))))

(let [r (BufferedReader. (InputStreamReader. (.getInputStream (.exec (Runtime/getRuntime)
                                                                     "C:\\Users\\xuey\\Desktop\\cmder\\vendor\\msysgit\\bin\\ls.exe -al"))))]
  (while (println (.readLine r))))