fun main(){
    val cc =CompanionObj()
    println ("first number is : " +cc.firstNo)
    println("The sum is : "+cc.add(8,7))


    
    println("second number is : " +CompanionObj.secondNo)
    println("Product is "+CompanionObj.product(4,6))

}
 class CompanionObj{
    var firstNo = 10
    fun add(a:Int,b:Int):Int{
        return a+b
    }
    companion object{
        var secondNo = 20
        fun product(a:Int ,b :Int ):Int{
            return a*b
        }
    }
 }