import java.time.LocalDate
import kotlin.random.Random
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

// Kingdom Animalia - interface
// [...]
// Order Primate - interface
// Lemur catta - object
    // override: used if variables or functions are inherited
    // It is not used if the variables or functions are from the object itself

interface Lightbulb {
    var isOn: Boolean
    fun turnOn()
    fun turnOff()
}

interface DimmableLightbulb: Lightbulb {
    var intensity: Double

    fun increaseIntensity()
    fun decreaseIntensity()
}

object MyLightbulb: DimmableLightbulb {
    override var isOn: Boolean = false
    override var intensity: Double = 50.0
    override fun turnOn() {
        isOn = true
        intensity = 50.0
    }
    override fun turnOff() {
        isOn = false
        intensity = 0.0
    }
    override fun increaseIntensity() {
        intensity += 10.0
    }
    override fun decreaseIntensity() {
        intensity -= 10.0
    }
}

fun main() {
    println(":::")
    MyLightbulb.turnOn()
    println("Is on? ${MyLightbulb.isOn}")
    println("Intensity: ${MyLightbulb.intensity}")
    MyLightbulb.increaseIntensity()
    MyLightbulb.increaseIntensity()
    println("Is on? ${MyLightbulb.isOn}")
    println("Intensity: ${MyLightbulb.intensity}")
    MyLightbulb.turnOff()
    println("Is on? ${MyLightbulb.isOn}")
    println("Intensity: ${MyLightbulb.intensity}")
}