fun main() {
    data class Grade(val letter: Char, val points: Double, val credits: Double)

    open class Person(var firstName: String, var lastName: String) {
        fun fullName() = "$firstName $lastName"
    }

    open class Student(firstName: String, lastName: String, var grades: MutableList<Grade> = mutableListOf()) : Person(firstName, lastName) {
        fun recordGrade(grade: Grade) {
            grades.add(grade)
        }
    }

    val arthur = Person(firstName = "Arthur", lastName = "Morgan")
    val javier = Student(firstName = "Javier", lastName = "Escuella")
    println(arthur.fullName()) // Arthur Morgan
    println(javier.fullName()) // Javier Escuella

    val history = Grade(letter = 'B', points = 9.0, credits = 3.0)
// arthur.recordGrade(history) // arthur is not a student!
    javier.recordGrade(history)

    open class BandMember(firstName: String, lastName: String) : Student(firstName, lastName) {
        open val minimumPracticeTime: Int
            get() { return 2 }
    }

    class OboePlayer(firstName: String, lastName: String) : BandMember(firstName, lastName){
        override val minimumPracticeTime: Int = super.minimumPracticeTime

    }

    // Polymorphism

    fun phoneBookName(person: Person): String {
        return "${person.lastName}, ${person.firstName}"
    }

    val person = Person(firstName = "Johnny", lastName = "Sins")
    val oboePlayer = OboePlayer(firstName = "Jordi", lastName = "El Nino")

    println(phoneBookName(person)) // Sins, Johnny
    println(phoneBookName(oboePlayer)) // El Nino, Jordi

    // Rintime hierarchy check
    var hallMonitor = Student(firstName = "Jimmy", lastName = "Neutron")
    hallMonitor = oboePlayer

    println(hallMonitor is OboePlayer) // true
    println(hallMonitor !is OboePlayer) // false
    println(hallMonitor is Person) // true

    // as : unsafe cast
    // as? : safe cast
    println((hallMonitor as? BandMember)?.minimumPracticeTime)

}