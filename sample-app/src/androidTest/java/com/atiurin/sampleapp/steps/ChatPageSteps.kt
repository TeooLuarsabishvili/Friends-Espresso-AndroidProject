package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.helper.isTextOnScreen
import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.sampleapp.helper.typeText
import com.atiurin.sampleapp.pages.ChatPageMatchers.messageInputText
import com.atiurin.sampleapp.pages.ChatPageMatchers.sendButton
import com.atiurin.sampleapp.pages.ChatPageMatchers.sentMassage
import com.atiurin.sampleapp.pages.ChatPageMatchers.textInput
import com.atiurin.ultron.extensions.click
import com.atiurin.ultron.extensions.isDisplayed

class ChatPageSteps {
    fun checkRightChatIsOpened() {
        isTextOnScreen("Teona", timeInSec = 3)
    }

    fun checkTextInputIsDisplayed() {
        textInput.isDisplayed()
    }

    fun greetAFriend() {
        textInput.typeText("Hey, How was your ride?")
        messageInputText.isViewDisplayed()
    }

    fun clickSendMassage() {
        sendButton.isViewDisplayed()
        sendButton.click()
    }

    fun checkMassageIsSent() {
        sentMassage.isViewDisplayed()
        isTextOnScreen("Hey, How was your ride?",3)
    }

}