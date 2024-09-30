

class CH1(var num1:Int,var num2:Int){
    fun add(){
        println("sum of two number is ${num1+num2}")
    }

}

fun main() {
    var obj = CH1(21,23)
    obj.add()
}