package com.example.gestioemocionalcat

import org.junit.Assert.*
import android.widget.EditText
import androidx.annotation.VisibleForTesting
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import org.hamcrest.Matchers.equalToIgnoringCase
import org.hamcrest.Matchers.not
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
class BasicTest {
    @Before
    fun setUp() {
        ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun checkRecursos(){
        onView(withId(R.id.bt_recursos)).perform(click())
        onView(withId(R.id.recurso)).check(matches(isDisplayed()))
    }


    @Test
    fun checkAval(){
        onView(withId(R.id.bt_avalua)).perform(click())
        onView(withText(R.string.dialog_dacord)).check(matches(isDisplayed()))
    }
}