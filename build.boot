(set-env! :repositories [["clojars" {:url "https://clojars.org/repo/"
                                     :username (System/getenv "CLOJARS_USERNAME")
                                     :password (System/getenv "CLOJARS_PASSWORD")}]])

(task-options!
  push {:file "build/libs/avro-events-1.0.2.jar"
        :pom  "build/publications/mavenJava/pom-default.xml"
        :repo "clojars"})