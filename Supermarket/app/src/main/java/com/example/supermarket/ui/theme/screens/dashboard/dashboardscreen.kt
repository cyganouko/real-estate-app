package com.example.realestate.ui.theme.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.realestate.R
import com.example.realestate.navigation.ADD_PRODUCTS_URL
import com.example.realestate.navigation.ROUT_HOME
import com.example.realestate.navigation.ROUT_PROPERTY
import com.example.realestate.navigation.VIEW_PRODUCTS_URL
import com.example.realestate.ui.theme.cream
import com.example.realestate.ui.theme.purple60
import com.example.realestate.ui.theme.purple70

import com.example.realestate.ui.theme.screens.home.HomeScreen
import com.example.realestate.ui.theme.yellow


@Composable
fun DashboardScreen(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Spacer(modifier = Modifier.height(10.dp))
        Image(
            painter = painterResource(id = R.drawable.img_5),
            contentDescription ="home",
            modifier = Modifier
                .size(100.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text ="Manage your properties with ease....",
            fontSize = 25.sp,
            color = Color.DarkGray,
            fontFamily = FontFamily.Cursive,

            )


        Spacer(modifier = Modifier.height(15.dp))

        Column (modifier = Modifier.verticalScroll(rememberScrollState())){
//MAIN CARD
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(700.dp),
                shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp),
                colors = CardDefaults.cardColors(cream)



            ) {
                //ROW 1
                Row (modifier = Modifier.padding(20.dp)){

                    //CARD 1
                    Card(modifier = Modifier
                        .clickable { navController.navigate(ROUT_HOME) }
                        .width(160.dp)
                        .height(180.dp),
                        elevation = CardDefaults.cardElevation(20.dp)
                    ) {

                        Column {
                            Spacer(modifier = Modifier.height(20.dp))
                            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                                Image(
                                    painter = painterResource(id = R.drawable.img_6),
                                    contentDescription ="home",
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clip(shape = CircleShape),
                                    contentScale = ContentScale.Crop
                                )
                            }
                            Spacer(modifier = Modifier.height(20.dp))
                            Text(
                                text ="Home",
                                fontSize = 23.sp,
                                color = yellow,
                                fontFamily = FontFamily.SansSerif,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center

                                )

                        }

                    }

                    //END OF CARD
                    Spacer(modifier = Modifier.width(20.dp))

                    //CARD 2
                    Card(modifier = Modifier
                        .width(160.dp)
                        .height(180.dp),
                        elevation = CardDefaults.cardElevation(20.dp)
                    ) {

                        Column {
                            Spacer(modifier = Modifier.height(20.dp))
                            Box(modifier = Modifier
                                .fillMaxWidth()
                                .clickable {
                                    navController.navigate(
                                        ROUT_PROPERTY
                                    )
                                }, contentAlignment = Alignment.Center) {
                                Image(
                                    painter = painterResource(id = R.drawable.img_7),
                                    contentDescription ="home",
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clip(shape = CircleShape),
                                    contentScale = ContentScale.Crop
                                )
                            }
                            Spacer(modifier = Modifier.height(20.dp))
                            Text(
                                text ="Property",
                                fontSize = 23.sp,
                                color = yellow,
                                fontFamily = FontFamily.SansSerif,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center

                            )

                        }

                    }
                    //END OF CARD 2












                }
                //END OF ROW 1


                //ROW 2
                Row (modifier = Modifier.padding(20.dp)){

                    //CARD 1
                    Card(modifier = Modifier
                        .width(160.dp)
                        .height(180.dp),
                        elevation = CardDefaults.cardElevation(20.dp)

                    ) {

                        Column {
                            Spacer(modifier = Modifier.height(20.dp))
                            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                                Image(
                                    painter = painterResource(id = R.drawable.img_8),
                                    contentDescription ="home",
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clip(shape = CircleShape),
                                    contentScale = ContentScale.Crop
                                )
                            }
                            Spacer(modifier = Modifier.height(20.dp))
                            Text(
                                text ="Settings",
                                fontSize = 23.sp,
                                color = yellow,
                                fontFamily = FontFamily.SansSerif,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center

                            )

                        }

                    }

                    //END OF CARD 1
                    Spacer(modifier = Modifier.width(20.dp))

                    //CARD 2
                    Card(modifier = Modifier
                        .width(160.dp)
                        .height(180.dp),
                        elevation = CardDefaults.cardElevation(20.dp)

                    ) {

                        Column {
                            Spacer(modifier = Modifier.height(20.dp))
                            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                                Image(
                                    painter = painterResource(id = R.drawable.img_9),
                                    contentDescription ="Profile",
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clip(shape = CircleShape),
                                    contentScale = ContentScale.Crop
                                )
                            }
                            Spacer(modifier = Modifier.height(20.dp))
                            Text(
                                text ="Profile",
                                fontSize = 23.sp,
                                color = yellow,
                                fontFamily = FontFamily.SansSerif,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center

                            )

                        }

                    }
                    //END OF CARD 2












                }
                //END OF ROW 2

                //ROW 3
                Row (modifier = Modifier.padding(20.dp)){

                    //CARD 1
                    Card(modifier = Modifier
                        .width(160.dp)
                        .height(180.dp),
                        elevation = CardDefaults.cardElevation(20.dp)

                    ) {

                        Column {
                            Spacer(modifier = Modifier.height(20.dp))
                            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                                Image(
                                    painter = painterResource(id = R.drawable.img_6),
                                    contentDescription ="home",
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clip(shape = CircleShape)
                                        .clickable {
                                            navController.navigate(ADD_PRODUCTS_URL)
                                        },

                                    contentScale = ContentScale.Crop
                                )
                            }
                            Spacer(modifier = Modifier.height(20.dp))
                            Text(
                                text ="Add",
                                fontSize = 23.sp,
                                color = yellow,
                                fontFamily = FontFamily.SansSerif,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center

                            )

                        }

                    }

                    //END OF CARD 1
                    Spacer(modifier = Modifier.width(20.dp))

                    //CARD 2
                    Card(modifier = Modifier
                        .width(160.dp)
                        .height(180.dp),
                        elevation = CardDefaults.cardElevation(20.dp)

                    ) {

                        Column {
                            Spacer(modifier = Modifier.height(20.dp))
                            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                                Image(
                                    painter = painterResource(id = R.drawable.img_5),
                                    contentDescription ="home",
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clip(shape = CircleShape)
                                        .clickable {
                                            navController.navigate(VIEW_PRODUCTS_URL)
                                        },
                                    contentScale = ContentScale.Crop
                                )
                            }
                            Spacer(modifier = Modifier.height(20.dp))
                            Text(
                                text ="View",
                                fontSize = 23.sp,
                                color = yellow,
                                fontFamily = FontFamily.SansSerif,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center

                            )

                        }

                    }
                    //END OF CARD 2












                }
                //END OF ROW 3










            }
//END OF MAIN CARD






        }











    }


}



@Composable
@Preview(showBackground = true)
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController() )
}
