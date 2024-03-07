// Mathematical Operators
val number1 = 2.2                 // = is the assignment operator
val number2 = 3.3                 // val: read-only variables
var result: Double                // var: mutable variables

result = number1 + number2
println("$number1 + $number2 = $result")
result = number1 - number2
println("$number1 - $number2 = $result")
result = number1 * number2
println("$number1 * $number2 = $result")
result = number1 / number2
println("$number1 / $number2 = $result")
result = number1 % number2
println("$number1 % $number2 = $result")

// Logical Operators
val booleanTrue: Boolean = true
val booleanFalse: Boolean = false
val booleanNull: Boolean? = null

println(booleanTrue || booleanFalse)    // OR
println(booleanTrue && booleanFalse)    // AND
println(!booleanTrue)                   // NOT
println(booleanNull)                    // null

// Augmented Assignment Operators
var customers = 10
customers = 8               // Some customers leave the queue
customers = customers + 3   // Addition
customers += 7              // Addition
customers -= 3              // Subtraction
customers *= 2              // Multiplication
customers /= 3              // Division
print("\nThe number of customers now is ${customers}")



//* is also used to pass an array to a vararg parameter, is used to specify default values for parameters.
//++, -- - increment and decrement operators.
//==, != - equality operators (translated to calls of equals() for non-primitive types).
//===, !== - referential equality operators.
//<, >, <=, >= - comparison operators (translated to calls of compareTo() for non-primitive types).
//[, ] - indexed access operator (translated to calls of get and set).
//!! asserts that an expression is non-nullable.
//?. performs a safe call (calls a method or accesses a property if the receiver is non-nullable).
//?: takes the right-hand value if the left-hand value is null (the elvis operator).
//:: creates a member reference or a class reference.
//.., ..< create ranges.
//: separates a name from a type in a declaration.
//? marks a type as nullable.
//-> separates the parameters and body of a lambda expression, separates the parameters and return type declaration in a function type, separates the condition and body of a when expression branch.
//@ introduces an annotation, introduces or references a loop label, introduces or references a lambda label,
//references a 'this' expression from an outer scope & references an outer superclass.
//; separates multiple statements on the same line.
//$ references a variable or expression in a string template.
//_ substitutes an unused parameter in a lambda expression or in a destructuring declaration.

