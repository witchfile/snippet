package snippet_002

fun main(args: Array<String>) {
    val f1 = Friend("김선달", 30, "010-123-4567")
    val f2 = Friend("홍길동", 25, "010-456-7891")
    println(f1)
    println(f2)
    println(f1==f2)
    println(f1.hashCode() == f2.hashCode())

    val f3 = f2.copy(tel="010-234-5678")
    println(f3)
    println(f3==f2)
    println(f3===f2)
}

data class Friend (val name: String, val age: Int, val tel: String)