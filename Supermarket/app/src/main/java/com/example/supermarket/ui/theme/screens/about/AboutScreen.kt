package com.example.realestate.ui.theme.screens.about

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.realestate.R
import java.lang.reflect.Modifier


@Composable
fun AboutScreen(navController: NavController){

//Lottie Animation
    val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.house))
    val progress by animateLottieCompositionAsState(composition)
    LottieAnimation(composition, progress,
        modifier = androidx.compose.ui.Modifier.size(20.dp)
    )
}


@Composable
@Preview(showBackground = true)
fun AboutScreenPreview(){
    AboutScreen(rememberNavController() )
}
