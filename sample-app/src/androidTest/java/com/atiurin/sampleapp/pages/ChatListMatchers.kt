package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.*
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher
import org.hamcrest.Matchers

object ChatListMatchers {
    val Teona: Matcher<View> by lazy { Matchers.allOf(withId(R.id.tv_name), withText("Teona")) }
    val BurgerManu: Matcher<View> by lazy {Matchers.allOf(withId(R.id.toolbar))}
    val CustomClicksButton: Matcher<View> by lazy {Matchers.allOf(withId(R.id.design_menu_item_text))}

}