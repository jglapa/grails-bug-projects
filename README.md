# Steps to reproduce
```
cd grails250-dbMigration-plugin-bug/

gvm u grails 2.4.5
grails clean-all
grails compile
grails dbm-status --plain-output

gvm u grails 2.5.0
grails set-grails-version 2.5.0
grails clean-all
grails compile
grails dbm-status --plain-output
```
