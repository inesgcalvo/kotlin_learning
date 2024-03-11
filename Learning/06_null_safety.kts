//In Kotlin, it's possible to have a null value. To help prevent issues with null values in your programs, Kotlin has null safety in place.
// Null safety detects potential problems with null values at compile time, rather than at run time.
    // explicitly declare when null values are allowed in your program.
    // check for null values.
    // use safe calls to properties or functions that may contain null values.
    // declare actions to take if null values are detected.

// Nullable types
fun nullableTypes() {
    // neverNull has String type
    var neverNull: String = "This can't be null"
//    neverNull = null              // Throws a compiler error

    // nullable has nullable String type
    var nullable: String? = "You can keep a null here"
    nullable = null

    // By default, null values aren't accepted
    var inferredNonNull = "The compiler assumes non-nullable"
//    inferredNonNull = null        // Throws a compiler error

    // notNull doesn't accept null values
    fun strLength(notNull: String): Int {
        return notNull.length
    }
    println(strLength(neverNull))
//    println(strLength(nullable))  // Throws a compiler error
}
nullableTypes()

// Check for null values
fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "String of length: ${maybeString.length}"
    } else {
        return "String of length: ¿0 or null?"
    }
}
fun checkNullValues() {
    var nullString: String? = null
    println(describeString(nullString))
}
checkNullValues()

// Use safe calls: ?
    // The safe call operator returns null if the object's property is null
fun lengthString(maybeString: String?): Int? = maybeString?.length
fun useSafeCalls() {
    var nullString: String? = null
    println("String of length: ${lengthString(nullString)}")
}
useSafeCalls()
fun useSafeCalls2() {
    var nullString: String? = null
    println("String of length: ${nullString?.uppercase()}")
}
useSafeCalls2()

// Use Elvis Operator: ?:
    // Provide a default value to return if a null value is detected
fun operatorElvis() {
    var nullString: String? = null
    println("String of length: ${nullString?.length ?: 0}")
}
operatorElvis()