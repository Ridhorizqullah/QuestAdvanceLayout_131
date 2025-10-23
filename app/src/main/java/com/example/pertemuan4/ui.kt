package com.example.pertemuan4

import android.provider.MediaStore
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AktivitasPertama(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(top = 100.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Teks program studi
        Text(
            text = stringResource(id = R.string.prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold
        )

        // Teks universitas
        Text(
            text = stringResource(id = R.string.univ),
            fontSize = 20.sp
        )

        // Spacer antar elemen
        Spacer(modifier = Modifier.height(25.dp))

        // Card berisi logo dan info mahasiswa
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.DarkGray
            )
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(8.dp)
            ) {
                // Logo universitas
                val gambar = painterResource(id = R.drawable.images)
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp)
                        .padding(5.dp)
                )

                // Spacer horizontal
                Spacer(modifier = Modifier.width(25.dp))

                // Column untuk teks nama & alamat
                Column {
                    Text(
                        text = stringResource(id = R.string.nama),
                        fontSize = 30.sp,
                        fontFamily = FontFamily.Cursive,
                        color = Color.White,
                        modifier = Modifier.padding(top = 25.dp)
                    )
                    Text(
                        text = stringResource(id = R.string.alamat),
                        fontSize = 20.sp,
                        color = Color.Yellow,
                        modifier = Modifier.padding(top = 10.dp)
                    )
                }
            }
        }
        //card 2
        Card(
            modifier = modifier
                .fillMaxWidth()
                .padding(12.dp), // Add a comma here
            colors = CardDefaults.cardColors(
                containerColor = Color.Blue
            )
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(8.dp)
            ) {
                val gambar = painterResource(id = R.drawable.images)
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp)
                        .padding(5.dp)
                )

                Spacer(modifier = Modifier.width(25.dp))

                Column {
                    Text(
                        text = stringResource(id = R.string.nama1),
                        fontSize = 30.sp,
                        fontFamily = FontFamily.Cursive,
                        color = Color.White,
                        modifier = Modifier.padding(top = 25.dp)
                    )
                    Text(
                        text = stringResource(id = R.string.nim1),
                        fontSize = 20.sp,
                        color = Color.White,
                        modifier = Modifier.padding(top = 5.dp)
                    )
                    Text(
                        text = stringResource(id = R.string.alamat1),
                        fontSize = 20.sp,
                        color = Color.White,
                        modifier = Modifier.padding(top = 5.dp)
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(25.dp))

        //card 3
        Card (
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.Red
            )

        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(8.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.images),
                    contentDescription = null,
                    modifier = modifier
                        .size(100.dp)
                        .padding(5.dp)
                )
                Spacer(modifier = modifier.width(30.dp))

                Column {
                    Text(
                        text = stringResource(id = R.string.nama2),
                        fontSize = 30.sp,
                        fontFamily = FontFamily.Cursive,
                        color = Color.White,
                        modifier = Modifier.padding(top = 25.dp)
                    )

                }
            }
        }

        // Spacer untuk memberi ruang sebelum Box copyright
        Spacer(modifier = Modifier.weight(1f))

        // Box untuk copyright di bawah
        Box(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = stringResource(id = R.string.copy),
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 50.dp)
            )
        }

        Spacer(modifier = Modifier.height(25.dp))

    }
}
