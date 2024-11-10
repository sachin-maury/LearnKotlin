
fun main(){
    val audi = Audi()
    audi.interior(123)

}

 open class Car{

}



class Audi : Car(){
  var ChasisNo = 10000
    fun interior(ChasiNO:Int ){
        println("ChasisNo is :" +this.ChasisNo)
        // this keyword we refere the current class
    }
}