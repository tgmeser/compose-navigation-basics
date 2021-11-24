package com.babyapps.navigationbasics

sealed class Screen(val route: String) {
    object MainScreen : Screen("main_screen")
    object DetailScreen : Screen("detail_screen")

    fun withArgs(vararg args: String): String = buildString {
        append(route)
        args.forEach {
            // Arguments may be many, so we used varagr for that
            // Creating a url through income arguments to use in route for navigation
            append("/$it")
        }
    }
}