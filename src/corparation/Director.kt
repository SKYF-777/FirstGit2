package corparation

class Director(
    name: String,
    age: Int
): Worker(name = name,age = age){
    override fun work(){
        println("I'm drinking coffee...")
    }
    fun takeCoffee(assistant: Assistant){
        val drinkName: String = assistant.bringCoffee()
        println("Thank tou, ${assistant.name}! The $drinkName is vary tasty :)")
    }
    fun takeWork(consultant: Consultant){
        val countClient: Int = consultant.serveCustomers()
        println("Consultant ${consultant.name} served $countClient clients")
    }
}