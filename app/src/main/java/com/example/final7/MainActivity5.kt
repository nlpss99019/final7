package com.example.final7
//地址
import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.final7.ui.theme.Final7Theme

class MainActivity5 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Final7Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting5(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting5(name: String,modifier: Modifier = Modifier) {
    val context = LocalContext.current  //取得App的運行環境
    val activity = (context as Activity)  //取得App運行的活動
    var url: String? = context.intent.getStringExtra("website")

    Column {
        Text(
            text = "\n\n網址為：" + url!!
        )
        Button(
            onClick = {
                var it = Intent(Intent.ACTION_VIEW)
                it.data = Uri.parse("geo:24.190296179442793, 120.65834493726841")
                context.startActivity(it)
            }
        )
        {
            Text(text = "Google Map查詢")
        }

        Text(
            text = "\n地址為：406台中市北屯區經貿東路365號1樓\n"
        )
        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription = "圖片",
            alpha = 0.7f,
            modifier = Modifier
                .clip(CircleShape)
                .background(Color.White)
        )


        Button(
            onClick = {
                activity.finish()
            })
        {
            Text(text = "回首頁")
        }
        Image(
            painter = painterResource(id = R.drawable.li1),
            contentDescription = "圖片",
            alpha = 0.7f,
            modifier = Modifier
        )

    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview5() {
    Final7Theme {
        Greeting5("Android")
    }
}
