package com.example.businesscard

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
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
	Column(
		modifier = modifier
			.fillMaxSize()
			.border(width = 5.dp, color = Color.Red),
		verticalArrangement = Arrangement.Center,
		horizontalAlignment = Alignment.CenterHorizontally
	){
		Image(
			painter = logo,
			contentDescription = null,
			modifier = Modifier
				.border(width = 5.dp, color = Color.Green)
				.size(width = 100.dp, height = 100.dp)
		)
		Text(
			text = name,
			modifier = Modifier
				.border(width = 5.dp, color = Color.Blue)
				.padding(8.dp)
		)
		Text(
			text = surname,
			modifier = Modifier
			.border(width = 5.dp, color = Color.Blue)
			.padding(8.dp)
		)
	}
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
	BusinessCardTheme {
		AboutMeInfo(
			logo = painterResource(id = R.drawable.android_logo),
			name = "Seg",
			surname = "Shlegel"
		)
	}
}