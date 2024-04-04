package br.senai.sp.jandira.mytrips


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mytrips.screens.GreetingLogin
import com.example.mytrips.screens.GreetingSignUp
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
                    val controlNavigation = rememberNavController()
                    NavHost(navController = controlNavigation, startDestination = "login") {
                        composable(route = "Login") { GreetingLogin(controlNavigation) }
                        composable(route = "SingUp") { GreetingSignUp(controlNavigation) }
                    }
                }
            }
        }
    }

}


//@Composable
//fun GreetingLogin() {
//    Box(
//        modifier = Modifier
//            .fillMaxWidth(),
//        contentAlignment = Alignment.TopEnd
//    ) {
//        Box(
//            modifier = Modifier
//                .background(
//                    color = Color(0xffCF06F0),
//                    shape = RoundedCornerShape(bottomStart = 18.8.dp)
//                )
//                .size(height = 40.dp, width = 120.dp)
//        )
//    }
//
//    // columnzona do meio
//    Column(
//        modifier = Modifier
//            .padding(top = 160.dp, start = 10.dp),
//    ) {
//
//        Text(
//            text = "Login",
//            color = Color(0xffCF06F0),
//            fontSize = 48.sp,
//            // fontwheiht é tipo de fonte: normal, italica, negrito, sublinada etc...
//            fontWeight = FontWeight.Bold
//        )
//
//        Text(
//            text = "Please sign in to continue",
//            color = Color(0xffA09C9C),
//            fontSize = 21.sp
//        )
//
//        // dentro da ultima column uma nova column para alinhar os outlinedTextFields
//        Column(
//            modifier = Modifier
//                // tamanho dessa coluninha filha
//                .size(height = 350.dp, width = 500.dp)
//
//// .dp == Para itens: COLUMN, BOX, ROW, CARD, ETC
//                // .sp == Para fontes
//
//                // margem personalizada p poder dar o espacamento para cima e um pouquinho em baixo p n ficar grudado
//                .padding(top = 90.dp, end = 10.dp, start = 10.dp)
//        ) {
//
//            var emailState = remember {
//                mutableStateOf("")
//            }
//
//            OutlinedTextField(
//                value = emailState.value,
//                onValueChange = {
//                    emailState.value = it
//                },
//                maxLines = 1,
//                modifier = Modifier
//                    // tamanho personalizado do input
//                    .size(width = 350.dp, height = 65.dp),
//                // bordinha redonda
//                shape = RoundedCornerShape(10.dp),
//                // text dentro do input
//                label = { Text(text = "E-mail") },
//                // acessar a biblioteca de icones do kotlin e usar um
//                leadingIcon = {
//                    Icon(
//                        // seleciona o icone ((no meu caso email))
//                        imageVector = Icons.Filled.Email,
//                        contentDescription = "",
//                        tint = Color(0xffCF06F0)
//                    )
//                },
//                // defino as cores p o input
//                colors = OutlinedTextFieldDefaults.colors(
//                    unfocusedBorderColor = Color(0xffCF06F0),
//                    focusedLabelColor = Color(0xffCF06F0),
//                    focusedBorderColor = Color(0xffCF06F0)
//                )
//            )
//
//            var passwordState = remember {
//                mutableStateOf("")
//            }
//
//            // meesmo processo para todos os outros outlineds que vierem
//            OutlinedTextField(
//                value = passwordState.value,
//                onValueChange = {
//                    passwordState.value = it
//                },
//                modifier = Modifier
//                    .padding(top = 10.dp)
//                    .size(width = 350.dp, height = 65.dp),
//                shape = RoundedCornerShape(10.dp),
//                label = { Text(text = "Password") },
//                leadingIcon = {
//                    Icon(
//                        imageVector = Icons.Filled.Lock,
//                        contentDescription = "",
//                        tint = Color(0xffCF06F0)
//                    )
//                },
//                colors = OutlinedTextFieldDefaults.colors(
//                    unfocusedBorderColor = Color(0xffCF06F0),
//                    focusedLabelColor = Color(0xffCF06F0),
//                    focusedBorderColor = Color(0xffCF06F0)
//                )
//            )
//            var mensagemerro = remember {
//                mutableStateOf("")
//            }
//            Text(text = mensagemerro.value, color = Color.Red)
//
//            // botao
//            Button(modifier = Modifier
//                .padding(top = 4.dp)
//                // alinho onde o botao vai ficar: End, Center, Start, Top, Bottom
//                .align(Alignment.End)
//                .size(height = 65.dp, width = 160.dp)
//                .padding(10.dp),
//                shape = RoundedCornerShape(10.dp),
//                // acessando as configs personalizadas do button p deixar ele bonitinho
//                colors = ButtonDefaults.buttonColors(
//                    // container equivale a area do botao
//                    containerColor = Color(0xffCF06F0)
//                ),
//                onClick = {
//                    if (emailState.value == "aluno" && passwordState.value == "1234") {
//                        mensagemerro.value = ""
//                    } else {
//                        mensagemerro.value = "Usuário ou senha incorreta"
//                    }
//
//                }) {
//
//                // text dentro del button
//                Text(
//                    modifier = Modifier
//                        .padding(end = 8.dp),
//                    fontWeight = FontWeight.ExtraBold,
//                    fontSize = 18.sp,
//                    text = "SING IN"
//                )
//
//                // iconizinho de seta do lado do text no button
//                Icon(
//                    imageVector = Icons.Filled.ArrowForward, contentDescription = ""
//                )
//            }
//            // tive que colocar essa row para por os dois texts lado a lado
//            Row(
//                modifier = Modifier
//                    .align(Alignment.End)
//                    .padding(end = 10.dp, top = 8.dp)
//            ) {
//                Text(
//                    modifier = Modifier
//                        .padding(end = 12.dp),
//                    color = Color(0xffA09C9C), text = "Don’t have an account?"
//                )
//                Text(
//                    modifier = Modifier,
//                    color = Color(0xffCF06F0),
//                    fontWeight = FontWeight.ExtraBold,
//                    text = "Sign up"
//                )
//            }
//        }
//    }
//
//    Box(
//        modifier = Modifier
//            // box pai, largura da tela
//            .fillMaxWidth()
//
//            // box, ficar da altura maxima
//            .fillMaxHeight(),
//
//        // alinhamento de todos os itens(filhos) dele pro canto inferior esquerdo
//        contentAlignment = Alignment.BottomStart
//    ) {
//        Box(
//            modifier = Modifier
//
//                // defini uma cor e ROUNDED CORNER SHAPE p formato personalizado
//                .background(color = Color(0xffCF06F0), shape = RoundedCornerShape(topEnd = 14.8.dp))
//                // defini altira e largura
//                .size(height = 40.dp, width = 120.dp)
//        )
//    }
//}
//
//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun GreetingPreview() {
//    MyTripsTheme {
//        GreetingLogin()
//
//    }
//}
//
//@Preview(showSystemUi = true, showBackground = true)
//@Composable
//fun GreetingSignUp() {
//    Box(
//        modifier = Modifier
//            .fillMaxWidth(),
//        contentAlignment = Alignment.TopEnd
//    ) {
//        Box(
//            modifier = Modifier
//                .background(
//                    color = Color(0xffCF06F0),
//                    shape = RoundedCornerShape(bottomStart = 10.dp)
//                )
//                .size(height = 40.dp, width = 120.dp)
//        )
//    }
//
//    Column(
//        modifier = Modifier.padding(top = 50.dp, start = 0.dp)
//    ) {
//        Text(
//            modifier = Modifier
//                .align(Alignment.CenterHorizontally),
//            color = Color(0xffCF06F0),
//            fontSize = 40.sp,
//            fontWeight = FontWeight.ExtraBold,
//            text = "Sign up"
//        )
//
//        Text(
//            modifier = Modifier
//                .align(Alignment.CenterHorizontally),
//            color = Color(0xffA09C9C),
//            fontSize = 15.sp,
//            text = "Create a new account"
//        )
//
//        Card(
//            // criei um card p posicionar onde a imagem ia ficar e poder manipular ELE ao envés da imagem
//            modifier = Modifier
//                .align(Alignment.CenterHorizontally)
//                .size(height = 120.dp, width = 100.dp)
//                .padding(top = 20.dp), shape = CircleShape,
//            border = BorderStroke(2.dp, Color(0xffCF06F0))
//
//            // basicamente... preparei ele p receber a imagem
//
//        ) {
//
//            // coloquei a imagem dentro do card
//            Image(
//                modifier = Modifier
//                    // ajustei o tamanho da imagem p ela n ficar estraña
//                    .size(height = 120.dp, width = 100.dp)
//                    // pus um offset desnecessario só p alinhar a imagem e alisar meu ego
//                    .offset(y = 6.dp),
//
//                // comandos p trazer a imagem do campo
//                painter = painterResource(id = R.drawable.profile),
//                contentDescription = ""
//            )
//
//        }
//
//        // fora do card e da imagem a imagem para a camerazinha
//        Image(
//            modifier = Modifier
//                // usei um offset p posicionar ela
//                .offset(x = 220.dp, y = -25.dp)
//                // defini um tamnho
//                .size(height = 30.dp, width = 30.dp),
//            painter = painterResource(id = R.drawable.camera),
//            contentDescription = ""
//        )
//
//        Column(
//            modifier = Modifier
//                .fillMaxHeight()
//                .align(Alignment.CenterHorizontally)
//        ) {
//
//            var usernameState = remember {
//                mutableStateOf("")
//            }
//
//            OutlinedTextField(
//                value = usernameState.value,
//                onValueChange = {
//                    usernameState.value = it
//                },
//                modifier = Modifier
//                    .size(width = 350.dp, height = 65.dp)
//                    .padding(start = 20.dp, end = 10.dp),
//                shape = RoundedCornerShape(10.dp),
//                label = { Text(text = "Username") },
//                leadingIcon = {
//                    Icon(
//                        imageVector = Icons.Filled.Person,
//                        contentDescription = "",
//                        tint = Color(0xffCF06F0)
//                    )
//
//                },
//                colors = OutlinedTextFieldDefaults.colors(
//                    unfocusedBorderColor = Color(0xffCF06F0),
//                    focusedLabelColor = Color(0xffCF06F0),
//                    focusedBorderColor = Color(0xffCF06F0)
//                )
//
//            )
//
//            var phoneState = remember {
//                mutableStateOf("")
//            }
//
//            OutlinedTextField(
//                value = phoneState.value,
//                onValueChange = {
//                    phoneState.value = it
//                },
//                modifier = Modifier
//                    .size(width = 350.dp, height = 65.dp)
//                    .padding(start = 20.dp, end = 10.dp),
//                shape = RoundedCornerShape(10.dp),
//                label = { Text(text = "Phone") },
//                leadingIcon = {
//                    Icon(
//                        imageVector = Icons.Filled.Call,
//                        contentDescription = "",
//                        tint = Color(0xffCF06F0)
//                    )
//
//                },
//                colors = OutlinedTextFieldDefaults.colors(
//                    unfocusedBorderColor = Color(0xffCF06F0),
//                    focusedLabelColor = Color(0xffCF06F0),
//                    focusedBorderColor = Color(0xffCF06F0)
//                )
//
//            )
//
//            var emailState = remember {
//                mutableStateOf("")
//            }
//
//            OutlinedTextField(
//                value = emailState.value,
//                onValueChange = {
//                    emailState.value = it
//                },
//                modifier = Modifier
//                    .size(width = 350.dp, height = 65.dp)
//                    .padding(start = 20.dp, end = 10.dp),
//                shape = RoundedCornerShape(10.dp),
//                label = { Text(text = "Email") },
//                leadingIcon = {
//                    Icon(
//                        imageVector = Icons.Filled.Email,
//                        contentDescription = "",
//                        tint = Color(0xffCF06F0)
//                    )
//
//                },
//                colors = OutlinedTextFieldDefaults.colors(
//                    unfocusedBorderColor = Color(0xffCF06F0),
//                    focusedLabelColor = Color(0xffCF06F0),
//                    focusedBorderColor = Color(0xffCF06F0)
//                )
//            )
//
//            var passwordState = remember {
//                mutableStateOf("")
//            }
//
//            OutlinedTextField(
//                value = passwordState.value,
//                onValueChange = {
//                    passwordState.value = it
//                },
//                modifier = Modifier
//                    .size(width = 350.dp, height = 65.dp)
//                    .padding(start = 20.dp, end = 10.dp),
//                shape = RoundedCornerShape(10.dp),
//                label = { Text(text = "Password") },
//                leadingIcon = {
//                    Icon(
//                        imageVector = Icons.Filled.Lock,
//                        contentDescription = "",
//                        tint = Color(0xffCF06F0)
//                    )
//
//                },
//                colors = OutlinedTextFieldDefaults.colors(
//                    unfocusedBorderColor = Color(0xffCF06F0),
//                    focusedLabelColor = Color(0xffCF06F0),
//                    focusedBorderColor = Color(0xffCF06F0)
//                )
//            )
//
//            var overState = remember {
//                mutableStateOf(false)
//            }
//
//            // row posicionada no start
//            Row {
//                Checkbox(
//                    modifier = Modifier
//                        .offset(y = 18.dp, x = 24.dp),
//                    checked = overState.value, onCheckedChange = {
//                        overState.value = it
//                    },
//                    colors = CheckboxDefaults.colors(
//                        checkedColor = Color(0xffCF06F0),
//                        uncheckedColor = Color(0xffCF06F0)
//                    )
//                )
//
//                Text(
//                    modifier = Modifier.padding(top = 30.dp, start = 20.dp),
//                    fontSize = 17.sp,
//                    text = "Over 18?"
//                )
//            }
//
//            Button(modifier = Modifier
//                .align(Alignment.CenterHorizontally)
//                .size(height = 80.dp, width = 330.dp)
//                .padding(top = 30.dp),
//                shape = RoundedCornerShape(10.dp),
//                colors = ButtonDefaults.buttonColors(containerColor = Color(0xffCF06F0)),
//                onClick = { /*TODO*/ }) {
//                Text(
//                    modifier = Modifier,
//                    fontWeight = FontWeight.ExtraBold,
//                    fontSize = 16.sp,
//                    text = "CREATE ACCOUNT"
//                )
//            }
//
//            Row(
//                modifier = Modifier
//                    .align(Alignment.End)
//                    .padding(end = 30.dp, top = 10.dp)
//            ) {
//                Text(
//                    modifier = Modifier
//                        .padding(end = 12.dp),
//                    color = Color(0xffA09C9C),
//                    text = "Already have an account?"
//                )
//
//                Text(
//                    modifier = Modifier,
//                    color = Color(0xffCF06F0),
//                    fontWeight = FontWeight.ExtraBold,
//                    text = "Sign in"
//                )
//            }
//
//            Box(
//                contentAlignment = Alignment.BottomStart,
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .fillMaxHeight()
//            ) {
//                Box(
//                    modifier = Modifier
//                        .background(
//                            color = Color(0xffCF06F0), shape = RoundedCornerShape(topEnd = 10.dp)
//                        )
//                        .size(height = 40.dp, width = 120.dp)
//                )
//            }
//
//        }
//    }
//}