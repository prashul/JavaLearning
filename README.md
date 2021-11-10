# JavaLearning

By default - Spring sets the default profile but if we provide different profiles like test , prod then we can specify which profile Spring should use
by specifying profiles in application.yml 

spring:
  profiles:
    active: test
    
application.yml application-prod.yml, application-test.yml

Current example uses test profile


<img width="430" alt="Screen Shot 2021-11-10 at 11 12 55 AM" src="https://user-images.githubusercontent.com/14214767/141178186-ac6de99d-ce39-4c5a-a350-02b48a415094.png">

we can set the profiles from the command line
<img width="726" alt="Screen Shot 2021-11-10 at 11 13 44 AM" src="https://user-images.githubusercontent.com/14214767/141178192-55e5db8f-e5ef-4f4d-b6f6-3b377c4ffdd4.png">

Different beans can also be instantiated depending on the profiles 

<img width="770" alt="Screen Shot 2021-11-10 at 11 14 59 AM" src="https://user-images.githubusercontent.com/14214767/141178362-ff4193e2-f5c7-42a5-b87a-ba5de9043f66.png">
