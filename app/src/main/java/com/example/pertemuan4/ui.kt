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
    )





}

