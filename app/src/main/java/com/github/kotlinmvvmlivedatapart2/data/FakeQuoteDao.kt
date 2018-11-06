package com.github.kotlinmvvmlivedatapart2.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData


/**
 * Created by Kennix Lazuardi on 06 November 2018
 * You can contact me at : kennix.l@bridgetech.co.id
 * or see me @ https://github.com/KeiLazu
 * or here: https://bitbucket.org/KeiLazu/
 * -------------------------------------------------
 * com.github.kotlinmvvmlivedatapart2.data
 * or see link for more detail https://gitlab.com/dev-bridgetech-mutiara-farma/mutiara-farma-mobile
 */
class FakeQuoteDao {
    // A fake database table
    private val quoteList = mutableListOf<Quote>()
    // MutableLiveData is from the Architecture Components Library
    // LiveData can be observed for changes
    private val quotes = MutableLiveData<List<Quote>>()

    init {
        // Immediately connect the now empty quoteList
        // to the MutableLiveData which can be observed
        quotes.value = quoteList
    }

    fun addQuote(quote: Quote) {
        quoteList.add(quote)
        // After adding a quote to the "database",
        // update the value of MutableLiveData
        // which will notify its active observers
        quotes.value = quoteList
    }

    // Casting MutableLiveData to LiveData because its value
    // shouldn't be changed from other classes
    fun getQuotes() = quotes as LiveData<List<Quote>>
}