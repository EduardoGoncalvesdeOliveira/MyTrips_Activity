package com.example.mytrips.repositorio

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.example.mytrips.R
import com.example.mytrips.modelo.Viagem
import java.time.LocalDate

class ViagemRepositorio {

    @Composable
    fun listarTodasAsViagens(): List<Viagem> {

        val londres = Viagem(
            1,
            "Londres",
            "Londres, capital da Inglaterra e do Reino Unido, é uma cidade do século 21 com uma história que remonta à era romana. ",
            LocalDate.of(2019, 2, 18),
            LocalDate.of(2019, 2, 21),
            imagem = painterResource(id = R.drawable.london)
        )

        val porto = Viagem(
            1,
            "Porto",
            "Porto é uma cidade costeira no noroeste de Portugal conhecida pelas pontes imponentes e pela produção de vinho do Porto.",
            LocalDate.of(2022, 2, 21),
            LocalDate.of(2025, 1, 1),
            imagem = painterResource(id = R.drawable.porto)
        )

        val ontario = Viagem(
            2,
            "Ontário",
            "Ontário é uma província do Canada que faz fronteira com os Estados Unidos e os Grandes Lagos",
            LocalDate.of(2020, 7, 28),
            LocalDate.of(2025, 7, 22),
            imagem = painterResource(id = R.drawable.canada)
        )

        val franca = Viagem(
            3,
            "Paris",
            "A França, na Europa Ocidental, tem cidades medievais, aldeias alpinas e praias mediterrâneas.",
            LocalDate.of(2025, 12, 23),
            LocalDate.of(2026, 2, 28),
            imagem = painterResource(id = R.drawable.placeholderimage)
        )

        val osasco = Viagem(
            4,
            "Osasco",
            "Osasco é um município brasileiro localizado na Região Metropolitana de São Paulo, no estado de São Paulo, no Brasil.",
            LocalDate.of(2024, 4, 19),
            LocalDate.of(2024, 4, 19),
            imagem = painterResource(id = R.drawable.osasco)
        )

        val carapicuiba = Viagem(
            5,
            "Carapicuíba",
            "Carapicuíba é um município no estado de São Paulo, Brasil, e faz parte da Região Metropolitana de São Paulo.",
            LocalDate.of(2024, 4, 19),
            LocalDate.of(2024, 4, 23),
            imagem = painterResource(id = R.drawable.carapicuiba)
        )

        return listOf(londres, porto, ontario, franca, osasco, carapicuiba)

    }
}