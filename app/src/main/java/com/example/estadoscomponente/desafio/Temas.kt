import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun alternaTema(modifier: Modifier = Modifier){

    var temaEscuro by remember {
        mutableStateOf(false)
    }

    var corFundo = Color(0xFFFFFFFF);
    var corTexto = Color(0xFFFFFFFF);
    var textoBotao = "Modo claro";
    var corBotao = Color(0xFF000000);

    if(temaEscuro){
        corFundo = Color(0xFF707070);
        corTexto = Color(0xFF000000);
        textoBotao = "Modo escuro";
        corBotao = Color(0xFFFFFFFF);
    }

    Column(
        modifier = modifier
            .background(corFundo),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ){

        Button(
            onClick = {
                temaEscuro = !temaEscuro;
            },

            colors = ButtonDefaults.buttonColors(
                containerColor = corBotao,
                contentColor = corTexto
            )
        ){
            Text(text = textoBotao
            )
        }

    }
}
