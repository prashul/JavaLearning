# JavaLearning

Service overview

<img width="891" alt="Screen Shot 2021-11-11 at 8 16 18 AM" src="https://user-images.githubusercontent.com/14214767/142384265-e084d30d-78d6-4b8e-8859-26311e9a8704.png">

Communication using Hard coded URL which is not recommended
1) Using Rest Template
2) Using WebClient

Using WebClient we can make use of asynchronous communication. 

Notes -
1) Never return List<Class> as JSON, as it can become backward incompatible if new attribute is introduced/removed. To avoid this we always wrap in a Class, which has member as List<Class>
  
