package snippet_001

fun main() {
    val e = arrayOf(7, 8, 9) // Int타입의 요소 세개를 저장한 배열을 생성한다
    val list = newList(1, 2, 3, *e, 5)
    println(list)
}

fun <T> newList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) // ts는 배열이다
        result.add(t)
    return result
}