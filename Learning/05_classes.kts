// Kotlin supports object-oriented programming with classes and objects.
// Objects are useful for storing data in your program.
// Classes allow you to declare a set of characteristics for an object.
// When you create objects from a class, you can save time and effort because you don't have to declare these characteristics every time.

// Create a class
class Customer

// Properties
    // within parentheses () after the class name
//class Contact(val id: Int, var email: String)

    // Within the class body defined by the curly braces {}
class Contact(val id: Int, var email: String) {
    val category: String = "work"
}

// Create instance
    // To create an object from a class, declare a class instance using a constructor
fun instance_1() {
    val contact = Contact(1, "mary@gmail.com")
}
    //Contact is a class.
    //contact is an instance of the Contact class.
    //id and email are properties.
    //id and email are used with the default constructor to create contact.

// Access properties
fun instance_2() {
    val contact = Contact(2, "john@gmail.com")

    // Prints the value of the property
    println("Their email address is: ${contact.email}")

    // Updates the value of the property
    contact.email = "john_doe@gmail.com"
    println(contact.email)
}
instance_2()

// Member functions
class Friend(val id: Int, var email: String) {
    fun printId() {
        println(id)
    }
}
fun another_fun() {
    val friend = Friend(1, "mary@gmail.com")
    // Calls member function printId()
    friend.printId()
}
another_fun()

// Data Classes
    // Kotlin has data classes which are particularly useful for storing data.
    // Data classes have the same functionality as classes, but they come automatically with additional member functions.
    // These member functions allow you to easily print the instance to readable output, compare instances of a class, copy instances, and more.
    // As these functions are automatically available, you don't have to spend time writing the same boilerplate code for each of your classes.
data class User(val name: String, val id: Int)

// Member Functions
val user = User("Jacobo", 1)
    //.toString() Prints a readable string of the class instance and its properties.
println(user)   // println() and print()) automatically call .toString()

    // .equals() or == Compares instances of a class.
val secondUser = User("Alejandra", 2)
val thirdUser = User("Tania", 3)

println("user == secondUser: ${user == secondUser}")
println("user == thirdUser: ${user == thirdUser}")

    // .copy() Creates a class instance by copying another, potentially with some different properties.
println(user.copy())
println(user.copy("Tania"))
println(secondUser.copy(id = 3))