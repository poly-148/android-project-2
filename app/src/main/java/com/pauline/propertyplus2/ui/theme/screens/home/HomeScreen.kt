package com.pauline.propertyplus2.ui.theme.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.pauline.propertyplus2.R
import com.pauline.propertyplus2.navigation.ROUT_CONTACT
import com.pauline.propertyplus2.ui.theme.newGreen

@Composable
fun HomeScreen(navController: NavController){
    Column (
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){

        Image(
            painter = painterResource(R.drawable.img),
            contentDescription = "",
            modifier = Modifier
                .size(300.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop
        )
        Text(
            text = "Find Your Product!",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "A Law360 subscription puts you at the center of fast-moving legal issues, trends and developments so you can act with speed and confidence. Over 200 articles are published daily across more than 60 topics, industries, practice areas and jurisdictions.",
            fontSize = 15.sp,
            textAlign = TextAlign.Center
        )
        Button(
            onClick ={
                navController.navigate(ROUT_CONTACT)
            },
            colors = ButtonDefaults.buttonColors(newGreen)
        ) {
            Text(text= "Get Started!")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())
}