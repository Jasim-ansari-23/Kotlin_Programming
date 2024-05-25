package Oops_Program.Abstraction

interface Human{
    fun eat()
    fun run()
}

interface Deeds{
    fun deeds()
}

class NormalInsaan : Human, Deeds {
    override fun eat() {
        println("Normal Insaan Eats Biryani")
    }

    override fun run() {
        println("Normal Insaan Run for achieving their goals")
    }

    override fun deeds() {
        println("Great People always do A great things for the sake of humans and god")
    }
}

class Ristedar : Human, Deeds {
    override fun eat() {
        println("Ristedar Normally fucks their own family")
    }

    override fun run() {
        println("Ristedar normally run for Court for their sins")
    }

    override fun deeds() {
        println("They neither wanna do something nor wants, that's why they are fucker")
    }
}

fun doHumanStuffs(normalInsaan: NormalInsaan){
    normalInsaan.eat()
    normalInsaan.run()
}

fun doRistedarStuffs(ristedar: Ristedar){
    ristedar.eat()
    ristedar.run()
}

fun doDeeds(deeds: Deeds){
    deeds.deeds()
}

fun main() {
    doHumanStuffs(NormalInsaan())
    doDeeds(NormalInsaan())

    doRistedarStuffs(Ristedar())
    doDeeds(Ristedar())
}