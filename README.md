# SleepTracker
Android SleepTracker App (This is currently a work in progress)

An application to track user sleep patterns written in Kotlin. 

This applicaiton uses an MVVM design architecture with Android Jetpack Navigation + Fragments for the core functionality and UI respectively. 
To complement these design choices, I added SafeArgs for easier and safer navigation actions and Timber for easier logging.

User sleep data will be stored in a Room database which in turn will be accessed using Android Coroutines to interact with the local database without freezing the UI.

I have plans to integrate some Android Material design UI tips and transitions between fragments. 

NOTE: No assets used in this application belong to me, they are simply included for use in this personal project which will not be sold or marketed for profit in any way.
