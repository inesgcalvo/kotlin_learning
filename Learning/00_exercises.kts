// Exercise: Complete the code to make the program print "Mary is 20 years old" to standard output:
fun solution001() {
    val name = "Mary"
    val age = 20
    print("$name is $age years old")
}
println(solution001())

///////
///////
///////

// Exercise: Explicitly declare the correct type for each variable:
fun solution002() {
    val a: Int = 1000
    val b: String = "log message"
    val c: Double = 3.14
    val d: Long = 100_000_000_000_000
    val e: Boolean = false
    val f: Char = '\n'
}
println(solution002())

///////
///////
///////

//Exercise 1: You have a list of “green” numbers and a list of “red” numbers. Complete the code to print how many numbers there are in total.
fun solution003() {
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)
    print(greenNumbers.count() + redNumbers.count())
}
println(solution003())

// Exercise 2: You have a set of protocols supported by your server. A user requests to use a particular protocol. Complete the program to check whether the requested protocol is supported or not (isSupported must be a Boolean value).
fun solution004() {
    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = requested.uppercase() in SUPPORTED
    println("Support for ${requested.uppercase()}: $isSupported")
}
println(solution004())

// Exercise 3: Define a map that relates integer numbers from 1 to 3 to their corresponding spelling. Use this map to spell the given number.
fun solution005() {
    val number2word = mapOf(1 to "one", 2 to "two", 3 to "three")
    val n = 2
    println("$n is spelt as '${number2word[n]}'")
}
println(solution005())

///////
///////
///////

// Exercise 1: Using a when expression, update the following program so that when you input the names of GameBoy buttons, the actions are printed to output.
fun solution006() {
    val button = "A"
    var action: String
    when (button) {
        "A" -> action = "Yes"
        "B" -> action = "No"
        "X" -> action = "Menu"
        "Y" -> action = "Nothing"
        else -> action = "There is no such button"
    }
    println(action)
}
println(solution006())

// Exercise 2: You have a program that counts pizza slices until there’s a whole pizza with 8 slices. Refactor this program in two ways:
    // Use a while loop.
fun solution007() {
    var pizzaSlices = 0
    while (pizzaSlices < 8) {
        println("There's only $pizzaSlices slice/s of pizza :(")
        pizzaSlices++
    }
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
}
    // Use a do-while loop.
fun solution008() {
    var pizzaSlices = 0

    do {
        println("There's only $pizzaSlices slice/s of pizza :(")
        pizzaSlices++
    } while (pizzaSlices < 8)
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
}
println(solution007())
println(solution008())

// Exercise 3: Write a program that simulates the Fizz buzz game.
// Your task is to print numbers from 1 to 100 incrementally, replacing any number divisible by three with the word "fizz",
// and any number divisible by five with the word "buzz". Any number divisible by both 3 and 5 must be replaced with the word "fizzbuzz".
fun solution009() {
    for (number in 1..100) {
        if (number % 3 == 0 && number % 5 == 0) {
            print("fizz-buzz" )
        }
        else {
            if (number % 3 == 0) {
                print("fizz ")
            }
            else {
                if (number % 5 == 0) {
                    print("buzz ")
                }
                else {
                    print("$number ")
                }}}}}

fun solution010() {
    for (number in 1..100) {
        print(
            when {
                number % 15 == 0 -> "fizzbuzz "
                number % 3 == 0 -> "fizz "
                number % 5 == 0 -> "buzz "
                else -> "$number "
            }
        )
    }
}

println(solution009())
println(solution010())

// Exercise 4: You have a list of words. Use for and if to print only the words that start with the letter

fun solution011() {
    val words = listOf("dinosaur", "limousine", "magazine", "language")
    for (word in words) {
        if ('l' == word[0]) {
            print("$word ")
        } else {
            print("- ")
        }
    }
    }

println(solution011())