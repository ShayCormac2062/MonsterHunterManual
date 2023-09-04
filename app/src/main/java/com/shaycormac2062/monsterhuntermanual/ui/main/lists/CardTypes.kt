package com.shaycormac2062.monsterhuntermanual.ui.main.lists

import AppText
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.shaycormac2062.monsterhuntermanual.domain.model.ailments.Ailment
import com.shaycormac2062.monsterhuntermanual.domain.model.armor.Armor
import com.shaycormac2062.monsterhuntermanual.domain.model.charms.Charm
import com.shaycormac2062.monsterhuntermanual.domain.model.decorations.Decoration
import com.shaycormac2062.monsterhuntermanual.domain.model.events.Event
import com.shaycormac2062.monsterhuntermanual.domain.model.monsters.Monster
import com.shaycormac2062.monsterhuntermanual.domain.model.skills.Skill
import com.shaycormac2062.monsterhuntermanual.domain.model.weapons.Weapon
import com.shaycormac2062.monsterhuntermanual.ui.theme.Swampy40
import com.shaycormac2062.monsterhuntermanual.ui.theme.Swampy80

@Composable
fun AilmentCard(
    element: Ailment
) {
    Card(
        modifier = Modifier
            .padding(
                horizontal = 24.dp,
                vertical = 6.dp
            )
            .clip(
                RoundedCornerShape(
                    topStart = 48.dp,
                    bottomEnd = 48.dp
                )
            )
            .alpha(.5f)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(if (isSystemInDarkTheme()) Swampy40 else Swampy80),
            verticalArrangement = Arrangement.Center
        ) {
            AppText(
                modifier = Modifier
                    .padding(horizontal = 32.dp)
                    .padding(top = 12.dp),
                text = element.name.toString(),
                size = 30.sp
            )
            AppText(
                modifier = Modifier
                    .padding(
                        horizontal = 32.dp,
                        vertical = 12.dp
                    ),
                text = element.description.toString(),
                maxLines = 2
            )
        }
    }
}

@Composable
fun ArmorCard(
    element: Armor
) {
    Card(
        modifier = Modifier
            .padding(
                horizontal = 24.dp,
                vertical = 6.dp
            )
            .clip(
                RoundedCornerShape(
                    topStart = 48.dp,
                    bottomEnd = 48.dp
                )
            )
            .alpha(.5f)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(if (isSystemInDarkTheme()) Swampy40 else Swampy80),
            verticalArrangement = Arrangement.Center
        ) {
            AppText(
                modifier = Modifier
                    .padding(horizontal = 32.dp)
                    .padding(top = 12.dp),
                text = element.name.toString(),
                size = 30.sp
            )
            AppText(
                modifier = Modifier
                    .padding(
                        horizontal = 32.dp,
                        vertical = 12.dp
                    ),
                text = "Rank: ${element.rank ?: "Unknown"}",
                maxLines = 2
            )
        }
    }
}

@Composable
fun CharmCard(
    element: Charm
) {
    Card(
        modifier = Modifier
            .padding(
                horizontal = 24.dp,
                vertical = 6.dp
            )
            .clip(
                RoundedCornerShape(
                    topStart = 48.dp,
                    bottomEnd = 48.dp
                )
            )
            .alpha(.5f)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(if (isSystemInDarkTheme()) Swampy40 else Swampy80),
            verticalArrangement = Arrangement.Center
        ) {
            AppText(
                modifier = Modifier
                    .padding(horizontal = 32.dp)
                    .padding(top = 12.dp),
                text = element.name.toString(),
                size = 30.sp
            )
            AppText(
                modifier = Modifier
                    .padding(
                        horizontal = 32.dp,
                        vertical = 12.dp
                    ),
                text = "Ranks:\n${
                    element.ranks?.forEach {
                        "${element.ranks.indexOf(it) + 1}: ${it?.name ?: "No"}"
                    }
                }",
            )
        }
    }
}

@Composable
fun DecorationCard(
    element: Decoration
) {
    Card(
        modifier = Modifier
            .padding(
                horizontal = 24.dp,
                vertical = 6.dp
            )
            .clip(
                RoundedCornerShape(
                    topStart = 48.dp,
                    bottomEnd = 48.dp
                )
            )
            .alpha(.5f)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(if (isSystemInDarkTheme()) Swampy40 else Swampy80),
            verticalArrangement = Arrangement.Center
        ) {
            AppText(
                modifier = Modifier
                    .padding(horizontal = 32.dp)
                    .padding(top = 12.dp),
                text = element.name.toString(),
                size = 30.sp
            )
            AppText(
                modifier = Modifier
                    .padding(
                        horizontal = 32.dp,
                        vertical = 12.dp
                    ),
                text = "Rarity: ${element.rarity ?: "Common"}",
                maxLines = 2
            )
        }
    }
}

@Composable
fun MonsterCard(
    element: Monster
) {
    Card(
        modifier = Modifier
            .padding(
                horizontal = 24.dp,
                vertical = 6.dp
            )
            .clip(
                RoundedCornerShape(
                    topStart = 48.dp,
                    bottomEnd = 48.dp
                )
            )
            .alpha(.5f)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(if (isSystemInDarkTheme()) Swampy40 else Swampy80),
            verticalArrangement = Arrangement.Center
        ) {
            AppText(
                modifier = Modifier
                    .padding(horizontal = 32.dp)
                    .padding(top = 12.dp),
                text = element.name.toString(),
                size = 30.sp
            )
            AppText(
                modifier = Modifier
                    .padding(
                        horizontal = 32.dp,
                        vertical = 12.dp
                    ),
                text = element.description.toString(),
                maxLines = 2
            )
        }
    }
}

@Composable
fun SkillCard(
    element: Skill
) {
    Card(
        modifier = Modifier
            .padding(
                horizontal = 24.dp,
                vertical = 6.dp
            )
            .clip(
                RoundedCornerShape(
                    topStart = 48.dp,
                    bottomEnd = 48.dp
                )
            )
            .alpha(.5f)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(if (isSystemInDarkTheme()) Swampy40 else Swampy80),
            verticalArrangement = Arrangement.Center
        ) {
            AppText(
                modifier = Modifier
                    .padding(horizontal = 32.dp)
                    .padding(top = 12.dp),
                text = element.name.toString(),
                size = 30.sp
            )
            AppText(
                modifier = Modifier
                    .padding(
                        horizontal = 32.dp,
                        vertical = 12.dp
                    ),
                text = element.description.toString(),
                maxLines = 2
            )
        }
    }
}

@Composable
fun WeaponCard(
    element: Weapon
) {
    Card(
        modifier = Modifier
            .padding(
                horizontal = 24.dp,
                vertical = 6.dp
            )
            .clip(
                RoundedCornerShape(
                    topStart = 48.dp,
                    bottomEnd = 48.dp
                )
            )
            .alpha(.5f)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(if (isSystemInDarkTheme()) Swampy40 else Swampy80),
            verticalArrangement = Arrangement.Center
        ) {
            AppText(
                modifier = Modifier
                    .padding(horizontal = 32.dp)
                    .padding(top = 12.dp),
                text = element.name.toString(),
                size = 30.sp
            )
            AppText(
                modifier = Modifier
                    .padding(
                        horizontal = 32.dp,
                        vertical = 12.dp
                    ),
                text = "Boost type: ${element.boostType ?: "Unknown"}",
                maxLines = 2
            )
        }
    }
}

@Composable
fun EventCard(
    element: Event
) {
    Card(
        modifier = Modifier
            .padding(
                horizontal = 24.dp,
                vertical = 6.dp
            )
            .clip(
                RoundedCornerShape(
                    topStart = 48.dp,
                    bottomEnd = 48.dp
                )
            )
            .alpha(.5f)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(if (isSystemInDarkTheme()) Swampy40 else Swampy80),
            verticalArrangement = Arrangement.Center
        ) {
            AppText(
                modifier = Modifier
                    .padding(horizontal = 32.dp)
                    .padding(top = 12.dp),
                text = element.name.toString(),
                size = 30.sp
            )
            AppText(
                modifier = Modifier
                    .padding(
                        horizontal = 32.dp,
                        vertical = 12.dp
                    ),
                text = element.description.toString(),
                maxLines = 2
            )
        }
    }
}
