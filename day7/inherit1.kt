fun main(){
    val classB=ClassB()
    println("The name is :" +classB.name )
    println("The sum is :" +classB.add(6,8))


}

 open  class ClassA {
    var name = "sachin"
    fun add(a :Int,b:Int):Int{
         return a+b
    }
}
class ClassB : ClassA(){



}