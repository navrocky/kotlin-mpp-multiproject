import kotlinx.datetime.Clock

fun helloFromLib() {
    val now = Clock.System.now()
    println("Hello from lib")
    println("Current time is $now")
}