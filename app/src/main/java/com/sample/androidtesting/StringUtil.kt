package com.sample.androidtesting

class StringUtil {
    companion object {
        fun countNoOfWords(text: CharSequence?): Int {
            val pattern = "\\s".toPattern()
            if (text == null || text.trim().isEmpty())
                return 0
            var noOfWords = 0
            for (word in text.split(pattern.toRegex())) {
                if (word.isNotEmpty()) {
                    noOfWords += 1
                }
            }
            return noOfWords
        }
    }
}