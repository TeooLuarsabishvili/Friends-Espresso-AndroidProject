package com.atiurin.sampleapp.steps

import androidx.test.espresso.Espresso.onView
import com.atiurin.sampleapp.helper.waitForViewVisible
import com.atiurin.sampleapp.pages.BurgerManuPageMatchers
import com.atiurin.ultron.extensions.click
import com.atiurin.ultron.extensions.clickTopCenter
import com.atiurin.ultron.extensions.clickTopLeft

class BurgerManuPageSteps {
    fun clickCustomClickButton() {
        with(BurgerManuPageMatchers) {
            CustomClicksButton.waitForViewVisible(3)
            onView(CustomClicksButton).click()
        }
    }
}