# sql-formatter

A Clojure port of great SQL formatter https://github.com/vertical-blank/sql-formatter.


## Leiningen
[caesarhu/sql-format "0.1.0"]

## Usage

(require '[caesarhu/sql-format.core :refer [sql-format sql-command]])

### Functions

`(sql-format sql-str) : format sql-str to sql great format`

`(sql-command sql-vector) : transform jdbc sql vector to string`

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
