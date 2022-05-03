package com.example.gestioemocionalcat

import org.junit.Assert.*
import android.widget.EditText
import androidx.annotation.VisibleForTesting
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.PositionAssertions.isAbove
import androidx.test.espresso.assertion.PositionAssertions.isBelow
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import org.hamcrest.Matchers.equalToIgnoringCase
import org.hamcrest.Matchers.not
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class AvaluacioTest1 {
    @Before
    fun setUp() {
        ActivityScenario.launch(AvaluacioActivity::class.java)
        onView(withText(R.string.dialog_dacord)).perform(click())
    }


    fun buttonOrderAval() {
        onView(withId(R.id.bt_resposta1)).check(isAbove(withId(R.id.bt_resposta2)))
        onView(withId(R.id.bt_resposta2)).check(isBelow(withId(R.id.bt_resposta1)))
        onView(withId(R.id.bt_resposta3)).check(isBelow(withId(R.id.bt_resposta2)))
        onView(withId(R.id.bt_resposta4)).check(isBelow(withId(R.id.bt_resposta3)))
    }

    @Test
    fun buttonOrder(){
        buttonOrderAval()

        onView(withId(R.id.bt_resposta1)).perform(click())
        onView(withId(R.id.aval2)).check(matches(isDisplayed()))

        buttonOrderAval()

        onView(withId(R.id.bt_resposta1)).perform(click())
        onView(withId(R.id.aval3)).check(matches(isDisplayed()))

        buttonOrderAval()
    }
}