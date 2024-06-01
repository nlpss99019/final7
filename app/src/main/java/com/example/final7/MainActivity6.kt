package com.example.final7
//小遊戲第2題
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.final7.ui.theme.Final7Theme

class MainActivity6 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Final7Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting6(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting6(name: String, modifier: Modifier = Modifier) {
    val context = LocalContext.current //取得App的運行環境
    val activity = (context as Activity) //取得App運行的活動
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {

        Row {
            Button(onClick = {
                var it = Intent(context, MainActivity6::class.java)
                context.startActivity(it)
            }
            )
            {
                Text(
                    text = "答案1",
                    fontSize = 20.sp,
                    color = Color.White,
                )
            }
            Button(onClick = {
                var it = Intent(context, MainActivity6::class.java)
                context.startActivity(it)
            }
            )
            {
                Text(
                    text = "答案2",
                    fontSize = 20.sp,
                    color = Color.White,
                )
            }
            Button(onClick = {
                var it = Intent(context, MainActivity7::class.java)
                context.startActivity(it)
            }
            )
            {
                Text(text = "答案3" ,
                    fontSize = 20.sp,
                    color = Color.White,)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview6() {
    Final7Theme {
        Greeting6("Android")
    }
}