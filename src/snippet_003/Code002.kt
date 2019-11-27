package snippet_003

fun main(args: Array<String>) {
    val v1 = calc(2, 7, {a, b -> a * b})
    val v2 = calc(3, 100, {a, b -> a + b})
    val v3 = calc(50, 200, {a, b -> a - b})
    println("The result is $v1")
    println("The result is $v2")
    println("The result is $v3")
}

fun calc( value1: Int,
          value2: Int,
          execCode: (codeParam1: Int, codeParam2: Int) -> Int
    ): Int {
    return execCode(value1, value2)
}