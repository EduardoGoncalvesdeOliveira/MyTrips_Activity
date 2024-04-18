package com.example.mytrips.repositorio

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.example.mytrips.R
import com.example.mytrips.modelo.Viagem
import java.time.LocalDate

class ViagemRepositorio {

    @Composable
    fun listarTodasAsViagens(): List<Viagem>{

        val londres = Viagem(
            1,
            "Londres",
            "\n" +
                    "Londres, capital da Inglaterra e do Reino Unido, é uma cidade do século 21 com uma história que remonta à era romana. " +
                    "Seu centro abriga as sedes imponentes do Parlamento, a famosa torre do relógio do Big Ben e a Abadia de Westminster, local de coroação dos monarcas britânicos.",
            LocalDate.of(2019,2, 18),
            LocalDate.of(2019,2, 21),
            imagem = painterResource(id = R.drawable.matheus)
        )

        val canada = Viagem(
            2,
            "Canadá",
            "\n" +
                    "O Canadá é um país norte-americano que se estende desde os EUA, no sul, até o Círculo Polar Ártico, no norte." +
                    " Entre suas grandes cidades estão a gigantesca Toronto; Vancouver, centro cinematográfico da costa oeste; Montreal e Québec City, que falam francês; e a capital, Ottawa.",
            LocalDate.of(2025,2, 28),
            LocalDate.of(2025,7, 22),
            imagem = painterResource(id = R.drawable.paris)
        )

        val franca = Viagem(
            3,
            "Franca",
            "\n" +
                    "A França, na Europa Ocidental, tem cidades medievais, aldeias alpinas e praias mediterrâneas." +
                    " Paris, sua capital, é famosa pelas casas de alta costura, museus de arte clássica, como o Louvre, e monumentos como a Torre Eiffel." +
                    " O país também é conhecido pelos vinhos e pela cozinha sofisticada.",
            LocalDate.of(2025,12, 23),
            LocalDate.of(2026,2, 28),
            imagem = painterResource(id = R.drawable.paris)
        )

        val osasco = Viagem(
            4,
            "Osasco",
            "\n" +
                    "Osasco é um município brasileiro localizado na Região Metropolitana de São Paulo, no estado de São Paulo, no Brasil." +
                    " Nascido como um bairro da capital paulista no final do século XIX, tornou-se município emancipado após um plebiscito em 1962.",
            LocalDate.of(2024,4, 19),
            LocalDate.of(2024,4, 19),
            imagem = painterResource(id = R.drawable.matheus)
        )

        val carapicuiba = Viagem(
            5,
            "Carapicuíba",
            "\n" +
                    "Carapicuíba é um município no estado de São Paulo, Brasil, e faz parte da Região Metropolitana de São Paulo." +
                    " Fundada pelo padre José de Anchieta por volta de 1580," +
                    " Carapicuíba era uma das doze aldeias jesuíticas criadas com o objetivo de catequizar os povos originários da região de São Paulo. ",
            LocalDate.of(2024,4, 19),
            LocalDate.of(2024,4, 23),
            imagem = painterResource(id = R.drawable.london)
        )

        return listOf(londres, canada, franca, osasco, carapicuiba)

    }
}