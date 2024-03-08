// CONDITIONAL EXPRESSIONS
// If it is necessary to choose between if and when, it is recommend to use when as it leads to more robust and safer programs.
    // if
var integer: Int
val check = true
if (check) {
    integer = 1
} else {
    integer = 2
}
println("Integer: $integer")

        // one-line
val number1 = 3
val number2 = 2
val output = if (number1 > number2) number1 else number2
println("Output: $output")

    // When
val salutations = mapOf("EN" to "Hello", "ES" to "Hola", "FR" to "Salut")
var language = "EN"
when (salutations[language]) {
    "Hello" -> println("Language: English")
    "Hola" -> println("Language: Spanish")
    "Salut" -> println("Language: French")
    else -> println("Language: $language")
}

        // As an expression
val obj = "Hello"
val result = when (obj) {
    "1" -> "One"
    "Hello" -> "Greeting"
    else -> "Unknown"
}
println("Result: $result")

        // To check a chain of Boolean expression
val temperatureInCelsius = 18
val temperatureDescription = when {
    temperatureInCelsius < 0 -> "very cold"
    temperatureInCelsius < 10 -> "a bit cold"
    temperatureInCelsius < 20 -> "warm"
    else -> "hot"
}
println("The Temperature is $temperatureDescription")

// RANGES
var listOfNumbers1 = listOf(1, 2, 3, 4)
var listOfChars1 = listOf('a', 'b', 'c', 'd')
    // .. operator
var listOfNumbers2 = (1..4)
var listOfChars2 = ('a'..'d')

    // ..< operator
var listOfNumbers3 = (1..<5)
var listOfChars3 = ('a'..<'e')

    // reverse order
var listOfNumbers4 = (4 downTo 1)
var listOfChars4 = ('d' downTo 'a')

    // include step
var listOfNumbers5 = (2..8 step 2)
var listOfChars5 = ('h' downTo 'a' step 2)

// LOOPS
    // for
for (number in 1..5) {
    print("$number ")
}
print('\n')
for (i in listOfNumbers5) {
    print("$i ")
}
print('\n')
for (i in listOfChars5) {
    print("$i ")
}
print('\n')
var collectedCars = listOf("Ford Mustang 1979", "DeLorean", "Mercedes Benz C180")
for (car in collectedCars) {
    println("Wow, it's a $car!")
}

    // while
        // increment operator ++
var numberOfCars = 0
while (numberOfCars < 3) {
    println("Steal a car (or buy it if you can)")
    numberOfCars++
}

        // do - while
var ownedCars = 0
var stolenCars = 0
while (ownedCars < 3) {
    println("Steal a car")
    ownedCars++
}
do {
    println("Own the car")
    stolenCars++
} while (stolenCars < ownedCars)