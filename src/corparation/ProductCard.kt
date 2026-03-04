package corparation

open class ProductCard(
    val name: String,
    val brand: String,
    val price: Int
) {

    open fun printInfo (){
        print("Name: ${this.name} Brend: ${this.brand} Price: ${this.price} ")
    }
}