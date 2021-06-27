This project is created as a test task.

Short explanation of functionality:
1. Home screen with pagination support under recycler view
2. Search of photos
3. Photo info screen with high res photos.
4. CI through Circle CI. Unit test command

Architecture used:
MvVm through LiveData and ViewBinding. 
ViewBinding is more easy to set up. Databinding is not needed for this project.
LiveData is the best way to update UI with new data coming, as for me.
App structure in general: 

1. UI calls Repository. 
2. Repository calls Retrofit to gather data
3. Repository manages data, prepares, check it, etc
4. Returns value that is passed to ui

My choice of libararies and approaches:
1. DI through koin instead of dagger - for such small project runtime DI is best choice, cause manual testing is easy. 
Koin easy to setup, light and readable. With all the best support of android features
2. Naviagtion is made through android navigation as far as it is sugested approach, with safeArgs support
3. Networking through OkHttp + retrofit, nothing special
4. Request handle is throught coroutines instead of RxAndroid, because RxAndroid here will be overengineering. 
More code, but not more outcome. I prefer using it for projects where it already integrated, or complex projects.
5. Image loading - Picasso. Wanted to try something new, cause i work usually with Glide.
