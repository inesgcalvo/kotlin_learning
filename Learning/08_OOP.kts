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

fun separator() {
    println("\n\t*\t*\t*\n")
}

///////
///////
///////
separator()

// Sec 04 -> EXERCISE
object pen {
    val brand: String = "STAEDLER"
    val model: String = "Mars Lumograph Charcoal 100C"
    val hardness: String = "H"
    val color: List<String> = listOf("Grey")
}
println("The pen's brand is ${pen.brand}")

///////
///////
///////
separator()

// Sec 05 -> EXERCISE
object WashingMachine {
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
    println("Is on?: ${WashingMachine.isOn}")
    println("Is Running?: ${WashingMachine.isRunning}")
    println("Detergent?: ${WashingMachine.hasDetergent}")
    println("Softener?: ${WashingMachine.hasFabricSoftener}")
    println("Actual Capacity: ${WashingMachine.actualCapacityInKgs}")
    println("Selected Program: ${WashingMachine.selectedProgram}")
}

fun startWashingMachine(){
    WashingMachine.turnOn()
    WashingMachine.introduceTextiles()
    WashingMachine.introduceTextiles()
    WashingMachine.introduceTextiles()
    WashingMachine.introduceTextiles()
    WashingMachine.introduceTextiles()
    WashingMachine.introduceTextiles()
    WashingMachine.introduceTextiles()
    WashingMachine.addDetergent()
    WashingMachine.addFabricSoftener()
    WashingMachine.selectProgram("Regular")
    WashingMachine.startRunning()
}

testWashingMachine()
startWashingMachine()
testWashingMachine()

///////
///////
///////
separator()

// Ejercicio: modelar un coche usando orientación a objetos
// El objetivo de este ejercicio es poner en práctica:
    // la representación de los datos de un objeto.
    // la representación del comportamiento de un objeto.
    // el paso de mensajes (o invocar funciones de un objeto desde funciones de otro objeto)
    // la encapsulación,
    // la composición
// Para poner en práctica la encapsulación, intenta ocultar el máximo de detalles posible desde el punto de vista del usuario del coche.
// Usa la orientación a objetos para representar el siguiente concepto:

// Nos han pedido desarrollar un simulador de coches lo más detallado y realista posible.
// El equipo ha decidido entregar una primera versión de la representación de un Renault 5008. En concreto, esta primera versión representará las siguientes características y funcionamiento del coche:
// Este coche es de la marca "Renault" El modelo del coche es "5008"
object Car {
    val brand: String = "Renault"
    val model: String = "5008"
    var actualSpeedInKmH: Double = 0.0
    var direction: Double = 0.0
    private var isOn: Boolean = false

    //Las funciones del coche de encender y apagar deben invocar las funciones del grupo propulsor de encender y apagar, respectivamente.
    fun turnOn() {
        Propeller.turnOn()
        this.isOn = true
    }
    fun turnOff() {
        Propeller.turnOff()
        this.isOn = false
    }
    //Las funciones del coche de girar a la izquierda y girar a la derecha deben invocar las funciones del sistema de dirección de girar a la izquierda y girar a la derecha, respectivamente.
    fun turnLeft() {
        Propeller.turnLeft()
    }
    fun turnRight() {
        Propeller.turnRight()
    }
    //Implementa la lógica necesaria para que cada vez que el coche acelera y frena, su velocidad incrementa y decrementa 1km/h, respectivamente.
    //La función del coche de acelerar debe invocar la función del grupo propulsor de acelerar.
    fun accelerate(n: Double) {
        Propeller.acceleratePropeller(n)
    }
    fun decelerate(n: Double) {
        Propeller.deceleratePropeller(n)
    }
    //La función del coche de frenar debe invocar la función del sistema de frenado de frenar.
    fun brake() {
        BrakingSystem.brake()
        null
    }
}

// Este coche tiene:
// El grupo propulsor "Prop-X3" tiene:
    //el motor "SM4"
    //el embrague "EM-90"
    //la caja de cambios "CH-45"


//Las funciones del grupo propulsor de encender y apagar deben invocar las funciones del motor de encender y apagar, respectivamente.
object Propeller {
    private val name: String = "Prop-X3"
    private val engine: String = "SM4"
    private val clutch: String = "EM-90"
    private val gearbox: String = "CH-45"
    private var isOn: Boolean = false
    private var isEngineOn: Boolean = false

    fun turnOn(){
        this.turnEngineOn()
        this.isOn = true
    }
    fun turnOff(){
        this.turnEngineOff()
        this.isOn = false
    }
    fun turnEngineOn(){
        this.isEngineOn = true
    }
    fun turnEngineOff(){
        this.isEngineOn = false
    }
    //La función del grupo propulsor de acelerar debe invocar la función del motor de acelerar.
    fun turnLeft() {
        SteeringSystem.turnLeft()
    }
    fun turnRight() {
        SteeringSystem.turnRight()
    }
    fun acceleratePropeller(n: Double){
        this.accelerateEngine(n)
    }
    fun accelerateEngine(n: Double){
        Car.actualSpeedInKmH += n
    }
    fun deceleratePropeller(n: Double){
        this.decelerateEngine(n)
    }
    fun decelerateEngine(n: Double){
        Car.actualSpeedInKmH -= n
    }
}

// El sistema de dirección "SD-M5" tiene:
    // el conjunto de ruedas directrices "RD-87"
    // el eje delantero "ED-32"
//Las funciones del sistema de dirección de girar a la izquierda y girar a la derecha deben invocar las funciones del conjunto de ruedas directrices de girar a la izquierda y girar a la derecha, respectivamente.
object SteeringSystem {
    private val name: String = "SD-M5"
    private val steeringWheels: String = "RD-87"
    private val frontAxle: String = "ED-32"
    fun turnLeft() {
        Car.direction -= 90
    }
    fun turnRight() {
        Car.direction += 90
    }
}

// El sistema de frenado "SF-78" tiene:
    // el dispositivo de frenado izquierdo "DFI-82"
    // el dispositivo de frenado derecho "DFD-82"
object BrakingSystem {
    private val name: String = "SF-78"
    private val leftBrakingDevice: String = "DFI-82"
    private val rightBrakingDevice: String = "DFD-82"
    private var isLeftBrakingDeviceOn: Boolean = true
    private var isRightBrakingDeviceOn: Boolean = true

    //La función del sistema de frenado de frenar debe invocar las funciones de los dispositivos de frenado (izquierdo y derecho) de frenar.
    fun brake() {
        isLeftBrakingDeviceOn = true
        isRightBrakingDeviceOn = true
        var speed: Double = Car.actualSpeedInKmH
        Car.decelerate(speed)
    }
}

//El coche debe ofrecer al usuario una forma de ver su información:
    //marca
    //modelo
    //velocidad
fun carInfo() {
    println("Brand: ${Car.brand}")
    println("Model: ${Car.model}")
    println("Speed: ${Car.actualSpeedInKmH} Km/h")
}

// El conductor puede:
    // encender y apagar el coche.
    // girar a la izquierda o a la derecha
    // acelerar
    // frenar
fun driveSomewhere() {
    Car.turnOn()
    Car.accelerate(60.0)
    Car.decelerate(10.0)
    Car.turnLeft()
    Car.turnRight()
    Car.accelerate(10.0)
    Car.brake()
    Car.turnOff()
}

carInfo()
driveSomewhere()
carInfo()