package snippet_001

fun main() {
    // for #1
    val item1 = listOf("사과", "바나나", "키위")
    for(item in item1) {
        println(item)
    }
    // for #2
    val item2 = listOf("사과", "바나나", "키위")
    for(index in item2.indices) {
        println("item at $index is ${item2[index]}")
    }
    // for #3
    val item3 = arrayOf("사과", "바나나", "키위")
    for(index in item3.indices) {
        println("item at $index is ${item3[index]}")
    }


    // while #1
    val items = listOf("사과", "바나나", "키위")
    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }
    // while #2
    index = 0
    do {
        println("item at $index is ${items[index]}")
        index++
    } while (index < items.size)
}