package com.fortunetiasasger.exampale.presentation.screens.gamepersonsecond.view

import androidx.compose.runtime.Composable

import androidx.compose.ui.tooling.preview.Preview
import com.fortunetiasasger.exampale.presentation.screens.gamepersonsecond.use_case.Background_second
import com.fortunetiasasger.exampale.presentation.screens.screen_util.check_animation.SecondCards
import com.fortunetiasasger.exampale.presentation.screens.screen_util.orientation_cards.Orientation_cards
import com.fortunetiasasger.exampale.screens.setup_cards.com.fortunetiasasger.exampale.theme.Cards_spels_plus_composeTheme

@Preview(showBackground = true)
@Composable
private fun ShowScreenGame() {
    Cards_spels_plus_composeTheme {
        ScreenGamePersonSecond.ShowScreen()
    }
}

object ScreenGamePersonSecond {
    @Composable
    fun ShowScreen() {
        Background_second()
        Orientation_cards(
            SecondCards.SECOND.rotate,
            SecondCards.SECOND.action
        )
    }

}
