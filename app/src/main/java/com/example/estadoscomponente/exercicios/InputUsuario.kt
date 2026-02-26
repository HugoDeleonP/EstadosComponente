package com.example.estadoscomponente.exercicios

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun campoNome(modifier: Modifier = Modifier){

    var nome by remember {
        mutableStateOf("")
    }

    var idade by remember {
        mutableStateOf("")
    }

    var mensagem by remember {
        mutableStateOf("")
    }

    Column(
        modifier = modifier
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ){

        Column {

            Text(text = "Olá, $nome!")

            Spacer(modifier = Modifier.height(50.dp))

            TextField(
                value = nome,
                onValueChange = {
                    input -> nome = input
                },
                label = {
                    Text(text = "Digite o nome: ")
                }


            )
            

        }

        Spacer(modifier = Modifier.height(50.dp))


        Column {

            TextField(
                value = idade,
                onValueChange = {
                        input -> idade = input
                },
                label = {
                    Text(text = "Digite a idade: ")
                }

            )



            var idadeNumerica = idade.toIntOrNull();

            if (idadeNumerica != null) {
                mensagem = if (idadeNumerica >= 18) {
                    "Maior de idade"
                } else {
                    "Menor de idade"
                }
            }

            Text(text = mensagem)

        }

    }


}