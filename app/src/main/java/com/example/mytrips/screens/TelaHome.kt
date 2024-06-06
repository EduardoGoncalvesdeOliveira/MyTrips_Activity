package com.example.mytrips.screens


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mytrips.R
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BeachAccess
import androidx.compose.material.icons.filled.DownhillSkiing
import androidx.compose.material.icons.filled.Landscape
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.mytrips.ui.theme.MyTripsTheme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.mytrips.repositorio.ViagemRepositorio
import com.example.mytrips.ui.theme.MyTripsTheme
import com.example.mytrips.utilitarios.encurtaDatas
import com.example.mytrips.modelo.Viagem
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment
import kotlin.time.Duration.Companion.days


@Composable
fun GreetingHome(controleNavegacao: NavHostController) {

    val viagens = ViagemRepositorio().listarTodasAsViagens()
    MyTripsTheme {
        Surface {

            var pesquisarState = remember {
                mutableStateOf("")
            }

            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .background(Color(0xffF6F6F6))
            ) {
                Surface(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(220.dp)
                ) {
                    Image(
                        painter = painterResource(
                            id = R.drawable.paris
                        ),
                        contentDescription = "",
                        contentScale = ContentScale.Crop
                    )
                    Column(
                        horizontalAlignment = Alignment.End,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp)
                    ) {
                        Card(
                            modifier = Modifier
                                .padding(end = 6.dp)
                                .size(height = 60.dp, width = 60.dp),
                            border = BorderStroke(2.dp, Color(0xffffffff)),
                            shape = CircleShape
                        ) {
                            Image(
                                contentScale = ContentScale.Crop,
                                painter = painterResource(id = R.drawable.matheus),
                                contentDescription = ""
                            )
                        }
                        Text(
                            modifier = Modifier
                                .padding(end = 4.dp),
                            text = "Susanna Hoffs",
                            fontFamily = FontFamily.Default,
                            fontWeight = FontWeight.Light,
                            color = Color.White
                        )
                        Column(

                            modifier = Modifier
                                .fillMaxWidth()
                                .fillMaxHeight(),
                            verticalArrangement = Arrangement.Bottom


                        ) {
                            Row(
                                modifier = Modifier
                            ) {
                                Icon(
                                    imageVector = Icons.Default.LocationOn,
                                    contentDescription = "",
                                    tint = Color.White,
                                    modifier = Modifier.size(height = 20.dp, width = 20.dp)
                                )
                                Text(
                                    text = stringResource(id = R.string.where_are_you),
                                    color = Color.White
                                )
                            }
                            Text(
                                modifier = Modifier
                                    .width(110.dp)
                                    .padding(start = 10.dp),
                                text = "My Trips",
                                color = Color.White,
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }


                    }
                }
                Column(
                    modifier = Modifier
                        .padding(top = 6.dp)
                ) {
                    Text(
                        modifier = Modifier.padding(8.dp),
                        text = stringResource(id = R.string.categories),
                        color = Color.Black,
                        fontSize = 16.sp
                    )

                    Row {
                        LazyRow {
                            item() {
                                Card(
                                    modifier = Modifier
                                        .padding(horizontal = 8.dp),
                                ) {
                                    Column(
                                        modifier = Modifier
                                            .size(height = 80.dp, width = 130.dp)
                                            .background(color = Color(0xffCF06F0)),
                                        Arrangement.Center,
                                        Alignment.CenterHorizontally
                                    ) {
                                        Icon(
                                            imageVector = Icons.Default.Landscape,
                                            contentDescription = "",
                                            tint = Color.White
                                        )
                                        Text(
                                            text = stringResource(id = R.string.montain),
                                            color = Color.White
                                        )
                                    }
                                }

                            }
                            item() {
                                Card(
                                    modifier = Modifier
                                ) {
                                    Column(
                                        modifier = Modifier
                                            .size(height = 80.dp, width = 130.dp)
                                            .background(color = Color(0xffEAABF4)),
                                        Arrangement.Center,
                                        Alignment.CenterHorizontally
                                    ) {
                                        Icon(
                                            imageVector = Icons.Default.DownhillSkiing,
                                            contentDescription = "",
                                            tint = Color.White
                                        )
                                        Text(
                                            text = stringResource(id = R.string.snow),
                                            color = Color.White
                                        )
                                    }
                                }

                            }
                            item() {
                                Card(
                                    modifier = Modifier.padding(start = 8.dp)
                                ) {
                                    Column(

                                        modifier = Modifier
                                            .size(height = 80.dp, width = 130.dp)
                                            .background(color = Color(0xffEAABF4)),
                                        Arrangement.Center,
                                        Alignment.CenterHorizontally
                                    ) {
                                        Icon(
                                            imageVector = Icons.Default.BeachAccess,
                                            contentDescription = "",
                                            tint = Color.White
                                        )
                                        Text(
                                            text = stringResource(id = R.string.beach),
                                            color = Color.White

                                        )
                                    }
                                }

                            }
                        }
                    }
                }
                OutlinedTextField(
                    value = pesquisarState.value,
                    onValueChange = {
                        pesquisarState.value = it
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 8.dp, vertical = 8.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color.Transparent,
                        focusedBorderColor = Color.Transparent,
                        unfocusedContainerColor = Color.White,
                        focusedContainerColor = Color.White
                    ),
                    shape = RoundedCornerShape(50.dp),
                    placeholder = {
                        Text(
                            text = stringResource(id = R.string.search_your_destiny),
                            color = Color(0xffB7B7B7)
                        )
                    },
                    trailingIcon = {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "",
                            tint = Color(0xffB7B7B7)
                        )
                    },

                    )

                Column {
                    Text(
                        modifier = Modifier.padding(start = 13.dp, bottom = 8.dp),
                        text = stringResource(id = R.string.past_trips),
                        color = Color.Black,
                        fontSize = 16.sp
                    )

                    LazyColumn() {
                        items(viagens) {
                            Card(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    //.height(250.dp)
                                    .padding(horizontal = 20.dp)
                                    .padding(top = 10.dp),
                                elevation = CardDefaults.cardElevation(6.dp)
                            ) {
                                Column(
                                    modifier = Modifier
                                        .background(color = Color.White)
                                        .fillMaxSize(),
                                ) {
                                    Surface(
                                        modifier = Modifier
                                            .height(140.dp)
                                            .fillMaxWidth()
                                            .padding(4.dp),
                                        RoundedCornerShape(6.dp)
                                    ) {
                                        Image(
                                            modifier = Modifier,
                                            painter = if (it.imagem == null) painterResource(id = R.drawable.placeholderimage) else it.imagem!!,
                                            contentDescription = "",
                                            contentScale = ContentScale.Crop,
                                        )
                                    }

                                    Text(
                                        modifier = Modifier
                                            .padding(horizontal = 10.dp, vertical = 2.dp),
                                        color = Color(0xffCF06F0),
                                        fontSize = 16.sp,
                                        text = "${it.destino}, ${it.dataChegada.year}"
                                    )
                                    Text(
                                        modifier = Modifier
                                            .padding(horizontal = 10.dp, vertical = 6.dp),
                                        color = Color(0xffA09C9C),
                                        fontSize = 12.sp,
                                        text = it.descricao
                                    )

                                    Row(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(end = 12.dp),
                                        horizontalArrangement = Arrangement.End
                                    ) {
                                        Text(
                                            modifier = Modifier
                                                .padding(vertical = 6.dp),
                                            color = Color(0xffCF06F0),
                                            fontSize = 14.sp,
                                            text = encurtaDatas(it.dataChegada, it.dataPartida),
                                            textAlign = TextAlign.Right
                                        )
                                    }

                                }
                            }

                        }
                    }
                }


            }

        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun TelaHomePreview() {
    MyTripsTheme {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            GreetingHome(controleNavegacao = rememberNavController())
        }
    }
}