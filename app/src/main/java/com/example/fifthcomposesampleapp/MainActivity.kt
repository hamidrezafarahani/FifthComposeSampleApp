package com.example.fifthcomposesampleapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.fifthcomposesampleapp.ui.theme.FifthComposeSampleAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FifthComposeSampleAppTheme {
            }
        }
    }
}