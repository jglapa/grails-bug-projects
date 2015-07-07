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

Error:
`
Error executing script DbmStatus: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'grailsApplication': Bean instantiation via constructor failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.codehaus.groovy.grails.commons.DefaultGrailsApplication]: Constructor threw exception; nested exception is org.codehaus.groovy.grails.exceptions.GrailsConfigurationException: Class not found loading Grails application: changelog-1.1 (Use --stacktrace to see the full trace)
`
