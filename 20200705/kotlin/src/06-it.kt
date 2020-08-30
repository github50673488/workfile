data class Person(var name: String, var age: Int = 0, var city: String = "")

fun main() {
    val adam = Person("Adam").apply {
        age = 20                       // 和 this.age = 20 或者 adam.age = 20 一样
        city = "London"
    }
    println(adam)
}
