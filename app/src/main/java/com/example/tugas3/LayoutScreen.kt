package com.example.tugas3

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight

@Composable
fun LayoutScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = dimensionResource(R.dimen.screen_padding_horizontal)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier.padding(
                top = dimensionResource(R.dimen.header_padding_top),
                bottom = dimensionResource(R.dimen.header_padding_bottom)
            ),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(R.string.header_title),
                fontSize = spResource(R.dimen.text_title),
                fontWeight = FontWeight.Bold
            )
            Text(
                text = stringResource(R.string.header_subtitle),
                fontSize = spResource(R.dimen.text_subtitle),
                fontWeight = FontWeight.Bold
            )
        }

        val fontScript = FontFamily(Font(R.font.dancing_script))
        Column(verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.card_spacing))) {
            CardKampus(
                nama = stringResource(R.string.nama_1),
                lokasi = stringResource(R.string.lokasi_1),
                warnaCard = colorResource(R.color.card_abu),
                warnaLokasi = colorResource(R.color.text_kuning),
                fontNama = fontScript
            )
            CardKampus(
                nama = stringResource(R.string.nama_2),
                lokasi = stringResource(R.string.lokasi_2),
                warnaCard = colorResource(R.color.card_ungu),
                warnaLokasi = colorResource(R.color.text_kuning)
            )
            CardKampus(
                nama = stringResource(R.string.nama_3),
                lokasi = stringResource(R.string.lokasi_3),
                warnaCard = colorResource(R.color.card_biru),
                warnaLokasi = colorResource(R.color.text_putih)
            )
            CardKampus(
                nama = stringResource(R.string.nama_4),
                lokasi = stringResource(R.string.lokasi_4),
                warnaCard = colorResource(R.color.card_hijau),
                warnaLokasi = colorResource(R.color.text_putih)
            )
        }

        Spacer(modifier = Modifier.weight(1f))

        Text(
            text = stringResource(R.string.copyright),
            fontSize = spResource(R.dimen.text_footer),
            modifier = Modifier.padding(bottom = dimensionResource(R.dimen.footer_padding_bottom))
        )
    }
}