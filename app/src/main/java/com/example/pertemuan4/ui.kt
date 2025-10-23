package com.example.pertemuan4











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

    }


}

