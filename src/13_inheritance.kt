open class OrderPrimates {
    open val type: String = "Order"
    open val name: String = "Primates"
    open val discovery: String = "Linnaeus"
    open val discoveryYear: Int = 1758
    var lisfOfPrimates: MutableSet<String> = mutableSetOf()

    fun addPrimate(member: String) {
        lisfOfPrimates.add(member)
    }
}

class SuborderStrepsirrhini: OrderPrimates() {
    override val type: String = "Suborder"
    override val name: String = "Strepsirrhini"
    override val discovery: String = "E. Geoffroy"
    override val discoveryYear: Int = 1812
    var lisfOfStrepsirrhini: MutableSet<String> = mutableSetOf()

    fun addStrepsirrhini(member: String) {
        lisfOfStrepsirrhini.add(member)
        (OrderPrimates().lisfOfPrimates).add(member)
    }
}

class SuborderHaplorhini: OrderPrimates() {
    override val type: String = "Suborder"
    override val name: String = "Haplorhini"
    override val discovery: String = "Pocock"
    override val discoveryYear: Int = 1918
    var lisfOfHaplorhini: MutableSet<String> = mutableSetOf()

    fun addHaplorhini(member: String) {
        lisfOfHaplorhini.add(member)
        (OrderPrimates().lisfOfPrimates).add(member)
    }
}

fun main() {
    println(":::")
    val primate = OrderPrimates()
    println("${primate.type}: \t${primate.name}\n\t\t${primate.discovery}, ${primate.discoveryYear}")
    val strepsirrhini = SuborderStrepsirrhini()
    println("${strepsirrhini.type}: \t${strepsirrhini.name}\n\t\t\t${strepsirrhini.discovery}, ${strepsirrhini.discoveryYear}")
    val haplorhini = SuborderHaplorhini()
    println("${haplorhini.type}: \t${haplorhini.name}\n\t\t\t${haplorhini.discovery}, ${haplorhini.discoveryYear}")
}