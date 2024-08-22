

open class Father {
    fun car(){
        println("Bmw")
    }
}
open class Child : Father() {
    fun carModel(){
        println("x7")
    }
}
class Child1 : Child (){
    fun carAmount(){
        println("5000000")
    }
}

fun main() {
    val obj =Child1()
    obj.car()
    obj.carModel()
    obj.carAmount()
}