package com.example.final7
//目錄
import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.final7.ui.theme.Final7Theme

class MainActivity2 : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Final7Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    //Greeting2(
                        //name = "Android",
                        //modifier = Modifier.padding(innerPadding)
                    //)
                    SecondScreen()
                }
            }
        }
    }
}
@Composable
fun Greeting2(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun SecondScreen() {
    val context = LocalContext.current //取得App的運行環境
    val activity = (context as Activity) //取得App運行的活動
    var mper = MediaPlayer()

    Column (modifier = Modifier

        .fillMaxSize()

        .background(Color.White),

        verticalArrangement = Arrangement.Center,

        horizontalAlignment = Alignment.CenterHorizontally) {
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
        Row{
            Image(
                painter = painterResource(id = R.drawable.a1),
                contentDescription = "圖片",
                alpha = 0.7f,
                modifier = Modifier
            )
            Text(
                text = "             ",
            )
            Image(
                painter = painterResource(id = R.drawable.controller),
                contentDescription = "圖片",
                alpha = 0.7f,
                modifier = Modifier
            )
        }

        Row {
            Button(onClick = {
                var it = Intent(context, MainActivity3::class.java)
                context.startActivity(it)
                mper.reset()
                mper = MediaPlayer.create(context, R.raw.note)
                mper.start()
            },
                colors = buttonColors(Color.Black)
            )
            {

                Text(
                    text = "記事簿",
                    fontSize = 20.sp,
                    color = Color.White,
                )
            }
            Text(
                text = "       ",
            )
            Button(onClick = {
                var it = Intent(context, MainActivity4::class.java)
                context.startActivity(it)
                mper.reset()
                mper = MediaPlayer.create(context, R.raw.game)
                mper.start()
            },
                colors = buttonColors(Color.Black)
            )
            {
                Text(text = "小遊戲" ,
                        fontSize = 20.sp,
                    color = Color.White,)
            }
        }
        Row{
            Text(
                text = "   ",


                )
            Image(
                painter = painterResource(id = R.drawable.g),
                contentDescription = "圖片",
                alpha = 0.7f,
                modifier = Modifier
            )
        }
        Row {
            Image(
                painter = painterResource(id = R.drawable.e1),
                contentDescription = "圖片",
                alpha = 0.7f,
                modifier = Modifier
            )
            Text(
                text = "              ",
            )
            Image(
                painter = painterResource(id = R.drawable.d1),
                contentDescription = "圖片",
                alpha = 0.7f,
                modifier = Modifier
            )
        }
        Row {
            Button(onClick = {
                var it = Intent(context, MainActivity5::class.java)
                it.putExtra("website", "https://www.maria.org.tw/")
                context.startActivity(it)
                mper.reset()
                mper = MediaPlayer.create(context, R.raw.address)
                mper.start()
            },
                colors = buttonColors(Color.Black))
            {
                Text(text = "查地址",
                    fontSize = 20.sp,
                    color = Color.White,
                    )
            }
            Text(
                text = "       ",
            )
            Button(
                onClick = {
                    activity.finish()
                    mper.reset()
                    mper = MediaPlayer.create(context, R.raw.retrun)
                    mper.start()
                },
                colors = buttonColors(Color.Black))
            {
                Text(text = "返回",
                    fontSize = 20.sp,
                    color = Color.White,
                    )
            }
        }
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
                painter = painterResource(id = R.drawable.li1),
                contentDescription = "圖片",
                alpha = 0.7f,
                modifier = Modifier
            )
        }
    }
}




@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    Final7Theme {
        Greeting2("Android")
    }
}