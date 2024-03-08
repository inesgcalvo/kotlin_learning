fun hello() {
    return println("Hello World!")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun sum2(x: Int, y: Int) = x + y

fun printMessageWithPrefix(message: String, prefix: String) {
    println("[$prefix] $message")
}

fun printMessageWithPrefix2(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun printMessage(message: String) {
    println(message)
}

fun main() {
    hello()
    println(sum(1, 2))
    println(sum2(1, 2))
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    printMessageWithPrefix2("Hello", "Log")
    printMessageWithPrefix2("Hello")
    printMessageWithPrefix2(prefix = "Log", message = "Hello")
    printMessage("Hello")
}

main()

// Lambda expressions
    // Lambda expressions are written within curly braces {}.
    // The parameters followed by an ->.
    // The function body after the ->.
    // string is a function parameter.
    // string has type String.
fun main2(){
    println({ string: String -> string.uppercase() }("lambda 1"))
    // declare a lambda without parameters
    println({ println("Lambda 2") })
    // Assign to variable
    val upperCaseString = { string: String -> string.uppercase() }
    println(upperCaseString("Lambda 3"))
}
main2()

// Pass to another function
    // filter(): accepts a lambda expression as a predicate:
val numbers = listOf(-1, -2, -3, 4, 5, 6)
val positives = numbers.filter { x -> x > 0 }
val negatives = numbers.filter { x -> x < 0 }
println("Postitives: $positives\nNegatives: $negatives")

    // map() function to transform items in a collection:
val doubled = numbers.map { x -> x * 2 }
val tripled = numbers.map { x -> x * 3 }
println("Doubled: $doubled\nTripled: $tripled")




