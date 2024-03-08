import java.time.LocalDate
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

object Garfield {

    // DATOS
    var breed: String = "siamese"
    var birthdate: String = "2017-08-05"
    var sterilized: Boolean = false
    var vaccinated:Boolean = true

    // COMPORTAMIENTO
    fun sterilize() {
        sterilized = true
    }
    fun vaccinate() {
        vaccinated = true
    }
    fun age(): Int {
        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
        val localDate = localDate.parse(birthdate, formatter)
        return ZonedDateTime.now().year - localDate.year
    }
}