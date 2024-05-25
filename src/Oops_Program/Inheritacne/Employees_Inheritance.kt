// Base class or Super class
open class Employee(val name: String, val empId: Int) {
    fun display() {
        println("Employee: $name, ID: $empId")
    }
}

// Single Inheritance
class Developer(name: String, empId: Int, private val programmingLanguage: String) : Employee(name, empId) {
    fun show() {
        display()
        println("Specialization: Developer, Programming Languages: $programmingLanguage")
    }
}

// Multilevel Inheritance
open class HRManager(name: String, empId: Int) : Employee(name, empId) {
    fun handleHrDuties() {
        println("HR Manager managing human resources duties")
    }
}

class HRDirector(name: String, empId: Int) : HRManager(name, empId) {
    fun hrDirectorDuties() {
        println("HR Director Managing its HR Department")
    }
}

// Interface for Project Management (Multiple Inheritance)
interface ProjectManager {
    fun manageProject()
}

// Interface for Team Lead (Multiple Inheritance)
interface TeamLead {
    fun leadTeam()
}

class TeachLead(name: String, empId: Int, private val projectManaged: String, private val teamSize: Int) : Employee(name, empId), ProjectManager, TeamLead {
    override fun manageProject() {
        println("Project manager managing its projects: $projectManaged")
    }

    override fun leadTeam() {
        println("Team lead is guiding a team of $teamSize")
    }

    fun displayInfo() {
        display()
        manageProject()
        leadTeam()
    }
}

// Hierarchical Inheritance
class Ceo(name: String, empId: Int) : Employee(name, empId) {
    fun ceoDuty() {
        println("CEO is leading the entire company")
    }
}

class CompanyDirector(name: String, empId: Int) : Employee(name, empId) {
    fun directorDuties() {
        println("Company's director managing his entire company, I mean everything")
    }
}

// Interface for Sales Management (Hybrid Inheritance)
interface SalesManager {
    fun boostSales()
}

// Marketing Manager (Base Class for Hybrid Inheritance)
open class MarketingManager(name: String, empId: Int) : Employee(name, empId) {
    fun strategy() {
        println("Marketing manager adding his strategy to grow their products' rates")
    }
}

class BusinessDevelopmentManager(name: String, empId: Int) : MarketingManager(name, empId), SalesManager {
    override fun boostSales() {
        println("Sales manager boosting sales")
    }

    fun coordinating() {
        strategy()
        boostSales()
        println("Business development manager coordinating business effort")
    }
}

fun main() {
    // Single Inheritance
    val dev = Developer("Faizan", 11, "Kotlin")
    dev.show()

    println("It's Hr Time")

    // Multilevel Inheritance
    val hrDirector = HRDirector("Aakib Ansari", 383)
    hrDirector.handleHrDuties()
    hrDirector.hrDirectorDuties()

    println("It's Ceo Time")

    // Hierarchical Inheritance
    val ceo = Ceo("Jibrail", 2)
    ceo.ceoDuty()

    val director = CompanyDirector("Jasim Ansari", 1)
    director.directorDuties()

    println("Its Team leading time")
    val teachLead = TeachLead("Aakib", 203, "Projects X", 10)
    teachLead.displayInfo()

    println("Its business development time")

    // Hybrid Inheritance
    val businessDevelopmentManager = BusinessDevelopmentManager("Jssu", 505)
    businessDevelopmentManager.coordinating()
}
