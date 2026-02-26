package com.example.estadoscomponente.exercicios

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
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
import androidx.compose.ui.unit.sp

@Composable
fun jogoParImpar(modifier: Modifier = Modifier){

    var numero by remember {
        mutableStateOf("")
    }

    var paridade by remember {
        mutableStateOf("")
    }

    Column(
        modifier = modifier
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(text = numero,
            fontSize = 20.sp
        )

        Button(onClick = {

            numero = (1..100).random().toString()
        }) {
            Text(text = "Gerar número")
        }
        
        Spacer(modifier = Modifier.height(50.dp))

        var numeroInteiro = numero.toIntOrNull();

        if(numeroInteiro != null){
            paridade = if(numeroInteiro % 2 == 0){
                "Número par"
            } else {
                "Número ímpar"
            }
        }



        Text(text = paridade)



    }

}

@Composable
fun loginSimples(modifier: Modifier = Modifier){

    var usuario by remember {
        mutableStateOf("")
    }

    var senha by remember {
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
    ) {

        TextField(value = usuario,
            onValueChange = {
            input -> usuario = input
            },
            label = {
                Text("Digite o usuário")
            })

        Spacer(modifier = Modifier.height(50.dp))

        TextField(value = senha,
            onValueChange = {
                input -> senha = input
            },
            label = {
                Text("Digite a senha")
            }
        )


        Spacer(modifier = Modifier.height(150.dp))

        mensagem = if(usuario == "admin" && senha == "1234"){
            "Login realizado"
        } else{
            "Usuário ou senha inválidos"
        }

        Button(onClick = {

        }) {
            Text(text = "Entrar")
        }



    }
}