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
data class Quote(val quoteText: String,
                 val author: String) {

    override fun toString(): String {
        return "$quoteText - $author"
    }
}