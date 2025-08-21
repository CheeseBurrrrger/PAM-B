package com.example.pam_b.View

import androidx.compose.animation.animateColor
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.animation.core.*
import androidx.compose.ui.draw.scale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pam_b.R
import com.example.pam_b.Util.sfApple


@Composable
fun Assignment1(){
    val bgColor = Color(0xff98c1d9)
    val secColor = Color(0xff3d5a80)
    val fontColor = Color(0xffe0fbfc)
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(bgColor)

    ){
        Image(
            painter = painterResource(R.drawable.me),
            contentDescription = "My face",
            modifier = Modifier
                .align(Alignment.Center)
        )
        Box(
            modifier = Modifier
                .fillMaxHeight(0.6f)
                .fillMaxWidth()
                .clip(
                    shape = RoundedCornerShape(50.dp,50.dp)
                )
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            bgColor.copy(alpha = 0.02f),
                            secColor.copy(alpha = 0.3f),
                            secColor.copy(alpha = 0.4f),
                            secColor.copy(alpha = 0.9f),
                            secColor.copy(alpha = 1.0f)
                        )
                    )
                )
                .align(Alignment.BottomCenter)
        ){
            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .align(Alignment.TopCenter)
                    .padding(0.dp,90.dp,0.dp,0.dp)
            ){
                Text(
                    "Dody Syah Putra",
                    fontSize = 36.sp,
                    textAlign = TextAlign.Center,
                    fontFamily = sfApple,
                    fontWeight = FontWeight.Black,
                    color = fontColor

                )
                Spacer(Modifier .size(50.dp))
                Text(
                    "235150400111020",
                    fontSize = 36.sp,
                    textAlign = TextAlign.Center,
                    fontFamily = sfApple,
                    fontWeight = FontWeight.Normal,
                    color = fontColor
                )
            }
        }
    }
}