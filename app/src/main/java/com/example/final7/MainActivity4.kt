package com.example.final7
//小遊戲第一題
import android.app.Activity
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import com.example.final7.ui.theme.Final7Theme

class MainActivity4 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Final7Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting4(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting4(name: String, modifier: Modifier = Modifier) {
    val context = LocalContext.current //取得App的運行環境
    val activity = (context as Activity) //取得App運行的活動
    var mper = MediaPlayer()

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(
            text = "今天你在公園散步，突然覺得口渴，要去販賣機買一瓶紅茶喝。請問下列何者是我們需要的飲料",
            fontSize = 25.sp,
            color = Color.Black,
            modifier = modifier
        )
        Row {
            Image(
                painter = painterResource(id = R.drawable.ans1),
                contentDescription = "圖片",
                alpha = 0.7f,
                modifier = Modifier
            )
            Button(onClick = {

            }
            )
            {
                Text(
                    text = "1",
                    fontSize = 20.sp,
                    color = Color.White,
                )
            }
        }
        Text(text = "")
        Image(
            painter = painterResource(id = R.drawable.g),
            contentDescription = "圖片",
            alpha = 0.7f,
            modifier = Modifier
        )
        Image(
            painter = painterResource(id = R.drawable.g),
            contentDescription = "圖片",
            alpha = 0.7f,
            modifier = Modifier
        )
        Image(
            painter = painterResource(id = R.drawable.g),
            contentDescription = "圖片",
            alpha = 0.7f,
            modifier = Modifier
        )
        Row {
            Image(
                painter = painterResource(id = R.drawable.q3),
                contentDescription = "圖片",
                alpha = 0.7f,
                modifier = Modifier
            )
            Image(
                painter = painterResource(id = R.drawable.q1),
                contentDescription = "圖片",
                alpha = 0.7f,
                modifier = Modifier
            )
            Image(
                painter = painterResource(id = R.drawable.q2),
                contentDescription = "圖片",
                alpha = 0.7f,
                modifier = Modifier
            )
        }
        Row {
            Button(onClick = {
                mper.reset()
                mper = MediaPlayer.create(context, R.raw.wrong)
                mper.start()
            }
            )
            {
                Text(
                    text = "1",
                    fontSize = 20.sp,
                    color = Color.White,
                )
            }
            Text(text = "      ")
            Button(onClick = {
                mper.reset()
                mper = MediaPlayer.create(context, R.raw.wrong)
                mper.start()
            }
            )
            {
                Text(
                    text = "2",
                    fontSize = 20.sp,
                    color = Color.White,
                )
            }
            Text(text = "      ")
            Button(onClick = {
                var it = Intent(context, MainActivity6::class.java)
                context.startActivity(it)
                mper.reset()
                mper = MediaPlayer.create(context, R.raw.right)
                mper.start()
            }
            )
            {
                Text(
                    text = "3",
                    fontSize = 20.sp,
                    color = Color.White,
                )
            }
        }

    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview4() {
    Final7Theme {
        Greeting4("Android")
    }
}