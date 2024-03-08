// La porgramación orientada a objetos es un paradigma de programación basado en el concepto de 'objetos',
// los cuales pueden contener información y código: información en forma de campos
// (a menudo conocidos como atributos o propiedades),
// y código, en forma de procedimientos (a menudo conocidos como métodos o funciones).

import java.time.LocalDate
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

object Garfield {
    // DATOS (Atributos / Propiedades)
    var breed: String = "siamese"
    var birthdate: String = "2017-08-05"
    val year = birthdate.substring(0, 4).toInt()
    val month = birthdate.substring(5, 7).toInt()
    val day = birthdate.substring(8).toInt()
    val localDate = LocalDate.of(year, month, day)
    var sterilized: Boolean = false
    var vaccinated:Boolean = true

    // COMPORTAMIENTO (Métodods / Funciones)
    fun sterilize() {
        if(this.age() < 3) {
            sterilized = true
        } else {
            println("The cat is too young")
        }
    }
    fun vaccinate() {
        vaccinated = true
    }
    fun age(): Int {
        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
        return ZonedDateTime.now().year - localDate.year
    }
}

// Syntax for accessing fields
println("The cat is a ${Garfield.breed}")

// Syntax for assignements
Garfield.birthdate = "2024-03-08"

// Syntax for accessing fields
Garfield.sterilize()
println("The cat is ${Garfield.age()} years old")

object Gnemo {
    // DATOS (Atributos / Propiedades)
    var breed: String = "stray"
    var birthdate: String = "1994-08-05"
    val year = birthdate.substring(0, 4).toInt()
    val month = birthdate.substring(5, 7).toInt()
    val day = birthdate.substring(8).toInt()
    val localDate = LocalDate.of(year, month, day)
    var sterilized: Boolean = true
    var vaccinated:Boolean = true

    // COMPORTAMIENTO (Métodods / Funciones)
    fun sterilize() {
        if(this.age() < 3) {
            sterilized = true
        } else {
            println("The cat is too young")
        }
    }
    fun vaccinate() {
        vaccinated = true
    }
    fun age(): Int {
        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
        return ZonedDateTime.now().year - localDate.year
    }
}

object AgeDifferenceCalculator {
    fun calculate(): Int {
        return Garfield.age() - Gnemo.age()
    }
}
println("The age difference between the cats is ${AgeDifferenceCalculator.calculate()} years")

// Sec 04 -> EXERCISE
object pen {
    val brand: String = "STAEDLER"
    val model: String = "Mars Lumograph Charcoal 100C"
    val hardness: String = "H"
    val color: List<String> = listOf("Grey")
}
println("The pen's brand is ${pen.brand}")

// Sec 05 -> EXERCISE
object washingMachine {
    val brand: String = "Miele"
    val model: String = "WCA020 WCS"
    var isOn: Boolean = false
    var isRunning: Boolean = false
    var hasDetergent:Boolean = false
    var hasFabricSoftener: Boolean = false
    var actualCapacityInKgs: Int = 0
    val maximumCapacityInKgs: Int = 7
    var selectedProgram: String = ""
    val listOfPrograms: List<String> = listOf("Fast", "Regular", "Delicate")

    fun turnOn () {
        isOn = true
    }
    fun turnOff () {
        isOn = false
    }
    fun addDetergent() {
        if (hasDetergent == false) {
            hasDetergent = true
        } else {
            println("The washing machine already has detergent")
        }
    }
    fun addFabricSoftener() {
        if (hasFabricSoftener == false) {
            hasFabricSoftener = true
        } else {
            println("The washing machine already has fabric softener")
        }
    }
    fun introduceTextiles() {
        if (actualCapacityInKgs < maximumCapacityInKgs) {
            actualCapacityInKgs += 1
        } else {
            println("The maximum capacity has been reached, the washing machine cannot accept any more clothes")
        }
    }
    fun removeTextiles() {
        if (actualCapacityInKgs > 0) {
            actualCapacityInKgs -= 1
        } else {
            println("The washing machine is empty")
        }
    }
    fun selectProgram(program: String) {
        if (isOn == false) {
            println("Please, turn on the machine")
        } else if (isRunning == true) {
            println("Please wait until the end of the actual cycle, or cancel it")
        } else if (program in listOfPrograms) {
            selectedProgram = program
        } else {
            println("Please, select a valid program")
        }
    }
    fun startRunning() {
        isRunning = true
    }
    fun stopRunning() {
        isRunning = false
    }
}
fun testWashingMachine() {
    println("Is on?: ${washingMachine.isOn}")
    println("Is Running?: ${washingMachine.isRunning}")
    println("Detergent?: ${washingMachine.hasDetergent}")
    println("Softener?: ${washingMachine.hasFabricSoftener}")
    println("Actual Capacity: ${washingMachine.actualCapacityInKgs}")
    println("Selected Program: ${washingMachine.selectedProgram}")
}

fun startWashingMachine(){
    washingMachine.turnOn()
    washingMachine.introduceTextiles()
    washingMachine.introduceTextiles()
    washingMachine.introduceTextiles()
    washingMachine.introduceTextiles()
    washingMachine.introduceTextiles()
    washingMachine.introduceTextiles()
    washingMachine.introduceTextiles()
    washingMachine.addDetergent()
    washingMachine.addFabricSoftener()
    washingMachine.selectProgram("Regular")
    washingMachine.startRunning()
}

testWashingMachine()
startWashingMachine()
testWashingMachine()