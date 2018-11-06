package com.github.kotlinmvvmlivedatapart2.data


/**
 * Created by Kennix Lazuardi on 06 November 2018
 * You can contact me at : kennix.l@bridgetech.co.id
 * or see me @ https://github.com/KeiLazu
 * or here: https://bitbucket.org/KeiLazu/
 * -------------------------------------------------
 * com.github.kotlinmvvmlivedatapart2.data
 * or see link for more detail https://gitlab.com/dev-bridgetech-mutiara-farma/mutiara-farma-mobile
 */
class FakeDatabase {
    // All the DAOs go here!
    var quoteDao = FakeQuoteDao()
        private set

    companion object {
        // @Volatile - Writes to this property are immediately visible to other threads
        @Volatile private var instance: FakeDatabase? = null

        // The only way to get hold of the FakeDatabase object
        fun getInstance() =
        // Already instantiated? - return the instance
        // Otherwise instantiate in a thread-safe manner
            instance ?: synchronized(this) {
                // If it's still not instantiated, finally create an object
                // also set the "instance" property to be the currently created one
                instance ?: FakeDatabase().also { instance = it }
            }
    }
}