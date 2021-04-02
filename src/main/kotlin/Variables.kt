fun main() {
    val nonEdit = "Hello"
    println(nonEdit)
//    nonEdit = "World!"

    var edit = "Hello"
    println(edit)
    edit = "World"
    println(edit)

//    var nullable = "Hello"
//    nullable = null

    var nullable: String? = "Hello"
    nullable = null
}