# TarifClub  😋

#  Screenhots 📷


####

# Package Structure  📜
            com.example.recipe    # Root Package

            ├── data                # For data handling.
            │  
            │   ├── remote          # Remote Data Handlers     
            |   │   ├── api         # Retrofit API for remote end point.
            │   └── repository      # Single source of data.
            |
            ├── model               # Model classes
            |
            ├── di                  # Dependency Injection                
            │   └── module          # DI Modules
            |
            ├── ui                  # Activity/View layer
            │   ├── base            # Base View
            │   ├── main            # Main Screen Activity & ViewModel
            |   │   ├── adapter     # Adapter for RecyclerView
            |   │   └── viewmodel   # ViewHolder for RecyclerView   
            │   └── details         # Detail Screen Activity and ViewModel
            |
            └── utils               # Utility Classes / Kotlin extensions

# Build With  🛠

| Library             | comment                                                                |
| ----------------- | ------------------------------------------------------------------ |
| [Kotlin](https://kotlinlang.org/) | First class and official programming language for Android development. |
| [Coroutines](https://tr.search.yahoo.com/search?fr=mcafee&type=E210TR91105G0&p=Coroutines) | For asynchronous and more.|
| [Android Architecture Components](https://tr.search.yahoo.com/search?fr=mcafee&type=E210TR91105G0&p=Android+Architecture+Components) |  Collection of libraries that help you design robust, testable, and maintainable apps. |
|-------->[LiveData](https://developer.android.com/topic/libraries/architecture/livedata) |Data objects that notify views when the underlying database changes.
--------->[ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel)|  Stores UI-related data that isn't destroyed on UI changes.
--------->[ViewBinding](https://developer.android.com/topic/libraries/view-binding) | Generates a binding class for each XML layout file present in that module and allows you to more easily write code that interacts with views.
-----------> [Room](https://developer.android.com/topic/libraries/architecture/room) | SQLite object mapping library.
[Retrofit](https://square.github.io/retrofit/) | A type-safe HTTP client for Android and Java.
[Moshi](https://github.com/square/moshi)  |A modern JSON library for Kotlin and Java.

# Developed By 😎
