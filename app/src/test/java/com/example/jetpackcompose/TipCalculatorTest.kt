package com.example.jetpackcompose

import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.NumberFormat

class TipCalculatorTests {
    @Test
    fun `given amount and tip percent without rounding up, when calculate tip, then tip is calculated correctly`() {
        val amount = 10.00
        val tipPercent = 15.00
        val expectedTip = NumberFormat.getCurrencyInstance().format(1.5)
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, false)
        assertEquals(expectedTip, actualTip)
    }

    @Test
    fun `given amount and tip percent with rounding up, when calculate tip, then tip is calculated correctly`() {
        val amount = 10.00
        val tipPercent = 12.00
        val expectedTip = NumberFormat.getCurrencyInstance().format(2.0)
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, true)
        assertEquals(expectedTip, actualTip)
    }
}
