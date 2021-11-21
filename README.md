# JavaLearning

Service overview

<img width="891" alt="Screen Shot 2021-11-11 at 8 16 18 AM" src="https://user-images.githubusercontent.com/14214767/142384265-e084d30d-78d6-4b8e-8859-26311e9a8704.png">

Communication using Hard coded URL which is not recommended
1) Using Rest Template
2) Using WebClient

Using WebClient we can make use of asynchronous communication. 

Notes -
1) Never return List<Class> as JSON, as it can become backward incompatible if new attribute is introduced/removed. To avoid this we always wrap in a Class, which has member as List<Class>
  
<img width="498" alt="Screen Shot 2021-11-18 at 1 11 40 AM" src="https://user-images.githubusercontent.com/14214767/142760888-0563b520-605a-40af-bf09-aa1c62aa98b4.png">
<img width="446" alt="Screen Shot 2021-11-18 at 1 11 50 AM" src="https://user-images.githubusercontent.com/14214767/142760894-d07436d4-dcd9-4b5b-8232-408ab9827d2e.png">
<img width="452" alt="Screen Shot 2021-11-18 at 1 12 46 AM" src="https://user-images.githubusercontent.com/14214767/142760896-55845a1d-f975-4246-9814-c066df33ed4c.png">
