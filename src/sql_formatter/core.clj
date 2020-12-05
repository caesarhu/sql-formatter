(ns sql-formatter.core
  (:require [clojure.string :as string]
            [clojure.spec.alpha :as s])
  (:import (com.github.vertical_blank.sqlformatter SqlFormatter)))

;;wrap strings in quotes
(defn sql-param
  ([param quote]
   (if (string? param)
     (str quote param quote)
     (str param)))
  ([param]
   (sql-param param "'")))

;;recursively get rid of those pesky "?" by replacing them
;;with the parameter list
(defn replace-params
  [sql-str params]
  (if (empty? params)
    sql-str
    (let [param (first params)
          new-str (string/replace-first sql-str #"\?" (sql-param param))]
      (recur new-str (rest params)))))

;;transform jdbc sql vector to pure string
(defn sql-command
  [sql-v]
  (replace-params (first sql-v) (rest sql-v)))

(defn sql-format
  "sql-str : sql string.
   indent  : format indent, defaults to two spaces.
   dialect : sql - Standard SQL
             n1ql - Couchbase N1QL
             db2 - IBM DB2
             pl/sql - Oracle PL/SQL"
  ([sql-str indent dialect]
   (.. SqlFormatter (of dialect) (format sql-str indent)))
  ([sql-str indent]
   (sql-format sql-str indent "sql"))
  ([sql-str]
   (sql-format sql-str "  " "sql")))
