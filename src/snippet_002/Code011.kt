package snippet_002_dup

sealed class FriendType {
    class School(val name: String, val schoolType: Int) : FriendType()
    class Company: FriendType()
    class Sns : FriendType()
    class Others: FriendType()
}
/** 동일한 구현
sealed class FriendType
class School(val name: String, val schoolType: Int) : FriendType()
class Company: FriendType()
class Sns : FriendType()
class Others: FriendType()
*/
fun main() {
    val s1 = FriendType.School("교동", 1)
    println(s1.name)
    println(s1.schoolType)
}