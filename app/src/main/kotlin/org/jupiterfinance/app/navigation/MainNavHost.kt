package org.jupiterfinance.app.navigation

import android.util.Log

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute

import org.jupiterfinance.app.navigation.routes.HomeRoute
import org.jupiterfinance.app.platform.LocalMainNavController
import org.jupiterfinance.app.ui.animations.navigation.NavigationAnimationTransitions
import org.jupiterfinance.app.ui.screens.home.HomeScreen

import kotlin.reflect.typeOf

@Composable
fun MainNavHost() {
  val navController = LocalMainNavController.current

  NavHost(
    navController = navController,
    startDestination = HomeRoute,
    enterTransition = { NavigationAnimationTransitions.enterTransition },
    exitTransition = { NavigationAnimationTransitions.exitTransition },
    popEnterTransition = { NavigationAnimationTransitions.popEnterTransition },
    popExitTransition = { NavigationAnimationTransitions.popExitTransition },
  ) {
    composable<HomeRoute> {
      HomeScreen()
    }
  }
}
