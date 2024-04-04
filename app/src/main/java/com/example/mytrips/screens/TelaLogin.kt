package com.example.mytrips.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.mytrips.ui.theme.MyTripsTheme

@Composable
fun GreetingLogin(controleNavegacao: NavHostController) {
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

    // columnzona do meio
    Column(
        modifier = Modifier
            .padding(top = 160.dp, start = 10.dp),
    ) {

        Text(
            text = "Login",
            color = Color(0xffCF06F0),
            fontSize = 48.sp,
            // fontwheiht é tipo de fonte: normal, italica, negrito, sublinada etc...
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "Please sign in to continue",
            color = Color(0xffA09C9C),
            fontSize = 21.sp
        )

        // dentro da ultima column uma nova column para alinhar os outlinedTextFields
        Column(
            modifier = Modifier
                // tamanho dessa coluninha filha
                .size(height = 350.dp, width = 500.dp)

// .dp == Para itens: COLUMN, BOX, ROW, CARD, ETC
                // .sp == Para fontes

                // margem personalizada p poder dar o espacamento para cima e um pouquinho em baixo p n ficar grudado
                .padding(top = 100.dp, end = 10.dp, start = 10.dp)
        ) {

            var emailState = remember {
                mutableStateOf("")
            }

            OutlinedTextField(
                value = emailState.value,
                onValueChange = {
                    emailState.value = it
                },
                maxLines = 1,
                modifier = Modifier
                    // tamanho personalizado do input
                    .size(width = 350.dp, height = 65.dp),
                // bordinha redonda
                shape = RoundedCornerShape(10.dp),
                // text dentro do input
                label = { Text(text = "E-mail") },
                // acessar a biblioteca de icones do kotlin e usar um
                leadingIcon = {
                    Icon(
                        // seleciona o icone ((no meu caso email))
                        imageVector = Icons.Filled.Email,
                        contentDescription = "",
                        tint = Color(0xffCF06F0)
                    )
                },
                // defino as cores p o input
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color(0xffCF06F0),
                    focusedLabelColor = Color(0xffCF06F0),
                    focusedBorderColor = Color(0xffCF06F0)
                )
            )

            var passwordState = remember {
                mutableStateOf("")
            }

            // meesmo processo para todos os outros outlineds que vierem
            OutlinedTextField(
                value = passwordState.value,
                onValueChange = {
                    passwordState.value = it
                },
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
                    focusedLabelColor = Color(0xffCF06F0),
                    focusedBorderColor = Color(0xffCF06F0)
                )
            )
            var mensagemerro = remember {
                mutableStateOf("")
            }
            Text(text = mensagemerro.value, color = Color.Red)

            // botao
            Button(modifier = Modifier
                .padding(top = 4.dp)
                // alinho onde o botao vai ficar: End, Center, Start, Top, Bottom
                .align(Alignment.End)
                .size(height = 65.dp, width = 160.dp)
                .padding(10.dp),
                shape = RoundedCornerShape(10.dp),
                // acessando as configs personalizadas do button p deixar ele bonitinho
                colors = ButtonDefaults.buttonColors(
                    // container equivale a area do botao
                    containerColor = Color(0xffCF06F0)
                ),
                onClick = {
                    if (emailState.value == "aluno" && passwordState.value == "1234") {
                        mensagemerro.value = ""
                        controleNavegacao.navigate("SingUo")
                    } else {
                        mensagemerro.value = "Usuário ou senha incorreta"
                    }

                }) {

                // text dentro del button
                Text(
                    modifier = Modifier
                        .padding(end = 8.dp),
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 18.sp,
                    text = "SING IN"
                )

                // iconizinho de seta do lado do text no button
                Icon(
                    imageVector = Icons.Filled.ArrowForward, contentDescription = ""
                )
            }
            // tive que colocar essa row para por os dois texts lado a lado
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
// box pai, largura da tela
            .fillMaxWidth()

// box, ficar da altura maxima
            .fillMaxHeight(),

// alinhamento de todos os itens(filhos) dele pro canto inferior esquerdo
        contentAlignment = Alignment.BottomStart
    ) {
        Box(
            modifier = Modifier

                // defini uma cor e ROUNDED CORNER SHAPE p formato personalizado
                .background(color = Color(0xffCF06F0), shape = RoundedCornerShape(topEnd = 14.8.dp))
                // defini altira e largura
                .size(height = 40.dp, width = 120.dp)
        )
    }
}

//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun GreetingPreview() {
//    MyTripsTheme {
//        GreetingLogin(controleNavegacao)
//    }
//}