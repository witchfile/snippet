package snippet_001

import java.time.LocalDate

fun main() {
    val start = LocalDate.now()
    val end = start..start.plusDays(15)
    println(start.plusWeeks(1) in end)
    println(end)
}