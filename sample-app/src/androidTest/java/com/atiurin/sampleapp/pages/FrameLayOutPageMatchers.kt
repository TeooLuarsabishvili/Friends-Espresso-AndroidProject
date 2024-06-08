package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher
import org.hamcrest.Matchers

object FrameLayOutPageMatchers {
    val FrameLayout: Matcher<View> by lazy { Matchers.allOf(withId(R.id.frameLayout))}
    val TopLeftCircle: Matcher<View> by lazy { Matchers.allOf(withId(R.id.rB_top_left))}
    val TopRightCircle: Matcher<View> by lazy { Matchers.allOf(withId(R.id.rB_top_right))}
    val BottomLeftCircle: Matcher<View> by lazy { Matchers.allOf(withId(R.id.rB_bottom_left))}
    val BottomRightCircle: Matcher<View> by lazy { Matchers.allOf(withId(R.id.rB_bottom_right))}
}