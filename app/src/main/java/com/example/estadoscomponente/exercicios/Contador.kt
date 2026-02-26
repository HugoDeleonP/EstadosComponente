package com.example.estadoscomponente.exercicios

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun contador(modifier: Modifier = Modifier){

    Column(
        modifier = modifier
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {

        var valor by remember {
            mutableStateOf(0)
        }

        if(valor < 0){
            valor = 0
        }

        Text(text = valor.toString(),
            fontSize = 100.sp)

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){

            Button(onClick = {
                valor--
            }) {
                Text(text = "Decrementar")
            }

            Spacer(Modifier.width(50.dp))

            Button(onClick = {
                valor++
            }) {
                Text(text = "Incrementar")
            }
        }

        Spacer(Modifier.height(50.dp))


        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            Button(onClick = {
                valor = 0
            }) {
                Text(text = "Resetar")
            }

        }



    }

}