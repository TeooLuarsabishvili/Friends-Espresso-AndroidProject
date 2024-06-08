package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.helper.isViewCompletelyDisplayed
import com.atiurin.sampleapp.pages.DashboardMatchers

class DashboardSteps {
    fun checkDashboardIsFullyDisplayed() {
        with(DashboardMatchers) {
            dashboard.isViewCompletelyDisplayed()
        }
    }
}