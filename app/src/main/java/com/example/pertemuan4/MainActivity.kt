package com.example.pertemuan4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize // Impor ini tidak digunakan di AktivitasPertama, bisa dihapus jika tidak perlu.
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.pertemuan4.ui.theme.Pertemuan4Theme
import com.example.pertemuan4.AktivitasPertama // pastikan import ini ada

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Pertemuan4Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    AktivitasPertama(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AktivitasPertamaPreview() {
    Pertemuan4Theme {
        AktivitasPertama(modifier = Modifier)
    }
}
