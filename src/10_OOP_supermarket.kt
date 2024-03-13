import java.text.DecimalFormat

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
var clientNames: MutableSet<String> = mutableSetOf("Raoul", "Fred", "Rita", "Mitsouko", "Catherine", "Ringer", "Marcia", "Moretto", "Chichin", "Valerie")
var productBarcodes: MutableSet<String> = mutableSetOf("A-0010-Z", "A-0020-Z", "A-0030-Z", "A-0040-Z", "A-0050-Z", "A-0060-Z", "A-0070-Z", "A-0080-Z", "A-0090-Z", "A-0100-Z")
var productNames: MutableSet<String> = mutableSetOf("Tomato", "Apple", "Milk", "The", "Coffee", "Detergent", "Soap", "Rice", "Green Beans", "Orange")
var salesPrices: MutableSet<Double> = mutableSetOf(10.0, 20.5, 26.4, 12.4, 74.1, 56.4, 23.4, 33.3, 42.1, 12.9)
var purchasePrices: MutableSet<Double> = mutableSetOf(2.1, 5.7, 9.7, 5.6, 3.7, 7.2, 6.6, 4.5, 5.4, 2.1)

fun generateClientID() = clientIDs.random()
fun generateClientName() = clientNames.random()
fun generateProductBarcode() = productBarcodes.random()
fun generateProductName() = productNames.random()
fun generateSalesPrice() = salesPrices.random()
fun generatePurchasePrices() = purchasePrices.random()

var VAT: Double = 0.21
object SuperMarketCheckout {
    val clientName = generateClientName()
    val clientID = generateClientID()

    var productsBarcodeList: MutableList<String> = mutableListOf()
    var productsNameList: MutableList<String> = mutableListOf()
    var productsPriceList: MutableList<Double> = mutableListOf()
    var productsPriceVATList: MutableList<Double> = mutableListOf()

    fun printClientInfo() {
        println("Client Name: $clientName")
        println("Client ID: $clientID")
    }
    fun addProduct() {
        val productName: String = generateProductName()
        val productBarcode: String = generateProductBarcode()
        var productPrice: Double = generateSalesPrice()
        var productPriceVAT: Double = productPrice + (productPrice * VAT)
        var purchasePrice: Double = generatePurchasePrices()

        productsBarcodeList.add(productBarcode)
        productsNameList.add(productName)
        productsPriceList.add(productPrice)
        productsPriceVATList.add(productPriceVAT)
    }

    fun printPriceList() {
        var totalPrice: Double = productsPriceList.sum()
        val formattedPrice = DecimalFormat("0.000").format(totalPrice)
        println("Total Price: $$formattedPrice")
    }
    fun printPriceVATList() {
        var totalPrice: Double = productsPriceVATList.sum()
        val formattedPrice = DecimalFormat("0.000").format(totalPrice)
        println("Total Price (VAT): $$formattedPrice")
    }
    fun printProductsNameList() {
        println("List of Products: $productsNameList")
    }
}

fun main() {
    println(":::")
    SuperMarketCheckout.addProduct()
    SuperMarketCheckout.addProduct()
    SuperMarketCheckout.addProduct()
    SuperMarketCheckout.addProduct()
    SuperMarketCheckout.printProductsNameList()
    SuperMarketCheckout.printPriceList()
    SuperMarketCheckout.printPriceVATList()
}