package com.atiurin.sampleapp.steps

import androidx.test.espresso.Espresso.onView
import com.atiurin.sampleapp.helper.isViewCompletelyDisplayed
import com.atiurin.sampleapp.helper.waitForViewVisible
import com.atiurin.sampleapp.pages.FrameLayOutPageMatchers
import com.atiurin.sampleapp.pages.FrameLayOutPageMatchers.BottomLeftCircle
import com.atiurin.sampleapp.pages.FrameLayOutPageMatchers.BottomRightCircle
import com.atiurin.sampleapp.pages.FrameLayOutPageMatchers.TopLeftCircle
import com.atiurin.sampleapp.pages.FrameLayOutPageMatchers.TopRightCircle
import com.atiurin.ultron.extensions.click
import com.atiurin.ultron.extensions.isChecked

class FrameLayoutPageSteps {
    fun checkFrameLayoutPageIsDisplayed() {
        with(FrameLayOutPageMatchers) {
            FrameLayout.waitForViewVisible(3)
            FrameLayout.isViewCompletelyDisplayed()
        }
    }


    fun clickTopLeftCircle() {
        with(FrameLayOutPageMatchers) {
            TopLeftCircle.waitForViewVisible(3)
            onView(TopLeftCircle).click()
        }
    }
    fun assertTopLeftCircleIsSelected() {
        TopLeftCircle.isChecked()
    }


    fun clickTopRightCircle() {
        with(FrameLayOutPageMatchers) {
            TopRightCircle.waitForViewVisible(3)
            onView(TopRightCircle).click()
        }
    }

    fun assertTopRightCircleIsSelected() {
        TopRightCircle.isChecked()
    }


    fun clickBottomLeftCircle() {
        with(FrameLayOutPageMatchers) {
            BottomLeftCircle.waitForViewVisible(3)
            onView(BottomLeftCircle).click()
        }
    }
    fun assertBottomLeftCircleIsSelected() {
      BottomLeftCircle.isChecked()
    }


    fun clickBottomRightCircle() {
        with(FrameLayOutPageMatchers) {
            BottomRightCircle.waitForViewVisible(3)
            onView(BottomRightCircle).click()
        }
    }
    fun assertBottomRightCircleIsSelected() {
      BottomRightCircle.isChecked()
    }
}