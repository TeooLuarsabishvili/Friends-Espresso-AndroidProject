package com.atiurin.sampleapp.tests.espresso

import com.atiurin.sampleapp.tests.BaseTest
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.atiurin.sampleapp.activity.MainActivity
import com.atiurin.sampleapp.steps.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class CornerCirclesTest : BaseTest() {
    @get:Rule
    val activityTestRule = ActivityScenarioRule(MainActivity::class.java)
    private val dashboardInstance = DashboardSteps()
    private val chatListInstance = ChatListSteps()
    private val burgerManuInstance = BurgerManuPageSteps()
    private val frameLayoutInstance = FrameLayoutPageSteps()



    @Test
    fun cornerCirclesTest() {
        dashboardInstance.checkDashboardIsFullyDisplayed()
        chatListInstance.clickBurgerManu()
        burgerManuInstance.clickCustomClickButton()
        frameLayoutInstance.checkFrameLayoutPageIsDisplayed()
        frameLayoutInstance.clickTopLeftCircle()
        frameLayoutInstance.assertTopLeftCircleIsSelected()
        frameLayoutInstance.clickTopRightCircle()
        frameLayoutInstance.assertTopRightCircleIsSelected()
        frameLayoutInstance.clickBottomLeftCircle()
        frameLayoutInstance.assertBottomLeftCircleIsSelected()
        frameLayoutInstance.clickBottomRightCircle()
        frameLayoutInstance.assertBottomRightCircleIsSelected()
    }
}