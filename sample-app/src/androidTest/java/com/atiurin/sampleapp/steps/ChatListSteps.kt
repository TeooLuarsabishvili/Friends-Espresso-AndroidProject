package com.atiurin.sampleapp.steps


import androidx.test.espresso.Espresso.onView
import com.atiurin.sampleapp.helper.*
import com.atiurin.sampleapp.pages.ChatListMatchers
import com.atiurin.ultron.extensions.click
import com.atiurin.ultron.extensions.clickBurgerManu
import com.atiurin.ultron.extensions.clickTopLeft
import com.atiurin.ultron.extensions.isChecked


class ChatListSteps {


    fun checkFriendNameIsDisplayed() {
        with(ChatListMatchers) {
            Teona.waitForViewVisible(3)
        }
    }

    fun checkFriendsListIsDisplayed() {
            isTextOnScreen("Friends", timeInSec = 3)
    }

    fun tapFriendName() {
        with(ChatListMatchers) {
            onView(Teona).tap()
        }
    }

    fun clickBurgerManu() {
        with(ChatListMatchers) {
            BurgerManu.waitForViewVisible(3)
            onView(BurgerManu).clickBurgerManu()
        }
    }

}







