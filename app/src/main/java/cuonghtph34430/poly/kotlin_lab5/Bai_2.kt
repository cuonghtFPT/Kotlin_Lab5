package cuonghtph34430.poly.kotlin_lab5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import cuonghtph34430.poly.kotlin_lab5.R

class Bai_2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LightSwitch()
        }
    }

    @Preview
    @Composable
    fun LightSwitch() {
        Column(
            modifier = androidx.compose.ui.Modifier
                .fillMaxSize()
                .background(Color.Black),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            val isChecked = remember { mutableStateOf(false) }
            if (isChecked.value) {
                Image(
                    painter = painterResource(id = R.drawable.den_2),
                    contentDescription = "Light is On",
                    modifier = androidx.compose.ui.Modifier.fillMaxWidth(),
                    contentScale = androidx.compose.ui.layout.ContentScale.FillWidth
                )
            } else {
                Image(
                    painter = painterResource(id = R.drawable.den_1),
                    contentDescription = "Light is Off",
                    modifier = androidx.compose.ui.Modifier.fillMaxWidth(),
                    contentScale = androidx.compose.ui.layout.ContentScale.FillWidth
                )
            }
            Spacer(modifier = androidx.compose.ui.Modifier.height(24.dp))
            Switch(
                checked = isChecked.value,
                onCheckedChange = { isChecked.value = it },
                colors = SwitchDefaults.colors(
                    checkedThumbColor = Color.Green,
                    uncheckedThumbColor = Color.Gray,
                    checkedTrackColor = Color.Green.copy(alpha = 0.5f),
                    uncheckedTrackColor = Color.Gray.copy(alpha = 0.5f),
                    checkedBorderColor = Color.Green.copy(alpha = 0.75f),
                )
            )
        }
    }
}
