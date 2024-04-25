package com.example.mytrips.utilitarios

import java.time.LocalDate

fun encurtaDatas(dataChegada: LocalDate, dataPartida: LocalDate): String{

    var diaChegada = dataChegada.dayOfMonth
    var mesChegada = dataChegada.month.toString()
    var mesChegadaAbreviado = mesChegada.substring(0,3)


    var diaPartida = dataPartida.dayOfMonth
    var mesPartida = dataPartida.month.toString()
    var mesPartidaAbreviado = mesPartida.substring(0,3)

    return "$diaChegada - $mesChegadaAbreviado  $diaPartida - $mesPartidaAbreviado"
}