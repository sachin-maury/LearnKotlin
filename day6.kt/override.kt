

open class Father {
  open  protected var car = "Bmw"
}

class Child : Father() {

    public override var car = "Audi"
    fun carName(){
        println(super.car)
    }
}


fun main() {
    val obj =Child()
    obj.carName()

}