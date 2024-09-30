

open class A {
    open fun hello(){
         println("This is the base class")
     }
 }
 class B : A(){
    override fun hello(){
         println("This is a sub class ")
     }
 }
 
 fun main() {
     val obj =B()
     obj.hello()
 }