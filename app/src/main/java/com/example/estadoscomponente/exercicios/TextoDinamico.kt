package com.example.estadoscomponente.exercicios

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun textoDinamico(modifier: Modifier = Modifier){

    var mensagemAparecer by remember {
        mutableStateOf(false)
    }

    var corAlternada by remember {
        mutableStateOf(false)
    }

    Column(
        modifier = modifier
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,


    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,

        ) {
            if(mensagemAparecer){
                Text(text = "Bem-vindo ao Kotlin!",
                    fontSize = 30.sp
                )
            }
            // Bem-vindo ao Kotlin!
            Button(onClick = {
                mensagemAparecer = !mensagemAparecer
            }) {
                Text(text = "Mostrar Mensagem")
            }
        }

        Spacer(modifier = Modifier
            .height(40.dp))

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,

        ){

            Text(text = "Olá Kotlin",
                color = if (corAlternada) Color.Blue else Color.Red,
                fontSize = 30.sp
            )

            Button(onClick = {
                corAlternada = !corAlternada
            }) {
                Text(text = "Trocar cor")
            }

        }
    }

}