package com.sample.androidtesting

import android.content.res.Resources
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.filters.LargeTest
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@LargeTest
class MainActivityTest {
    @get:Rule
    var activityRule: ActivityScenarioRule<MainActivity> =
        ActivityScenarioRule(MainActivity::class.java)
    var resources: Resources = InstrumentationRegistry.getInstrumentation().targetContext.resources
    private lateinit var stringToBeChecked: String

    @Before
    fun getStringFromResources() {
        stringToBeChecked = resources.getString(R.string.string_to_be_tested)
    }

    @Test
    fun checkIfStringIsCorrect() {
        onView(withId(R.id.text_container)).check(matches(withText(stringToBeChecked)))
    }

    @Test
    fun checkIfWordCountIsCorrect(){
        onView(withId(R.id.word_count)).check(matches(withText(StringUtil.countNoOfWords(stringToBeChecked).toString())))
    }

}