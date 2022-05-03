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

class AvaluacioTest2 {
    @Before
    fun setUp() {
        ActivityScenario.launch(AvaluacioActivity::class.java)
        onView(withText(R.string.dialog_dacord)).perform(click())
    }

    @Test
    fun test1(){

        onView(withId(R.id.bt_resposta4)).perform(click())
        onView(withId(R.id.aval2)).check(matches(isDisplayed()))

        onView(withId(R.id.bt_resposta4)).perform(click())
        onView(withId(R.id.aval3)).check(matches(isDisplayed()))

        onView(withId(R.id.bt_resposta4)).perform(click())
        onView(withId(R.id.avalEnd)).check(matches(isDisplayed()))

        onView(withId(R.id.tv_resultat)).check(matches(withText("Sembla que no estàs bé psicològicament, et recomanem rebre ajuda professional.")))


    }

    @Test
    fun test2(){

        onView(withId(R.id.bt_resposta3)).perform(click())
        onView(withId(R.id.aval2)).check(matches(isDisplayed()))

        onView(withId(R.id.bt_resposta3)).perform(click())
        onView(withId(R.id.aval3)).check(matches(isDisplayed()))

        onView(withId(R.id.bt_resposta3)).perform(click())
        onView(withId(R.id.avalEnd)).check(matches(isDisplayed()))

        onView(withId(R.id.tv_resultat)).check(matches(withText("Sembla que no estàs bé psicològicament, et recomanem rebre ajuda professional.")))


    }


    @Test
    fun test3(){

        onView(withId(R.id.bt_resposta2)).perform(click())
        onView(withId(R.id.aval2)).check(matches(isDisplayed()))

        onView(withId(R.id.bt_resposta2)).perform(click())
        onView(withId(R.id.aval3)).check(matches(isDisplayed()))

        onView(withId(R.id.bt_resposta2)).perform(click())
        onView(withId(R.id.avalEnd)).check(matches(isDisplayed()))

        onView(withId(R.id.tv_resultat)).check(matches(withText("La teva salut emocional és bona, però et suggerim repetir el test la setmana vinent.")))


    }

    @Test
    fun test4(){

        onView(withId(R.id.bt_resposta1)).perform(click())
        onView(withId(R.id.aval2)).check(matches(isDisplayed()))

        onView(withId(R.id.bt_resposta1)).perform(click())
        onView(withId(R.id.aval3)).check(matches(isDisplayed()))

        onView(withId(R.id.bt_resposta1)).perform(click())
        onView(withId(R.id.avalEnd)).check(matches(isDisplayed()))

        onView(withId(R.id.tv_resultat)).check(matches(withText("La teva salut emocional és bona.")))


    }


}