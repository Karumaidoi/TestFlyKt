package com.bestypie.testflykt.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bestypie.testflykt.R


@Preview
@Composable
fun CardWidget() {

    LazyColumn(modifier = Modifier.padding(start = 18.dp, end = 18.dp, top = 30.dp)) {
        item { AccountWidget() }
        item {  Spacer(modifier = Modifier.height(20.dp))
            Box(modifier = Modifier
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(size = 18.dp))
                .height(220.dp)
                .background( brush = Brush.verticalGradient(
                    colors = listOf(
                        MaterialTheme.colorScheme.primary,
                        MaterialTheme.colorScheme.secondary,
                    )
                ))
            ) {
                Column(modifier = Modifier.padding(vertical = 12.dp, horizontal = 10.dp).fillMaxHeight(), verticalArrangement = Arrangement.SpaceBetween, horizontalAlignment = Alignment.Start) {
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                        Column() {
                            Text(text = "Account", style = TextStyle(fontWeight = FontWeight.Medium, fontSize = 14.sp,  color = Color.White))
                            Text(text = "Investment account", style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 15.sp,  color = Color.White))
                        }

                        Button(onClick = { }) {
                            Text(text = "REFRESH", )
                        }

                    }

                    Column() {
                        Text(text = "Account Balance", style = TextStyle(fontWeight = FontWeight.Medium, fontSize = 13.sp, color = Color.White ))
                        Text(text = "KES 3,679,459", style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 15.sp,  color = Color.White))
                    }


                    Column() {
                        Text(text = "Wallet Number", style = TextStyle(fontWeight = FontWeight.Medium, fontSize = 13.sp,  color = Color.White))
                        Text(text = "SFN576G63HCH389", style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 15.sp,  color = Color.White))
                    }

                }
            }
            QuickActions()
            AdsSpace() }


    }

}

@Composable
fun AccountWidget() {
    Row(modifier = Modifier, verticalAlignment = Alignment.CenterVertically) {
        Box(modifier = Modifier
            .width(50.dp)
            .height(50.dp)
            .clip(RoundedCornerShape(size = 12.dp))
            .background(Color.DarkGray), contentAlignment = Alignment.Center) {
            Column(modifier = Modifier, verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
               Text(text = "A", style = TextStyle(fontWeight = FontWeight.Medium, fontSize = 18.sp, color = Color.White))
            }
        }
        Spacer(modifier = Modifier.width(10.dp))

        Column() {
            Text(text = "Good morning", style = TextStyle(fontWeight = FontWeight.Medium, fontSize = 14.sp,))
            Text(text = "Alex Maina Mwangi", style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 15.sp))
        }
    }
}

@Composable
fun QuickActions() {
    Column(modifier = Modifier.padding(vertical = 25.dp)) {
        Text(text = "Quick Actions", style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 15.sp, color = Color.Black))
        Spacer(modifier = Modifier.height(20.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Column(modifier = Modifier) {
                FloatingActionButton(onClick = { /*TODO*/ }, elevation = FloatingActionButtonDefaults.elevation(0.dp,0.dp)) {
                    Icon(imageVector = Icons.Default.PlayArrow, contentDescription = "Wallet", tint = Color.Black)
                }
                Spacer(modifier = Modifier.height(20.dp))
                Text(text = "Wallet", style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 15.sp))
            }

            Column(modifier = Modifier, verticalArrangement = Arrangement.Center) {
                FloatingActionButton(onClick = { /*TODO*/ }, elevation = FloatingActionButtonDefaults.elevation(0.dp,0.dp)) {
                    Icon(imageVector = Icons.Default.Notifications, contentDescription = "Wallet", tint = Color.Black)
                }
                Spacer(modifier = Modifier.height(20.dp))
                Text(text = "Notifications", style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 15.sp))
            }


            Column(modifier = Modifier, verticalArrangement = Arrangement.Center) {
                FloatingActionButton(onClick = { /*TODO*/ }, elevation = FloatingActionButtonDefaults.elevation(0.dp,0.dp)) {
                    Icon(imageVector = Icons.Default.LocationOn, contentDescription = "Wallet", tint = Color.Black)
                }
                Spacer(modifier = Modifier.height(20.dp))
                Text(text = "Location", style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 15.sp))
            }

            Column(modifier = Modifier, verticalArrangement = Arrangement.Center) {
                FloatingActionButton(onClick = { /*TODO*/ }, elevation = FloatingActionButtonDefaults.elevation(0.dp,0.dp)) {
                    Icon(imageVector = Icons.Default.Phone, contentDescription = "Wallet", tint = Color.Black)
                }
                Spacer(modifier = Modifier.height(20.dp))
                Text(text = "Support", style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 15.sp))
            }
        }
        Spacer(modifier = Modifier.height(30.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Column(modifier = Modifier) {
                FloatingActionButton(onClick = { /*TODO*/ }, elevation = FloatingActionButtonDefaults.elevation(0.dp,0.dp)) {
                    Icon(imageVector = Icons.Default.MailOutline, contentDescription = "Wallet", tint = Color.Black)
                }
                Spacer(modifier = Modifier.height(20.dp))
                Text(text = "Mail", style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 15.sp))
            }

            Column(modifier = Modifier, verticalArrangement = Arrangement.Center) {
                FloatingActionButton(onClick = { /*TODO*/ }, elevation = FloatingActionButtonDefaults.elevation(0.dp,0.dp)) {
                    Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "Wallet", tint = Color.Black, modifier = Modifier.size(24.dp))
                }
                Spacer(modifier = Modifier.height(20.dp))
                Text(text = "Basket", style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 15.sp))
            }

            Column(modifier = Modifier, verticalArrangement = Arrangement.Center) {
                FloatingActionButton(onClick = { /*TODO*/ }, elevation = FloatingActionButtonDefaults.elevation(0.dp,0.dp)) {
                    Icon(imageVector = Icons.Default.DateRange, contentDescription = "Wallet", tint = Color.Black)
                }
                Spacer(modifier = Modifier.height(20.dp))
                Text(text = "Calendar", style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 15.sp))
            }

            Column(modifier = Modifier, verticalArrangement = Arrangement.Center) {
                FloatingActionButton(onClick = { /*TODO*/ }, elevation = FloatingActionButtonDefaults.elevation(0.dp,0.dp)) {
                    Icon(imageVector = Icons.Default.Face, contentDescription = "Wallet", tint = Color.Black)
                }
                Spacer(modifier = Modifier.height(20.dp))
                Text(text = "Face", style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 15.sp))
            }
        }
    }
}

@Composable
fun AdsSpace() {
    Column(modifier = Modifier
        .padding(vertical = 0.dp)
        .fillMaxWidth()) {
        Text(text = "Ads Space", style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 15.sp, color = Color.Black))
        Spacer(modifier = Modifier.height(20.dp))
        Image(
            painter = painterResource(id = R.drawable.move),
            contentDescription = "",
            modifier = Modifier.clip(shape = RoundedCornerShape(corner = CornerSize(12.dp)))
        )
    }
}
