// La porgramación orientada a objetos es un paradigma de programación basado en el concepto de 'objetos',
// los cuales pueden contener información y código: información en forma de campos
// (a menudo conocidos como atributos o propiedades),
// y código, en forma de procedimientos (a menudo conocidos como métodos o funciones).

import java.time.LocalDate
import kotlin.random.Random
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
println(":::")
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
println(":::")
carInfo()

///////
///////
///////
separator()

// Ejercicio: modelar una caja de supermercado usando orientación a objetos
// El objetivo de este ejercicio es poner en práctica:
    // la representación de los datos de un objeto.
    // la representación del comportamiento de un objeto.
    // el paso de mensajes (o invocar funciones de un objeto desde funciones de otro objeto)
    // la encapsulación
    // la composición
// Para poner en práctica la encapsulación, intenta ocultar el máximo de detalles posible desde el punto de vista del usuario del coche.

// Usa la orientación a objetos para resolver el siguiente problema:
// Nos han pedido crear el programa que se instalará en las cajas registradoras de una cadena de supermercados.
// El programa debe permitir añadir productos con su respectivo precio a la cesta del cliente.
// Para añadir un producto a la cesta del cliente, se debe introducir el código de barras del producto.
// También debe permitir añadir una cierta cantidad del mismo producto.
// El programa debe poder comunicarse con un proveedor de pagos para cargar en la tarjeta bancaria del cliente el importe final de la compra.
// Nota: simula el comportamiento del proveedor de pagos con una lógica que simplemente diga que el pago ha ido bien.
// El importe total antes de IVA es la suma de todos los importes de los productos de la cesta antes de aplicar el IVA correspondiente a cada producto.
// El importe total después de IVA es la suma de todos los importes de los productos de la cesta después de aplicar el IVA correspondiente a cada producto.
// La cadena de supermercados ya dispone de un catálogo que tiene la información de los importes y porcentajes de IVA asociados a los productos a partir de los códigos de barras.
// Nota: puedes crear un catálogo con productos que te inventes o simplemente devolver importes y porcentajes de IVA aleatorios cada vez que se introduce un código de barras.
// Se debe poder imprimir el ticket de la compra. El ticket debe mostrar:
// para cada tipo de producto comprado, cantidad e importes antes y después de IVA.
    // el importe total antes de IVA
    // el importe total después de IVA

var clientIDs: MutableSet<String> = mutableSetOf("a8e24108-b4f5-4382-9065-c76a2972cbfb", "4234b480-38de-4b24-9fb3-91fc70c4173a", "a3980899-459c-478e-a53c-8d013de8f5fc", "36a7dd9d-7316-45e5-b011-f35b1902ecf0", "32a9b4b7-c6f4-427f-bc68-27133dcc6187", "1daaf5f6-b6f1-47fe-a214-452b6536161e",   "32c9bcf1-0df5-4edd-9bdc-7c94477758d0", "b7c2e709-c25c-4b9d-a9a1-b2eb80fe2987", "ca14263d-bb40-4245-8b8c-3ecd1f4926a6", "e16ea61e-8883-4add-8d17-67e39c5ea3ff")
var clientNames: MutableSet<String> = mutableSetOf("Raoul", "Fred", "Rita", "Misouko", "Catherine", "Ringer", "Marcia", "Moretto", "Chichin", "Valerie")
fun generateClientID() = clientIDs.random()
fun generateClientName() = clientNames.random()

var productBarcodes: MutableSet<String> = mutableSetOf("A-0010-Z", "A-0020-Z", "A-0030-Z", "A-0040-Z", "A-0050-Z", "A-0060-Z", "A-0070-Z", "A-0080-Z", "A-0090-Z", "A-0100-Z")
var productNames: MutableSet<String> = mutableSetOf("Tomato", "Apple", "Milk", "The", "Coffee", "Detergent", "Soap", "Rice", "Green Beans", "Orange")
var salesPrices: MutableSet<Double> = mutableSetOf(10.0, 20.5, 26.4, 12.4, 74.1, 56.4, 23.4, 33.3, 42.1, 12.9)
var purchasePrices: MutableSet<Double> = mutableSetOf(2.1, 5.7, 9.7, 5.6, 3.7, 7.2, 6.6, 4.5, 5.4, 2.1)
fun generateProductBarcode() = productBarcodes.random()
fun generateProductName() = productNames.random()
fun generateSalesPrice() = salesPrices.random()
fun generatePurchasePrices() = purchasePrices.random()

var VAT: Double = 0.21
class SuperMarketCheckout(val clientName: String, val clientID: String) {
    var productsBarcodeList: MutableList<String> = mutableListOf()
    var productsNameList: MutableList<String> = mutableListOf()
    var productsPriceList: MutableList<String> = mutableListOf()
    var productsPriceVATList: MutableList<String> = mutableListOf()

    val product = Product()
    print("Product Name: ")
    product.printName()
    print("Product Barcode: ")

    print("Price: ")
    product.printPrice()
    print("Price with VAT: ")
    product.printPriceVAT()
    fun addProduct() {
        productsBarcodeList.add(product.printBarcode())
        productsNameList.add(product.printName())
    }
}
class Client {
    val name: String = generateClientName()
    val clientID: String = generateClientID()
    fun printName() {
        println(name)
    }
    fun printId() {
        println(clientID)
    }
}

class Product {
    val name: String = generateProductName()
    val barcode: String = generateProductBarcode()
    var salesPriceWithoutVAT: Double = generateSalesPrice()
    var salesPriceWithVAT: Double = salesPriceWithoutVAT + (salesPriceWithoutVAT * VAT)
    private var purchasePrice: Double = generatePurchasePrices()

    fun printName() {
        println(name)
    }
    fun printBarcode() {
        println(barcode)
    }
    fun printPriceVAT() {
        println("$$salesPriceWithVAT")
    }
    fun printPrice() {
        println("$$salesPriceWithoutVAT")
    }
}

fun infoClient() {
    val client = Client()
    print("Client Name: ")
    client.printName()
    print("Client ID: ")
    client.printId()
}

fun infoProduct() {
    val product = Product()
    print("Product Name: ")
    product.printName()
    print("Product Barcode: ")
    product.printBarcode()
    print("Price: ")
    product.printPrice()
    print("Price with VAT: ")
    product.printPriceVAT()
}

fun infoSuperMarketCheckout() {
//    println("Client ID: ${SuperMarketCheckout.clientID}")
//    println("Client ID: ${SuperMarketCheckout.clientName}")
//    println("Price: $${Tomato.salesPriceWithoutVAT}")
//    println("Price + VAT: $${Tomato.salesPriceWithVAT}")
}


infoClient()
println(":::")
infoProduct()
println(":::")
infoSuperMarketCheckout()