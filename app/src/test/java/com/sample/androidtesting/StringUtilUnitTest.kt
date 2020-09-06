package com.sample.androidtesting

import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.*
import org.junit.Test

class StringUtilUnitTest{
    //Test function with null input
    @Test
    fun checkCountOfWordsForNullString(){
        val stringTobeTested: String? = null
        assertThat(StringUtil.countNoOfWords(stringTobeTested), `is`(0))
    }

    //Test function with empty string input
    @Test
    fun checkCountOfWordsForEmptyString(){
        val stringTobeTested = ""
        assertThat(StringUtil.countNoOfWords(stringTobeTested), `is`(0))
    }

    //Test function with string which contains only white space
    @Test
    fun checkCountOfWordsForStringWithWhiteSpaces(){
        val stringTobeTested = " "
        assertThat(StringUtil.countNoOfWords(stringTobeTested), `is`(0))
    }

    //Test function with a single word and lots of white spaces
    @Test
    fun checkCountOfWordsForStringWithWhiteSpacesAndSingleWord(){
        val stringTobeTested = " Buyakasha  "
        assertThat(StringUtil.countNoOfWords(stringTobeTested), `is`(1))
    }

    //Test function with string that contains 4 words
    @Test
    fun checkCountOfWordsForString_with4words(){
        val stringTobeTested = " Buyakasha   wazza my amigos"
        assertThat(StringUtil.countNoOfWords(stringTobeTested), `is`(4))
    }
}