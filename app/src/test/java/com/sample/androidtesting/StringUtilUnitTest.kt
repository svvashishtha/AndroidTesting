package com.sample.androidtesting

import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.*
import org.junit.Test

class StringUtilUnitTest{
    @Test
    fun checkCountOfWordsForNullString(){
        val stringTobeTested: String? = null
        assertThat(StringUtil.countNoOfWords(stringTobeTested), `is`(0))
    }

    @Test
    fun checkCountOfWordsForEmptyString(){
        val stringTobeTested = ""
        assertThat(StringUtil.countNoOfWords(stringTobeTested), `is`(0))
    }

    @Test
    fun checkCountOfWordsForStringWithWhiteSpaces(){
        val stringTobeTested = " "
        assertThat(StringUtil.countNoOfWords(stringTobeTested), `is`(0))
    }

    @Test
    fun checkCountOfWordsForStringWithWhiteSpacesAndSingleWord(){
        val stringTobeTested = " Buyakasha  "
        assertThat(StringUtil.countNoOfWords(stringTobeTested), `is`(1))
    }
    @Test
    fun checkCountOfWordsForString_with4words(){
        val stringTobeTested = " Buyakasha   wazza my amigos"
        assertThat(StringUtil.countNoOfWords(stringTobeTested), `is`(4))
    }
}