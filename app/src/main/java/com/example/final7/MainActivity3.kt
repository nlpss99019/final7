package com.example.final7
//記事簿
import android.app.Activity
import android.media.MediaPlayer
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
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
import com.example.final7.ui.theme.Final7Theme
import java.util.Calendar

class MainActivity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Final7Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting3(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting3(name: String, modifier: Modifier = Modifier) {
    val context = LocalContext.current  //取得App的運行環境
    val activity = (context as Activity)  //取得App運行的活動
    var mper = MediaPlayer()
    Column(
        modifier = Modifier

            .fillMaxSize()

            .background(Color.White),

        verticalArrangement = Arrangement.Center,

        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.li),
            contentDescription = "圖片",
            alpha = 0.7f,
            modifier = Modifier
            //.clip(CircleShape)
            //.background(Color.Black)
        )
        Text(
            text = "功能尚未上架，敬請期待!",
            fontSize = 20.sp,
            modifier = modifier
        )
        Text(
            text = " \n\n\n",
            fontSize = 20.sp,
            modifier = modifier
        )
        Button(
            onClick = {
                activity.finish()
                mper.reset()
                mper = MediaPlayer.create(context, R.raw.addressretrun)
                mper.start()
            })
        {
            Text(text = "回首頁")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview3() {
    Final7Theme {
        Greeting3("Android")
    }
}


