package com.example.estadoscomponente.exercicios

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
fun Calculadora(modifier: Modifier = Modifier){

    var numero1 by remember {
        mutableStateOf("")
    }

    var numero2 by remember {
        mutableStateOf("")
    }
    
    var total by remember {
        mutableStateOf(0)
    }

    Column(
        modifier = modifier
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){

        TextField(
            value = numero1,
            onValueChange = {
            input -> numero1 = input
            },
            label = {
                Text(text = "Digite o primeiro número: ")
            }
        )

        Spacer(modifier = Modifier.height(40.dp))

        TextField(
            value = numero2,
            onValueChange = {
                    input -> numero2 = input
            },
            label = {
                Text(text = "Digite o segundo número: ")
            }
        )

        Spacer(modifier = Modifier.height(100.dp))
        
        var numero1Inteiro = numero1.toIntOrNull()
        var numero2Inteiro = numero2.toIntOrNull()


        Button(onClick = {
            
            if( numero1Inteiro != null && numero2Inteiro != null){
                total = numero1Inteiro + numero2Inteiro
            }
            
        }) {
            Text(text = "Somar")
        }

        Spacer(modifier = Modifier.height(40.dp))

        Text(text = "Resultado: $total")


    }


}

@Composable
fun contadorLimite(modifier: Modifier = Modifier){



    Column(
        modifier = modifier
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        var valor by remember {
            mutableStateOf(0)
        }

        var mensagem by remember {
            mutableStateOf("")
        }

        var botaoAtivado by remember {
            mutableStateOf(true)
        }

        Text(text = valor.toString(),
            fontSize = 100.sp)

        Spacer(Modifier.width(50.dp))

        Button(onClick = {
            valor++
        },
        enabled = botaoAtivado) {
            Text(text = "Incrementar")
        }



        mensagem = if(valor >= 10){
            botaoAtivado = false
            "Limite atingido"
        } else{
            ""
        }
        
        Text(text = mensagem)
    }
}