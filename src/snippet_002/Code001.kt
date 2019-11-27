package snippet_002

fun main(args: Array<String>) {
    val m1 = Score(100, 200)
    val m2 = Score(300, 400)
    println(m1 + m2)
    println(m1 * m2)
    println(-m1)

    val m3 = Score(300, 400)
    val m4 = Score(300, 400)
    println(m3 == m4)
    println(m3 === m4)
    println(m3.equals(m4))
}

// equals(), hashCode(), toString(), copy() 자동 생성
data class Score(val a: Int, val b: Int) {
    // operator: 연산자를 오버로딩
    operator fun plus(other: Score): Score {
        return Score(a + other.a, b + other.b)
    }
}

// 클래스 외부에서 확장 (extension) 함수로 연산자(*) 오버로딩
operator fun Score.times(other: Score): Score {
    return Score(a * other.a, b * other.b)
}

// +a: a.unaryPlus()
// -a: a.unaryMinus()
// !a: a.not()
// ++a, a++: inc
// --a, a--: dec
operator fun Score.unaryMinus(): Score {
    return Score(-a, -b)
}