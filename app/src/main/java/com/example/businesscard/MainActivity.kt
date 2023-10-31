package com.example.businesscard

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			BusinessCardTheme {
				// A surface container using the 'background' color from the theme
				Surface(
					modifier = Modifier.fillMaxSize(),
					color = MaterialTheme.colorScheme.background
				) {
					//Greeting("Android")
				}
			}
		}
	}
}

@Composable
fun AboutMeInfo(logo: Painter, name: String, surname: String, modifier: Modifier = Modifier) {
	Column {
		Image(
			painter = logo,
			contentDescription = null
		)
		Text(
			text = name,
			modifier = modifier
				.border(width = 5.dp, color = Color.Blue)
		)
		Text(
			text = surname,
			modifier = modifier
		)
	}
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
	BusinessCardTheme {
		//Greeting("Android")
	}
}