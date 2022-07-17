package me.ash.reader.ui.page.settings.accounts

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import me.ash.reader.R
import me.ash.reader.ui.component.base.*
import me.ash.reader.ui.page.settings.SettingItem
import me.ash.reader.ui.theme.palette.onLight

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun AccountDetailsPage(
    navController: NavHostController = rememberAnimatedNavController(),
) {
    val context = LocalContext.current

    RYScaffold(
        containerColor = MaterialTheme.colorScheme.surface onLight MaterialTheme.colorScheme.inverseOnSurface,
        navigationIcon = {
            FeedbackIconButton(
                imageVector = Icons.Rounded.ArrowBack,
                contentDescription = stringResource(R.string.back),
                tint = MaterialTheme.colorScheme.onSurface
            ) {
                navController.popBackStack()
            }
        },
        content = {
            LazyColumn {
                item {
                    DisplayText(text = "Local", desc = "")
                    Spacer(modifier = Modifier.height(16.dp))
                }
                item {
                    Subtitle(
                        modifier = Modifier.padding(horizontal = 24.dp),
                        text = "Display",
                    )
                    SettingItem(
                        title = "Description",
                        desc = "Read You",
                        onClick = {

                        },
                    ) {}
                    Spacer(modifier = Modifier.height(24.dp))
                }
                item {
                    Subtitle(
                        modifier = Modifier.padding(horizontal = 24.dp),
                        text = "Syncing",
                    )
                    SettingItem(
                        title = "Sync",
                        desc = "Every 15 minutes",
                        onClick = {

                        },
                    ) {}
                    SettingItem(
                        title = "Sync once on start",
                        onClick = {},
                    ) {
                        RYSwitch(
                            activated = false
                        ) {}
                    }
                    SettingItem(
                        title = "Only on Wi-Fi",
                        onClick = {},
                    ) {
                        RYSwitch(
                            activated = false
                        ) {}
                    }
                    SettingItem(
                        title = "Only when charging",
                        onClick = {
                        },
                    ) {
                        RYSwitch(
                            activated = false
                        ) {}
                    }
                    SettingItem(
                        title = "Keep archived items",
                        desc = "1 month",
                        onClick = {

                        },
                    ) {}
                    SettingItem(
                        title = "Block list",
                        onClick = {

                        },
                    ) {}
                    Spacer(modifier = Modifier.height(24.dp))
                }
                item {
                    Subtitle(
                        modifier = Modifier.padding(horizontal = 24.dp),
                        text = "Account",
                    )
                    SettingItem(
                        title = "Delete account",
                        onClick = {

                        },
                    ) {}
                    Spacer(modifier = Modifier.height(24.dp))
                }
                item {
                    Spacer(modifier = Modifier.height(24.dp))
                    Spacer(modifier = Modifier.windowInsetsBottomHeight(WindowInsets.navigationBars))
                }
            }
        }
    )
}

@Preview
@Composable
fun AccountDetailsPreview() {
    AccountDetailsPage()
}
