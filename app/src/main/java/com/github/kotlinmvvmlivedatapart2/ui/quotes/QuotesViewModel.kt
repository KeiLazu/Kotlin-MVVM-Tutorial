package com.github.kotlinmvvmlivedatapart2.ui.quotes

import androidx.lifecycle.ViewModel
import com.github.kotlinmvvmlivedatapart2.data.Quote
import com.github.kotlinmvvmlivedatapart2.data.QuoteRepository


/**
 * Created by Kennix Lazuardi on 06 November 2018
 * You can contact me at : kennix.l@bridgetech.co.id
 * or see me @ https://github.com/KeiLazu
 * or here: https://bitbucket.org/KeiLazu/
 * -------------------------------------------------
 * com.github.kotlinmvvmlivedatapart2.ui.quotes
 * or see link for more detail https://gitlab.com/dev-bridgetech-mutiara-farma/mutiara-farma-mobile
 */
class QuotesViewModel(private val quoteRepository: QuoteRepository)
    : ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
}