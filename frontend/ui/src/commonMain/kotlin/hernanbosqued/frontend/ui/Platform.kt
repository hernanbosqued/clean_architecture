package hernanbosqued.frontend.ui

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform