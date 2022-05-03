package com.example.gestioemocionalcat

import android.app.Activity
import android.app.Instrumentation
import android.content.Intent
import org.junit.Assert.*
import android.widget.EditText
import androidx.annotation.VisibleForTesting
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.intent.Intents.intended
import androidx.test.espresso.intent.Intents.intending
import androidx.test.espresso.intent.matcher.IntentMatchers.hasAction
import androidx.test.espresso.intent.matcher.IntentMatchers.hasData
import androidx.test.espresso.intent.rule.IntentsTestRule
import androidx.test.espresso.matcher.ViewMatchers.*
import org.hamcrest.Matchers.equalToIgnoringCase
import org.hamcrest.Matchers.not
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class RecursosTest {
    @get:Rule
    val intentsTestRule = IntentsTestRule(RecursosActivity::class.java)
    @Before
    fun setUp() {
        ActivityScenario.launch(RecursosActivity::class.java)
    }

    @Test
    fun num1OK() {
        onView(withId(R.id.bt_061)).perform(click())
        intended(hasAction(Intent.ACTION_DIAL))
        intended(hasData("tel:061"))
    }

    @Test
    fun num2OK() {
        onView(withId(R.id.bt_112)).perform(click())
        intended(hasAction(Intent.ACTION_DIAL))
        intended(hasData("tel:112"))
    }

    @Test
    fun num3OK() {
        onView(withId(R.id.bt_012)).perform(click())
        intended(hasAction(Intent.ACTION_DIAL))
        intended(hasData("tel:012"))
    }

}