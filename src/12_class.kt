import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

// US PRESIDENTS - CLASS
//     George Washington - OBJECT
//     [...]
//     Joe Biden - OBJECT

class EEUUPresident(val name: String, val surname: String, var birthDate: String, var deathDate: String) {
    var isAlive: Boolean = false

    val birthYear = birthDate.substring(0, 4).toInt()
    val birthMonth = birthDate.substring(5, 7).toInt()
    val birthDay = birthDate.substring(8).toInt()

    val deathYear = deathDate.substring(0, 4).toInt()
    val deathMonth = deathDate.substring(5, 7).toInt()
    val deathDay = deathDate.substring(8).toInt()

    fun died() {
        isAlive = false
    }
    fun age(): Int {
        if (this.isAlive) {
            var formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
            return ZonedDateTime.now().year - birthYear
        } else {
            return deathYear - birthYear
        }
    }
}

fun main(){
    println(":::")
    val GeorgeWashington: EEUUPresident = EEUUPresident(name = "George", surname = "Washington", birthDate = "1732-02-22", deathDate = "1799-12-14")
    val JohnAdams: EEUUPresident = EEUUPresident(name = "John", surname = "Adams", birthDate = "1735-10-30", deathDate = "1826-07-04")
    val ThomasJefferson: EEUUPresident = EEUUPresident(name = "Thomas", surname = "Jefferson", birthDate = "1743-04-13", deathDate = "1826-07-04")

    println("${GeorgeWashington.name} ${GeorgeWashington.surname}: ${GeorgeWashington.age()} years")
    println("${JohnAdams.name} ${JohnAdams.surname}: ${JohnAdams.age()} years")
    println("${ThomasJefferson.name} ${ThomasJefferson.surname}: ${ThomasJefferson.age()} years")
}