package com.atiurin.sampleapp.tests.espresso

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.atiurin.sampleapp.activity.MainActivity
import com.atiurin.sampleapp.steps.ChatListSteps
import com.atiurin.sampleapp.steps.ChatPageSteps
import com.atiurin.sampleapp.steps.DashboardSteps
import com.atiurin.sampleapp.tests.BaseTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class ChattingTest : BaseTest()  {

    @get:Rule
    val activityTestRule = ActivityScenarioRule(MainActivity::class.java)
    private val dashboardInstance = DashboardSteps()
    private val chatListInstance = ChatListSteps()
    private val chatPageInstance = ChatPageSteps()



    @Test
    fun textWithMyFriend() {
        dashboardInstance.checkDashboardIsFullyDisplayed()
        chatListInstance.checkFriendsListIsDisplayed()
        chatListInstance.checkFriendNameIsDisplayed()
        chatListInstance.tapFriendName()
        chatPageInstance.checkRightChatIsOpened()
        chatPageInstance.checkTextInputIsDisplayed()
        chatPageInstance.greetAFriend()
        chatPageInstance.clickSendMassage()
        chatPageInstance.checkMassageIsSent()
    }


}