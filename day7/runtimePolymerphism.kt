fun main(){
    val classB=ClassB()
    val classA= ClassA()
    println("The name is :" +classB.name + ","+ classA.name)
    println("The sum is :" +classB.Add(6,8)+","+classA.Add(4,2))
    println("")

    
}

 open  class ClassA {
  open  var name = "sachin"
  open  fun Add(a :Int,b:Int):Int{
         return a+b
    }
}
class ClassB : ClassA(){
    override var name :String ="sonu"
 override  fun Add(a:Int,b:Int):Int{
        val sum =super.Add(a,b)
        val sqr = sum*sum
        return sqr
    }



}