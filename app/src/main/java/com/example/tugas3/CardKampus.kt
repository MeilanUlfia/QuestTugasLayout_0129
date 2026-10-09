package com.example.tugas3

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight

@Composable
fun CardKampus(
    nama: String,
    lokasi: String,
    warnaCard: Color,
    warnaLokasi: Color,
    modifier: Modifier = Modifier,
    fontNama: FontFamily? = null
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(dimensionResource(R.dimen.card_corner)))
            .background(warnaCard)
            .padding(dimensionResource(R.dimen.card_padding)),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(R.drawable.logo_umy),
            contentDescription = stringResource(R.string.logo_desc),
            modifier = Modifier.size(dimensionResource(R.dimen.logo_size))
        )
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = dimensionResource(R.dimen.text_spacing))
        ) {
            Text(
                text = nama,
                color = colorResource(R.color.text_putih),
                fontSize = spResource(R.dimen.text_name),
                fontWeight = FontWeight.Bold,
                fontFamily = fontNama
            )
            Text(
                text = lokasi,
                color = warnaLokasi,
                fontSize = spResource(R.dimen.text_detail)
            )
        }
        Image(
            painter = painterResource(R.drawable.logo_umy),
            contentDescription = stringResource(R.string.logo_desc),
            modifier = Modifier.size(dimensionResource(R.dimen.logo_size))
        )

    }
}