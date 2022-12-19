import androidx.compose.animation.*
import androidx.compose.animation.core.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.PagerState
import com.shaycormac2062.monsterhuntermanual.R
import com.shaycormac2062.monsterhuntermanual.ui.theme.Green40
import com.shaycormac2062.monsterhuntermanual.ui.theme.White
import com.shaycormac2062.monsterhuntermanual.utils.ApplicationException

@Composable
fun AppText(
    modifier: Modifier? = null,
    text: String,
    size: TextUnit? = null,
    color: Color? = null
) {
    Text(
        modifier = modifier ?: Modifier,
        color = color ?: if (isSystemInDarkTheme()) Green40 else White,
        text = text,
        fontFamily = FontFamily(Font(R.font.coolvetica_rg)),
        fontSize = size ?: 16.sp,
        overflow = TextOverflow.Ellipsis,
        maxLines = 7,
    )
}

@Composable
fun LoadingProgressBar() {
    val infiniteTransition = rememberInfiniteTransition()
    val iconState by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(
                1000,
                delayMillis = 500,
                easing = FastOutLinearInEasing
            ),
            repeatMode = RepeatMode.Reverse
        )
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .alpha(iconState),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo_night),
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(100.dp)
                .clip(RoundedCornerShape(16.dp)),
            contentDescription = null
        )
        AppText(
            modifier = Modifier.padding(top = 8.dp),
            text = "Loading",
            color = White
        )
    }
}

@OptIn(ExperimentalAnimationApi::class, ExperimentalPagerApi::class)
@Composable
fun ErrorMessage(
    exception: ApplicationException,
    onClick: () -> Unit,
) {
    var stage by remember {
        mutableStateOf(false)
    }
    AnimatedVisibility(
        visible = stage,
        enter = scaleIn() + expandVertically(expandFrom = Alignment.CenterVertically),
        exit = scaleOut() + shrinkVertically(shrinkTowards = Alignment.CenterVertically),
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = rememberVectorPainter(
                    image = ImageVector.vectorResource(
                        id = if (isSystemInDarkTheme()) {
                            R.drawable.error_night
                        } else R.drawable.error_day
                    )
                ),
                contentDescription = null,
                modifier = Modifier.size(100.dp)
            )
            val color = if (isSystemInDarkTheme()) {
                Green40
            } else White
            AppText(
                modifier = Modifier.padding(
                    vertical = 8.dp,
                    horizontal = 56.dp
                ),
                text = exception.message,
                color = color,
                size = 24.sp
            )
            AppButton(
                modifier = Modifier
                    .width(140.dp)
                    .height(40.dp)
                    .background(AppGradient()),
                text = stringResource(id = R.string.try_again),
                onClick = {
                    onClick
                    stage = false
                }
            )
        }
    }
    LaunchedEffect(key1 = true) {
        stage = true
    }
}

@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun AppButton(
    modifier: Modifier? = null,
    pagerState: PagerState? = null,
    text: String,
    textColor: Color? = null,
    onClick: () -> Unit
) {
    AnimatedVisibility(
        visible = if (pagerState != null) pagerState.currentPage == 2 else true,
        enter = scaleIn() + expandVertically(expandFrom = Alignment.CenterVertically),
        exit = scaleOut() + shrinkVertically(shrinkTowards = Alignment.CenterVertically),
    ) {
        Button(
            contentPadding = PaddingValues(),
            onClick = { onClick() })
        {
            Box(
                modifier = modifier ?: Modifier,
                contentAlignment = Alignment.Center
            ) {
                AppText(text = text, color = textColor)
            }
        }
    }
}

@Composable
fun AppBackground() {
    Image(
        painter = painterResource(id = R.drawable.monster_hunter_wallpaper),
        contentDescription = null,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black),
        contentScale = ContentScale.FillBounds
    )
}

@Composable
fun AppGradient() = Brush.horizontalGradient(
    listOf(
        Color.DarkGray,
        Color.Black
    )
)
