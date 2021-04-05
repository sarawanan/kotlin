fun main() {
    val upperCase1: (String) -> String = {str:String -> str.toUpperCase()}
    val upperCase2: (String) -> String = {str -> str.toUpperCase()}
    val upperCase3 = {str: String -> str.toUpperCase()}
    val upperCase4: (String) -> String = {it.toUpperCase()}
    val upperCase5: (String) -> String = String::toUpperCase

    println(upperCase1("Hello"))
    println(upperCase2("Hello"))
    println(upperCase3("Hello"))
    println(upperCase4("Hello"))
    println(upperCase5("Hello"))
}