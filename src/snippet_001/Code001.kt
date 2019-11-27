package snippet_001

/** 기본 타입의 리터럴
- Long 타입: L이며, 대문자만 가능하다. 예를 들면 100L
- Float 타입: F 또는 f이며, 예를 들면 123.7F, .234f, 2e3f
- Double 타입: 실수는 기본적으로 Double 타입으로 간주되므로 별도 표기가 없으며, 예를 들면 0.71, 7.0, 1.3e10, 1.3e-10.
- 16진수: 0x 또는 0X를 앞에 붙이며, 예를 들면 0XABFE, 0xcdfe
 */
fun main(args: Array<String>) {
    println(makeMessage1(1))
    println(makeMessage1(2))
    println(makeMessage2(1))
    println(makeMessage2(2))

    // test
    val s1 = """
        삶이 그대를 속일지라도 
        슬퍼하거나 노하지 말라 
        슬픈 날엔 참고 견디라 
        즐거운 날이 오고야 말리니 
        """
    println(s1)

    // test
    val s2 = """
        |삶이 그대를 속일지라도 
        |슬퍼하거나 노하지 말라 
        |슬픈 날엔 참고 견디라 
        |즐거운 날이 오고야 말리니 
        """.trimMargin()
    println(s2)

    // test
    val c = "77".toInt()
    val d = "123.5".toDouble()
    println("$c, $d")

    // test
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010
    println("$oneMillion, $creditCardNumber, $socialSecurityNumber, $hexBytes, $bytes")
}

fun makeMessage1(msgType: Int): String {
    return if(msgType == 1) "안녕하세요?" else "또 만났군요!!"
}

fun makeMessage2(msgType: Int) = if(msgType == 1) "날씨 좋죠?" else "참 맑군요!!"