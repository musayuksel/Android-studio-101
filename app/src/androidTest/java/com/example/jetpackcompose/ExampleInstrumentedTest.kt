package com.example.jetpackcompose

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performTextInput
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme
import org.junit.Rule
import org.junit.Test

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
//@RunWith(AndroidJUnit4::class)
class TipCalculatorUITests {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun tipCalculatorRenderTest() {
        composeTestRule.setContent {
            JetpackComposeTheme {
                TipCalculator()
            }
        }
        composeTestRule.onNodeWithText("Calculate Tip").assertIsDisplayed()
        composeTestRule.onNodeWithText("Bill Amount").assertIsDisplayed()
        composeTestRule.onNodeWithText("Tip Percentage").assertIsDisplayed()
        composeTestRule.onNodeWithText("Round up tip?").assertIsDisplayed()
    }

    @Test
    fun tipCalculatorFunctionalityTest() {
        composeTestRule.setContent {
            JetpackComposeTheme {
                TipCalculator()
            }
        }
        composeTestRule.onNodeWithText("Bill Amount").performTextInput("100")
        composeTestRule.onNodeWithText("Tip Percentage").performTextInput("15")
        val expectedTip = "$15.00"
        Thread.sleep(2000)
        composeTestRule.onNodeWithText("Tip Amount: $expectedTip").assertIsDisplayed()
    }
}