fun main(){
    println("How old are you")
    val age = readln()!!.toInt()
    println("your age is $age ")

    if(age <18)
        println("you are adult")
    else if (age <40)
        println("you are mature")
    else
        println("you can vote")
}