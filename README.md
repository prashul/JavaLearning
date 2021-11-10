# JavaLearning

By default - Spring sets the default profile but if we provide different profiles like test , prod then we can specify which profile Spring should use
by specifying profiles in application.yml 

spring:
  profiles:
    active: test
    
application.yml application-prod.yml, application-test.yml

Current example uses test profile
