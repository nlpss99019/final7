package com.example.final7

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.final7.ui.theme.Final7Theme

class MainActivity2 : ComponentActivity() {
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
    Column {
        Button(onClick = {
            var it = Intent(context, MainActivity3::class.java)
            context.startActivity(it)
        }
        )
        {
            Text(text = "記事簿")
        }
        Button(onClick = {
            var it = Intent(context, MainActivity4::class.java)
            context.startActivity(it)
        }
        )
        {
            Text(text = "活動")
        }

        Button(
            onClick = {
                activity.finish()
            })
        {
            Text(text = "返回")
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Final7Theme {
        Greeting2("Android")
    }
}