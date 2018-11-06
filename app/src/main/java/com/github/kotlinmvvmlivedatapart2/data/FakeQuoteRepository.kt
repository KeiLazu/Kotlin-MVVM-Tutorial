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
class QuoteRepository private constructor(private val quoteDao: FakeQuoteDao) {

    // This may seem redundant.
    // Imagine a code which also updates and checks the backend.
    fun addQuote(quote: Quote) {
        quoteDao.addQuote(quote)
    }

    fun getQuotes() = quoteDao.getQuotes()

    companion object {
        // Singleton instantiation you already know and love
        @Volatile private var instance: QuoteRepository? = null

        fun getInstance(quoteDao: FakeQuoteDao) =
            instance ?: synchronized(this) {
                instance ?: QuoteRepository(quoteDao).also { instance = it }
            }
    }
}