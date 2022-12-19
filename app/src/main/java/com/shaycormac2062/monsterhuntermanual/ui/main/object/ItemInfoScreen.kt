package com.shaycormac2062.monsterhuntermanual.ui.main.`object`

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.shaycormac2062.monsterhuntermanual.ui.theme.Swampy40
import com.shaycormac2062.monsterhuntermanual.ui.theme.Swampy80

@Preview(showBackground = true)
@Composable
fun AilmentScreen(

) {

}

@OptIn(ExperimentalMaterialApi::class)
@Preview(showBackground = true)
@Composable
fun BaseBottomSheet(

) {
    val modalBottomSheetState = rememberModalBottomSheetState(initialValue = ModalBottomSheetValue.Hidden)
    val scope = rememberCoroutineScope()
//    ModalBottomSheetLayout(
//        sheetContent = {
//            AilmentScreen()
//        },
//        sheetState = modalBottomSheetState,
//        sheetShape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp),
//        sheetBackgroundColor = if (isSystemInDarkTheme()) Swampy40 else Swampy80,
//    ) {
//        Scaffold(
//            topBar = { TopAppBar() },
//            backgroundColor = if (isSystemInDarkTheme()) Swampy40 else Swampy80
//        ) { padding ->  // We need to pass scaffold's inner padding to content. That's why we use Box.
//            Box(modifier = Modifier.padding(padding)) {
//                MainScreen(scope = scope, state = modalBottomSheetState)
//            }
//        }
//    }
}