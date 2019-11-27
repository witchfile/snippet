package snippet_001

fun main() {
    println(calcCombination(45, 6))
}

fun calcCombination(whole: Int, selected: Int): Double {
    if ((selected > whole) || (selected <= 0) || (whole <= 0)) {
        return -1.0
    }
    else if (selected == whole) {
        return 1.0
    }

    fun calcFactorial(num: Int): Double {
        var total: Double = 1.0
        for (i in num downTo 1) {
            total *= i
        }
        return total
    }

    return calcFactorial(whole) /
            (calcFactorial(whole - selected) * calcFactorial(selected))
}