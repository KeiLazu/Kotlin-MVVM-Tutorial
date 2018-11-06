package com.github.kotlinmvvmlivedatapart2.ui.quotes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
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
class QuotesViewModelFactory(private val quoteRepository: QuoteRepository)
    : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return QuotesViewModel(quoteRepository) as T
    }
}