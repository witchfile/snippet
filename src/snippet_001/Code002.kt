package snippet_001

fun main(args: Array<String>) {

    // 비트연산
    println(8 shr 2)
    println(8 shl 4)
    println(0xC0 and 0x0C)
    println(0xC0 or 0x0C)
    println(0xC0 xor 0xC0)

    // 논리연산
    val b1: Boolean = true
    val b2: Boolean = false
    val b3: Boolean = false

    if((b1 || b2) && !b3)
        println("True!!")

    if((b1 or b2) and b3.not())
        println("True!!")
}