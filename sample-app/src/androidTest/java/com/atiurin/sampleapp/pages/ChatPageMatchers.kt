package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.*
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher
import org.hamcrest.Matchers

object ChatPageMatchers {
    val messageInputText: Matcher<View> by lazy { Matchers.allOf(withId(R.id.message_input_text), withText("Enter text")) }
    val textInput: Matcher<View> by lazy { Matchers.allOf(withId(R.id.message_input_text)) }
    val sendButton: Matcher<View> by lazy {Matchers.allOf(withId(R.id.send_button))}
    val sentMassage: Matcher<View> by lazy { Matchers.allOf(withId(R.id.message_text), withText("Hey, How was your ride??"))}

}