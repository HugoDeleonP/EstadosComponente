package com.example.estadoscomponente

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.estadoscomponente.exercicios.Calculadora
import com.example.estadoscomponente.exercicios.campoNome
import com.example.estadoscomponente.exercicios.contador
import com.example.estadoscomponente.exercicios.contadorLimite
import com.example.estadoscomponente.exercicios.jogoParImpar
import com.example.estadoscomponente.exercicios.loginSimples
import com.example.estadoscomponente.exercicios.textoDinamico
import com.example.estadoscomponente.ui.theme.EstadosComponenteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EstadosComponenteTheme {
                loginSimples(
                    Modifier
                        .fillMaxSize()
                        .safeDrawingPadding()
                )
            }
        }
    }
}
