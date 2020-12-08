# sql-formatter

A Clojure port of great SQL formatter https://github.com/vertical-blank/sql-formatter.


## Leiningen
```clojure
[caesarhu/sql-format "0.1.0"]
```

## Usage

```clojure
(require '[sql-formatter.core :refer [sql-format sql-command]])
```

### Functions

````clojure
(sql_formatter sql-str indent dialect) 

dialect: sql - Standard SQL - default
         n1ql - Couchbase N1QL
         db2 - IBM DB2
         pl/sql - Oracle PL/SQL
indent: spaces indent, default 2 spaces
sql-str: sql string to be format

(sql_formatter sql-str indent)

(sql_formatter sql-str)


(sql-command sql-v)

transform jdbc sql vector to pure string
example:
["SELECT a, b, c FROM foo WHERE f.a = ?" "baz"]
=> "SELECT a, b, c FROM foo WHERE f.a = 'baz'"
````

## License

Copyright © 2020

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
