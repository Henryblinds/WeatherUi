package com.hbl.weatherapp.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.hbl.weatherapp.ui.screen.components.ActionBar
import com.hbl.weatherapp.ui.screen.components.AirQuality
import com.hbl.weatherapp.ui.screen.components.DailyForecast
import com.hbl.weatherapp.ui.screen.components.WeeklyForecast
import com.hbl.weatherapp.ui.theme.ColorBackground

@Composable
fun WeatherScreen() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = ColorBackground
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(padding)
                .padding(
                    horizontal = 24.dp,
                    vertical = 10.dp
                )
        ) {
            ActionBar()
            Spacer(
                modifier = Modifier.height(12.dp)
            )
            DailyForecast()
            Spacer(
                modifier = Modifier.height(24.dp)
            )
            AirQuality()
            Spacer(
                modifier = Modifier.height(24.dp)
            )
            WeeklyForecast()
        }
    }
}