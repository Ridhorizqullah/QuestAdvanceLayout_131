package com.example.pertemuan4

import androidx.compose.foundation.layout.Row


@Composable
fun AktivitasPertama(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(top = 100.dp)
            .fillMaxSize(),
        horizootallyAlignment = Alignment.CenterHorizontally

        ) {

        Text(
            text = stringResource(id = R.string.prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold

    }  (
            text = stringResource(id = R.string.univ),
            fontSize = 20.sp
            )

        spacer(modifier = Modifier.height(25.dp))

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
            )
            val gambar = painterResource(id = R.drawable.logo)

            Image(
                painter = gambar,
                contentDescription = null,
                modifier = Modifier
                    .size(100.dp)
                    .padding(5.dp)
            )

            spacer(modifier = Modifier.width(30.dp))

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
    } Box (
        modifier = Modifier.fillmaxsixe()

    ) {


}

