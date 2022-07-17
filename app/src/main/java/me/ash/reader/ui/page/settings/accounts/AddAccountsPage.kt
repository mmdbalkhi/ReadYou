package me.ash.reader.ui.page.settings.accounts

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material.icons.rounded.RssFeed
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import me.ash.reader.R
import me.ash.reader.ui.component.base.DisplayText
import me.ash.reader.ui.component.base.FeedbackIconButton
import me.ash.reader.ui.component.base.RYScaffold
import me.ash.reader.ui.component.base.Subtitle
import me.ash.reader.ui.page.common.RouteName
import me.ash.reader.ui.page.settings.SettingItem
import me.ash.reader.ui.theme.palette.onLight

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun AddAccountsPage(
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
                    DisplayText(text = "Add Accounts", desc = "")
                    Spacer(modifier = Modifier.height(16.dp))
                }
                item {
                    Subtitle(
                        modifier = Modifier.padding(horizontal = 24.dp),
                        text = "Local",
                    )
                    SettingItem(
                        title = "Local",
                        desc = "On my device",
                        icon = Icons.Rounded.RssFeed,
                        onClick = {
                            navController.navigate(RouteName.ACCOUNT_DETAILS) {
                                launchSingleTop = true
                            }
                        },
                    ) {}
                    Spacer(modifier = Modifier.height(24.dp))
                }
                item {
                    Subtitle(
                        modifier = Modifier.padding(horizontal = 24.dp),
                        text = "Services",
                    )
                    SettingItem(
                        title = "Feedlly",
                        desc = "feedlly.com",
                        iconPainter = painterResource(id = R.drawable.ic_feedly),
                        onClick = {},
                    ) {}
                    SettingItem(
                        title = "Inoreader",
                        desc = "inoreader.com",
                        iconPainter = painterResource(id = R.drawable.ic_inoreader),
                        onClick = {},
                    ) {}
                    Spacer(modifier = Modifier.height(24.dp))
                }
                item {
                    Subtitle(
                        modifier = Modifier.padding(horizontal = 24.dp),
                        text = "Self-Hosted",
                    )
                    SettingItem(
                        title = "FreshRss",
                        desc = "freshrss.org",
                        iconPainter = painterResource(id = R.drawable.ic_freshrss),
                        onClick = {

                        },
                    ) {}
                    SettingItem(
                        title = "Google Reader",
                        desc = "Google Reader API",
                        icon = Icons.Rounded.RssFeed,
                        onClick = {

                        },
                    ) {}
                    SettingItem(
                        title = "Fever",
                        desc = "Deprecated. Not recommended.",
                        iconPainter = painterResource(id = R.drawable.ic_fever),
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
fun AddAccountsPreview() {
    AddAccountsPage()
}
