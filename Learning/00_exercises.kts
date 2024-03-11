import kotlin.math.PI
import kotlin.random.Random

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

///////
///////
///////

// Exercise 1: Write a function called circleArea that takes the radius of a circle in integer format as a parameter and outputs the area of that circle.
fun solution012(radius: Int): Double {
    return PI * radius * radius
}
println(solution012(2))

// Exercise 2: Rewrite the circleArea function from the previous exercise as a single-expression function.
fun solution013(radius: Int) = PI * radius * radius
println(solution013(2))

fun solution014(radius: Int): Double = PI * radius * radius
println(solution014(2))

// Exercise 3: You have a function that translates a time interval given in hours, minutes, and seconds into seconds. In most cases, you need to pass only one or two function parameters while the rest are equal to 0. Improve the function and the code that calls it by using default parameter values and named arguments so that the code is easier to read.
fun intervalInSeconds(hours: Int = 0, minutes: Int = 0, seconds: Int = 0) =
    ((hours * 60) + minutes) * 60 + seconds
fun solution015() {
    println(intervalInSeconds(1, 20, 15))
    println(intervalInSeconds(minutes = 1, seconds = 25))
    println(intervalInSeconds(2))
    println(intervalInSeconds(minutes = 10))
    println(intervalInSeconds(hours = 1, seconds = 1))
}
solution015()

///////
///////
///////

// Exercise 1: You have a list of actions supported by a web service, a common prefix for all requests, and an ID of a particular resource. To request an action title over the resource with ID: 5, you need to create the following URL: https://example.com/book-info/5/title. Use a lambda expression to create a list of URLs from the list of actions.
fun solution016() {
    val actions = listOf("title", "year", "author")
    val prefix = "https://example.com/book-info"
    val id = 5
    val urls = actions.map() { action -> "$prefix/$id/$action"}
    println(urls)
}
solution016()

// Write a function that takes an Int value and an action (a function with type () -> Unit) which then repeats the action the given number of times. Then use this function to print “Hello” 5 times.
fun repeatN(n: Int, action: () -> Unit) {
    for (i in 1..n) {
        action()
    }
}

repeatN(5) {
    print("Hello ")
}

///////
///////
///////

// Exercise 1: Define a data class Employee with two properties: one for a name, and another for a salary. Make sure that the property for salary is mutable, otherwise you won’t get a salary boost at the end of the year! The main function demonstrates how you can use this data class.
data class Employee(val name: String, var salary: Int)

fun solution017() {
    val employee = Employee("Mary", 20)
    println(employee)
    employee.salary += 10
    println(employee)
}
solution017()

// Exercise 2: To test your code, you need a generator that can create random employees. Define a class with a fixed list of potential names (inside the class body), and that is configured by a minimum and maximum salary (inside the class header). Once again, the main function demonstrates how you can use this class.
class RandomEmployeeGenerator(var minSalary: Int, var maxSalary: Int) {
    val names = listOf("Mariano", "Silfu", "Sauron", "Eneri", "Sarini", "Trapito")
    fun generateEmployee() = Employee(names.random(), Random.nextInt(from = minSalary, until = maxSalary))
}
fun solution018() {
    val empGen = RandomEmployeeGenerator(10, 30)
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    empGen.minSalary = 50
    empGen.maxSalary = 100
    println(empGen.generateEmployee())
}
solution018()

///////
///////
///////

// You have the employeeById function that gives you access to a database of employees of a company. Unfortunately, this function returns a value of the Employee? type, so the result can be null. Your goal is to write a function that returns the salary of an employee when their id is provided, or 0 if the employee is missing from the database.
fun employeeById(id: Int) = when(id) {
    1 -> Employee("Mary", 20)
    2 -> null
    3 -> Employee("John", 21)
    4 -> Employee("Ann", 23)
    else -> null
}
fun salaryById(id: Int) = employeeById(id)?.salary ?: 0
fun solution019() {
    println((1..5).sumOf { id -> salaryById(id) })
}
solution019()
