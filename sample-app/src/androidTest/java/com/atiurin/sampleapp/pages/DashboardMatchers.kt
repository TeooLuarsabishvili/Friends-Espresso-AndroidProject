package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher
import org.hamcrest.Matchers

object DashboardMatchers {
    val dashboard: Matcher<View> by lazy { Matchers.allOf(withId(R.id.scrim_view)) }
}