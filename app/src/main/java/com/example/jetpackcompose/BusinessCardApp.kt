package com.example.jetpackcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BusinessCardApp(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFCBE5CF))
            .padding(vertical = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Spacer(modifier = Modifier.weight(1f))
        ImageSection(modifier = modifier, fullName = "Musa Yuxel", title = "Android Developer")
        Spacer(modifier = Modifier.weight(1f))
        ContactInfoSection(modifier = modifier)
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardAppPreview() {
    BusinessCardApp()
}

@Composable
fun ImageSection(fullName: String, title: String, modifier: Modifier) {
    Column(
        modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = "Android logo",
            modifier = modifier
                .background(Color(0xFF052A39))
                .height(100.dp)
                .width(100.dp)
        )
        Text(
            text = fullName,
            modifier = modifier.padding(vertical = 8.dp),
            fontSize = 32.sp,
            fontWeight = FontWeight.Light
        )
        Text(
            text = title,
            modifier = modifier,
            color = (Color(0xFF006237)),
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun ContactInfoSection(modifier: Modifier) {
    Column(modifier = modifier) {
        ContactItem(Icons.Rounded.Phone, "Phone: 555-555-5555")
        ContactItem(Icons.Rounded.Share, "@musayuxel")
        ContactItem(Icons.Rounded.Email, "musa.yuxel@a.b")
    }
}

@Composable
fun ContactItem(icon: ImageVector, text: String, modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            icon,
            contentDescription = null,
            tint = Color(0xFF006237),
            modifier = modifier
                .padding(8.dp)
                .height(16.dp)
                .width(24.dp),

            )
        Text(text = text)
    }
}