package snippet_002

fun main() {
    val instance1 = InvokeOperator("코틀린을")

    // InvokeOperator 인스턴스 를 함수처럼 호출
    instance1("배우자")
}

// 일반적인 코드보다는 DSL(Domain Specific Language)에서 유용하게 사용.
// 예를 들어, gradle 에서 모듈 의존 관계(dependencies)를 정의할 때 사용.
class InvokeOperator(val makeMessage1: String) {
    // '()' 연산자를 오버로딩
    operator fun invoke(makeMessage2: String) {
        println("$makeMessage1 $makeMessage2!")
    }
}