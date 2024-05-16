package com.example.mytrips.repositorio

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.mytrips.R
import com.example.mytrips.modelo.Viagem
import java.time.LocalDate

class ViagemRepositorio {

    @Composable
    fun listarTodasAsViagens(): List<Viagem> {

        val londres = Viagem(
            1,
            "Londres",
            stringResource(id = R.string.london),
            LocalDate.of(2019, 2, 18),
            LocalDate.of(2019, 2, 21),
            imagem = painterResource(id = R.drawable.london)
        )

        val porto = Viagem(
            1,
            "Porto",
            stringResource(id = R.string.porto),
            LocalDate.of(2022, 2, 21),
            LocalDate.of(2025, 1, 1),
            imagem = painterResource(id = R.drawable.porto)
        )

        val ontario = Viagem(
            2,
            "Ontário",
            stringResource(id = R.string.ontario),
            LocalDate.of(2020, 7, 28),
            LocalDate.of(2025, 7, 22),
            imagem = painterResource(id = R.drawable.canada)
        )

        val franca = Viagem(
            3,
            "Paris",
            stringResource(id = R.string.paris),
            LocalDate.of(2025, 12, 23),
            LocalDate.of(2026, 2, 28),
            imagem = painterResource(id = R.drawable.placeholderimage)
        )

        val osasco = Viagem(
            4,
            "Osasco",
            stringResource(id = R.string.osasco),
            LocalDate.of(2024, 4, 19),
            LocalDate.of(2024, 4, 19),
            imagem = painterResource(id = R.drawable.osasco)
        )

        val carapicuiba = Viagem(
            5,
            "Carapicuíba",
            stringResource(id = R.string.carapicuiba),
            LocalDate.of(2024, 4, 19),
            LocalDate.of(2024, 4, 23),
            imagem = painterResource(id = R.drawable.carapicuiba)
        )

        return listOf(londres, porto, ontario, franca, osasco, carapicuiba)

    }
}