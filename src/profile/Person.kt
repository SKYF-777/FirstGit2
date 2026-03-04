package profile

class Person(
    val name: String,
    val age: Int,
    val height: Int,
    val weight: Int
) {

    fun printInfo(){
        println("Name: $name Age:$age Height:$height Weight:$weight")
    }
    fun sayHello(){
        println("Hello! My name is $name!")
    }
}