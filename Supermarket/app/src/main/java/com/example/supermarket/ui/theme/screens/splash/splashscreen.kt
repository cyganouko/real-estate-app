package com.example.realestate.ui.theme.screens.splash

import android.annotation.SuppressLint
import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.realestate.R
import com.example.realestate.navigation.ROUT_HOME
import com.example.realestate.navigation.ROUT_LOGIN
import com.example.realestate.ui.theme.purple70
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavController){
Column(modifier = Modifier
    .fillMaxSize()
    .paint(painterResource(id = R.drawable.back), contentScale = ContentScale.FillBounds),

    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally

) {

    var coroutineScope = rememberCoroutineScope()
    coroutineScope.launch {
        delay(3000)
        navController.navigate(ROUT_LOGIN)

    }

    Image(
        painter = painterResource(id = R.drawable.home),
        contentDescription ="home",
        modifier = Modifier
            .size(180.dp)
            .clip(shape = CircleShape),
        contentScale = ContentScale.Crop
    )

    Spacer(modifier = Modifier.height(25.dp))

    Text(
        text =" Welcome to Meadows Real Estate",
        fontSize = 25.sp,
        color = Color.White,
        fontFamily = FontFamily.Cursive,
        fontWeight = FontWeight.ExtraBold

        )






}

















}

@Composable
@Preview(showBackground = true)
fun SplashScreenPreview(){
    SplashScreen(rememberNavController() )
}


