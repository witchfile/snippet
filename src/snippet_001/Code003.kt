package snippet_001

fun main(args: Array<String>) {
    val p1 = Customer("홍길동", "010-1234-5678")
    val p2 = Customer("김선달", "010-5678-1234")
    println(p1 < p2)
    println(p1 > p2)
}

class Customer(val name: String, val phone: String) : Comparable<Customer> {
    override fun compareTo(other: Customer): Int {
        return compareValuesBy(this, other, Customer::name, Customer::phone)
    }
}
