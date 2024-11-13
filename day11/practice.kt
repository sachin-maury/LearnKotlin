fun main(){
    val classA = ClassA()
    val classB = ClassB()
    println("the no is firstNo :"+ classA.firstNo+ ","+classB.firstNo)
    println("the sum of two no :"+classA.add(5,6)+","+classB.add(4,5))
    println("the sum of three no :"+classA.add(5,6,7)+","+classB.add(7,4,2))

    
}


interface add{
   var firstNo:Int
   fun add(a:Int ,b:Int):Int
   fun add(a:Int,b:Int,c:Int):Int
}

class ClassA:add{
   override var firstNo=12
   override fun add(a:Int ,b:Int):Int{
       return a+b
   }
   override fun add(a:Int,b:Int,c:Int):Int{
       return a+b+c
   }

}

class ClassB:add{
   override var firstNo=18
   override fun add(a:Int ,b:Int):Int{
       return a+a+b+b
   }
   override fun add(a:Int,b:Int,c:Int):Int{
       return 3*(a+b+c)
   }

}