package week2.conditions

fun main() {
    val a = 10
    val b = 12
    val max = if (a > b) a else b;
    println(max)
    println(getDescription(Color.BLUE))
    println(respondToInput("y"))
    println(respondToInput("n o"))
    updateWeather(10)
}

fun updateWeather(degrees: Int) {
    val (description, colour) = when {
        degrees < 5 -> "cold" to Color.BLUE
        degrees < 23 -> "mild" to Color.ORANGE
        else -> "hot" to Color.RED
    }
    println(description + colour)
}

fun respondToInput(input: String) = when (input) {
    "y", "yes" -> "I'm glag you agree"
    "n", "no" -> "Sorry yo hear that"
    else -> "I don't understand you"
}

fun getDescription(color: Color): String =
    when (color) {
        Color.RED -> "hot" // no need break operator
        Color.BLUE -> "cold"
        Color.ORANGE -> "mild"
    }

enum class Color {
    BLUE, ORANGE, RED
}