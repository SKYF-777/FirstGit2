package corparation

//fun main() {
//    print("Enter name: ")
//    val name = readln()
//    print("Enter brand: ")
//    val brand = readln()
//    print("Enter size: ")
//    val size = readln().toFloat()
//    print("Enter price: ")
//    val price = readln().toInt()
//    val productCard = ProductCard(name, brand, size, price)
//    productCard.printInfo()
//}

//fun main() {
//    val director = Director("Andrey", 25)
//    val assistant = Assistant("Jone")
//    director.takeCoffee(assistant)
//}

fun main() {
    val director = Director("Andrey", 35)
    val consultant = Consultant("Max")
    val assistant = Assistant("Helen", 20)
    val accountant =Accountant("Chester", 45)
    val employees = listOf<Worker>(director,consultant, assistant,accountant)
    for(employee in employees) {
        employee.work()
    }
}