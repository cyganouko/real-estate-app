package com.example.travelapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.travelapp.ui.theme.TravelappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Demo()

        }

    }
}

@Composable
fun Demo(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Yellow)
    ){

        Text(
            text ="TravelBoast",
            fontSize = 75.sp,
            color = Color.Green,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center


        )

    Text(
        text = "TravelBoast is an android application that guides tourists to their different destinations",
        fontSize = 13.sp,
        fontWeight = FontWeight.Bold,
    )

    Text(
        text = "Choose your favourite destination",
        fontWeight = FontWeight.Bold,
        fontSize = 12.sp
    )


    Text(text = "1.Paris",



            Button(
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(Color.Green)

        ) {
            Text(text = "Other destinations")
            
        }


    )





  }




}





fun Text(text: String, text1: String, text2: String,text3: String, button: Unit) {

}

fun Text(text: String, button: Unit) {

}

@Composable
@Preview(showBackground = true)
fun DemoPreview(){
    Demo()
}


