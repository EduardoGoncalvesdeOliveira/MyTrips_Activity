package br.senai.sp.jandira.mytrips


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxColors
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mytrips.R
import com.example.mytrips.ui.theme.MyTripsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTripsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    GreetingLogin()
                    GreetingSignUp()

                }
            }
        }
    }
}

@Composable
fun GreetingLogin() {
    Box(
        modifier = Modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.TopEnd
    ) {
        Box(
            modifier = Modifier
                .background(
                    color = Color(0xffCF06F0),
                    shape = RoundedCornerShape(bottomStart = 18.8.dp)
                )
                .size(height = 40.dp, width = 120.dp)
        )
    }

    Column(
        modifier = Modifier
            .padding(top = 160.dp, start = 10.dp),
    ) {

        Text(
            text = "Login",
            color = Color(0xffCF06F0),
            fontSize = 48.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "Please sign in to continue",
            color = Color(0xffA09C9C),
            fontSize = 21.sp
        )

        Column(
            modifier = Modifier
                .size(height = 350.dp, width = 500.dp)
                .padding(top = 100.dp, end = 10.dp, start = 10.dp)
        ) {
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .size(width = 350.dp, height = 65.dp),
                shape = RoundedCornerShape(10.dp),
                label = { Text(text = "E-mail") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Email,
                        contentDescription = "",
                        tint = Color(0xffCF06F0)
                    )
                },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color(0xffCF06F0),
                )
            )

            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .padding(top = 10.dp)
                    .size(width = 350.dp, height = 65.dp),
                shape = RoundedCornerShape(10.dp),
                label = { Text(text = "Password") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Lock,
                        contentDescription = "",
                        tint = Color(0xffCF06F0)
                    )
                },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color(0xffCF06F0),
                )
            )

            Button(modifier = Modifier
                .padding(top = 4.dp)
                .align(Alignment.End)
                .size(height = 65.dp, width = 160.dp)
                .padding(10.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xffCF06F0)
                ),
                onClick = { /*TODO*/ }) {
                Text(
                    modifier = Modifier
                        .padding(end = 8.dp),
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 18.sp,
                    text = "SING IN"
                )

                Icon(
                    imageVector = Icons.Filled.ArrowForward, contentDescription = ""
                )
            }
            Row(
                modifier = Modifier
                    .align(Alignment.End)
                    .padding(end = 10.dp, top = 8.dp)
            ) {
                Text(
                    modifier = Modifier
                        .padding(end = 12.dp),
                    color = Color(0xffA09C9C), text = "Don’t have an account?"
                )
                Text(
                    modifier = Modifier,
                    color = Color(0xffCF06F0),
                    fontWeight = FontWeight.ExtraBold,
                    text = "Sign up"
                )
            }
        }
    }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        contentAlignment = Alignment.BottomStart
    ) {
        Box(
            modifier = Modifier
                .background(color = Color(0xffCF06F0), shape = RoundedCornerShape(topEnd = 14.8.dp))
                .size(height = 40.dp, width = 120.dp)
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    MyTripsTheme {
        GreetingLogin()

    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun GreetingSignUp() {
    Box(
        modifier = Modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.TopEnd
    ) {
        Box(
            modifier = Modifier
                .background(
                    color = Color(0xffCF06F0),
                    shape = RoundedCornerShape(bottomStart = 10.dp)
                )
                .size(height = 40.dp, width = 120.dp)
        )
    }

    Column(
        modifier = Modifier.padding(top = 50.dp, start = 0.dp)
    ) {
        Text(
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            color = Color(0xffCF06F0),
            fontSize = 40.sp,
            fontWeight = FontWeight.ExtraBold,
            text = "Sign up"
        )

        Text(
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            color = Color(0xffA09C9C),
            fontSize = 15.sp,
            text = "Create a new account"
        )

        Card(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .size(height = 120.dp, width = 100.dp)
                .padding(top = 20.dp), shape = CircleShape,
            border = BorderStroke(2.dp, Color(0xffCF06F0))

        ) {
            Image(
                modifier = Modifier
                    .size(height = 120.dp, width = 100.dp)
                    .offset(y = 6.dp),
                painter = painterResource(id = R.drawable.profile),
                contentDescription = ""
            )

        }
        Image(
            modifier = Modifier
                .offset(x = 220.dp, y = -25.dp)
                .size(height = 30.dp, width = 30.dp),
            painter = painterResource(id = R.drawable.camera),
            contentDescription = ""
        )

        Column(
            modifier = Modifier
                .fillMaxHeight()
                .align(Alignment.CenterHorizontally)
        ) {
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .size(width = 350.dp, height = 65.dp)
                    .padding(start = 20.dp, end = 10.dp),
                shape = RoundedCornerShape(10.dp),
                label = { Text(text = "Username") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Person,
                        contentDescription = "",
                        tint = Color(0xffCF06F0)
                    )

                },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color(0xffCF06F0),
                )

            )

            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .size(width = 350.dp, height = 65.dp)
                    .padding(start = 20.dp, end = 10.dp),
                shape = RoundedCornerShape(10.dp),
                label = { Text(text = "Phone") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Call,
                        contentDescription = "",
                        tint = Color(0xffCF06F0)
                    )

                },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color(0xffCF06F0),
                )

            )
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .size(width = 350.dp, height = 65.dp)
                    .padding(start = 20.dp, end = 10.dp),
                shape = RoundedCornerShape(10.dp),
                label = { Text(text = "Email") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Email,
                        contentDescription = "",
                        tint = Color(0xffCF06F0)
                    )

                },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color(0xffCF06F0),
                )
            )
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .size(width = 350.dp, height = 65.dp)
                    .padding(start = 20.dp, end = 10.dp),
                shape = RoundedCornerShape(10.dp),
                label = { Text(text = "Password") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Lock,
                        contentDescription = "",
                        tint = Color(0xffCF06F0)
                    )

                },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color(0xffCF06F0),
                )
            )

            Row {
                Checkbox(modifier = Modifier
                    .offset(y = 18.dp, x = 24.dp),
                    checked = false, onCheckedChange = {},
                    colors = CheckboxDefaults.colors(checkedColor = Color(0xffCF06F0),
                        uncheckedColor = Color(0xffCF06F0))
                )

                Text(
                    modifier = Modifier.padding(top = 30.dp, start = 20.dp),
                    fontSize = 17.sp,
                    text = "Over 18?"
                )
            }

            Button(modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .size(height = 80.dp, width = 330.dp)
                .padding(top = 30.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xffCF06F0)),
                onClick = { /*TODO*/ }) {
                Text(
                    modifier = Modifier,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 16.sp,
                    text = "CREATE ACCOUNT"
                )
            }

            Row(
                modifier = Modifier
                    .align(Alignment.End)
                    .padding(end = 30.dp, top = 10.dp)
            ) {
                Text(
                    modifier = Modifier
                        .padding(end = 12.dp),
                    color = Color(0xffA09C9C),
                    text = "Already have an account?"
                )

                Text(
                    modifier = Modifier,
                    color = Color(0xffCF06F0),
                    fontWeight = FontWeight.ExtraBold,
                    text = "Sign in"
                )
            }

            Box(
                contentAlignment = Alignment.BottomStart,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
            ) {
                Box(
                    modifier = Modifier
                        .background(
                            color = Color(0xffCF06F0), shape = RoundedCornerShape(topEnd = 10.dp)
                        )
                        .size(height = 40.dp, width = 120.dp)
                )
            }

        }

    }

}