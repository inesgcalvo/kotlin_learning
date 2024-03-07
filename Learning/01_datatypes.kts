// KOTLIN DATATYPES
// Kotlin v1.9.22

// 1. Integers
// Byte
val bitsByte = 8
val minByte = -128
val maxByte = 128
// Short
val bitsShort = 16
val minShort = -32768
val maxShort = 32767
// Int
val bitsInt = 32
val minInt = -2_147_483_648
val maxInt = 2_147_483_647
// Long
val bitsLong = 64
val minLong: Long = Long.MIN_VALUE          // -9223372036854775808
val maxLong: Long = Long.MAX_VALUE          // 9223372036854775808
// Examples:
val one = 1                     // Int
val threeBillion = 3000000000   // Long
val oneLong = 1L                // Long
val oneByte: Byte = 1

// Unsigned integers: UByte, UShort, UInt, ULong

// 2. Floating-points
// Float
val bitsFloat = 32
val significantBitsFloat = 24
val exponentBitsFloat = 8
val decimalDigitsFloat = arrayOf(6, 7)
// Double
val bitsDouble = 64
val significantBitsDouble = 53
val exponentBitsDouble = 11
val decimalDigitsDouble = arrayOf(15, 16)
// Examples:
val pi = 3.14                   // Double
// val one: Double = 1          // Error: type mismatch
val oneDouble = 1.0             // Double
val e = 2.7182818284            // Double
val eFloat = 2.7182818284f      // Float, actual value is 2.7182817

// 2. Booleans
val myTrue: Boolean = true
val myFalse: Boolean = false
val boolNull: Boolean? = null

// 3. Characters
val aChar: Char = 'a'
val tab: Char = '\t'
val backspace: Char = '\b'
val newLine: Char = '\n'
val carriageReturn: Char = '\r'
val singleQuotationMark: Char = '\''
val doubleQuotationMark: Char = '\"'
val backslash: Char = '\\'
val dollarSign: Char = '\$'

// 4. Strings
val stringExample = "Example of string"
val multilineText = """
    Whatever will be here,
    whatever will be there.
    Anyway the wind blows...
"""
    // By default, a pipe symbol | is used as margin prefix
val multilineText2 = """
    |Whatever will be here,     
    |whatever will be there.
    |Anyway the wind blows...
    """.trimMargin()
    // trimMargin(): remove leading whitespace
val price = """
${'$'}9.99
"""
println(price)

    // Formats an integer, adding leading zeroes to reach a length of seven characters
val integerNumber = String.format("%07d", 31416)
    // Formats a floating-point number to display with a + sign and four decimal places
val floatNumber = String.format("%+.4f", 3.141592)
    // Formats two strings to uppercase, each taking one placeholder
val helloString = String.format("%S %S", "hello", "world")
    // Formats a negative number to be enclosed in parentheses, then repeats the same number in a different format (without parentheses) using `argument_index$`.
val negativeNumberInParentheses = String.format("%(d means %1\$d", -31416)

// 5. Arrays
var riversArray = arrayOf("Nile", "Amazon", "Yangtze")
riversArray += "Mississippi"
println(riversArray.joinToString())

// 6. Collections
    // Lists: Ordered collections of items
        // listOf(): To create a read-only list (List)
val myPastPets = listOf("Gilbie-Clarke", "Mari-Rata", "Piolín", "Manhattan", "Gnemo")

        // mutableListOf(): To create a mutable list (MutableList)
var myPresentPets: MutableList<String> = mutableListOf("Gauss")

        // casting: mutable to read-only
val myFuturePets: MutableList<String> = mutableListOf("Carroll", "Bayes", "Mendel")
val myFuturePetsLocked: List<String> = myFuturePets

        // first(), last(), count() and [indexer]
println("The list has ${myFuturePetsLocked.count()} items")
println("The first element of the list is ${myFuturePetsLocked.first()}")
println("The second element of the list is ${myFuturePetsLocked[1]}")
println("The last element of the list is ${myFuturePetsLocked.last()}")

        // in
println("Fourrier" in myFuturePetsLocked)
println("Gauss" in myPresentPets)

        // add() and remove()
val plants: MutableList<String> = mutableListOf("Montse", "Eggxecutor", "Iera")
plants.add("ajo")
println(plants)
plants.remove("ajo")
println(plants)

    // Sets: Unique unordered collections of items
        // setOf(): Read-only set
val setOfChars = setOf('a', 'b', 'c', 'a')

        // mutableSetOf(): Mutable set with explicit type declaration
val mutableSetOfChars: MutableSet<Char> = mutableSetOf('d', 'e', 'f', 'f')
println(setOfChars + ":::" + mutableSetOfChars)
println("${setOfChars} & ${mutableSetOfChars}")

        // casting: mutable to read-only
val lockedSetOfChars: Set<Char> = mutableSetOfChars

        // count()
println("The set has ${lockedSetOfChars.count()} items")

        // in
println('x' in lockedSetOfChars)
println('a' in lockedSetOfChars)

        // add() and remove()
mutableSetOfChars.add('g')
println(mutableSetOfChars)
mutableSetOfChars.remove('g')
println(mutableSetOfChars)

    // Maps: Sets of key-value pairs where keys are unique and map to only one value (`Python` Dictionaries)
        // mapOf(): Read-only map
val readOnlyJuiceMenu = mapOf("apple" to 10, "kiwi" to 20, "orange" to 15)
println(readOnlyJuiceMenu)

        // mutableMapOf(): Mutable map with explicit type declaration
val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 10, "kiwi" to 20, "orange" to 15)
println(juiceMenu)

        // casting: mutable to read-only
val juiceMenuLocked: Map<String, Int> = juiceMenu

        // [indexer]
var selectedFruit = "apple"
println("The value of ${selectedFruit} juice is: ${readOnlyJuiceMenu["${selectedFruit}"]}")

        // count()
println("This map has ${readOnlyJuiceMenu.count()} key-value pairs")

        // put() and remove()
juiceMenu.put("coconut", 22)
println(juiceMenu)
juiceMenu.remove("orange")
println(juiceMenu)

        // containsKey()
println(juiceMenu.containsKey("kiwi"))

        // keys and values
println(juiceMenu.keys)
println(juiceMenu.values)

        // in
println("orange" in juiceMenu.keys)
println(25 in juiceMenu.values)

