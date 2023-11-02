package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
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
					BusinessCardApp()
				}
			}
		}
	}
}

@Composable
fun BusinessCardApp(){
	AboutMeInfo(
		logo = painterResource(id = R.drawable.android_logo),
		fullname = stringResource(R.string.full_name),
		title = stringResource(R.string.title)
	)
}
@Composable
fun AboutMeInfo(
	logo: Painter,
	fullname: String,
	title: String,
	) {
	Column (
		modifier = Modifier
			.fillMaxSize()
			.background(Color(0xFF494155)),
		verticalArrangement = Arrangement.SpaceEvenly,
		horizontalAlignment = Alignment.CenterHorizontally
		){
		Column(
			modifier = Modifier
				.fillMaxWidth()
				.weight(1f)
				.padding(8.dp),
			horizontalAlignment = Alignment.CenterHorizontally,
			verticalArrangement = Arrangement.Center
		) {
			Image(
				painter = logo,
				contentDescription = null,
				modifier = Modifier
					.padding(top = 5.dp)
					.size(width = 150.dp, height = 150.dp)
			)
			Text(
				text = fullname,
				modifier = Modifier
					.padding(8.dp),
				textAlign = TextAlign.Center,
				fontSize = 36.sp,
				fontWeight = FontWeight.Light,
				color = Color.White
			)
			Text(
				text = title,
				modifier = Modifier
					.padding(8.dp),
				color = Color(0xFF3ddc84),
				fontSize = 24.sp,
				fontWeight = FontWeight.Bold
			)
		}
		Column(
			modifier = Modifier
				.fillMaxWidth()
				.weight(0.4f)
				.padding(10.dp),
			verticalArrangement = Arrangement.Center,
			horizontalAlignment = Alignment.End
		) {
			ContactInfoTemplate(
				icon = Icons.Default.Phone ,
				contact = stringResource(R.string.phone_num)
			)
			ContactInfoTemplate(
				icon = Icons.Default.Share ,
				contact = stringResource(R.string.home_page)
			)
			ContactInfoTemplate(
				icon = Icons.Default.Email,
				contact = stringResource(R.string.email)
			)
		}
	}
}

@Composable
fun ContactInfoTemplate(
	icon: ImageVector,
	contact: String
) {
	Row(
		modifier = Modifier
			.fillMaxWidth()
			.padding(start = 70.dp),
		verticalAlignment = Alignment.CenterVertically,
		horizontalArrangement = Arrangement.Start
	) {
		androidx.compose.material3.Icon(
			imageVector = icon,
			contentDescription = null,
			tint = Color(0xFF3ddc84),
			modifier = Modifier
				.padding(start = 10.dp, end = 20.dp)
		)
		Text(
			text = contact,
			color = Color.White,
			fontSize = 18.sp,
			modifier = Modifier.padding(bottom = 8.dp),
		)
	}
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
	BusinessCardTheme {
		BusinessCardApp()
	}
}