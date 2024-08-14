class myClass{
    companion object{
        @JvmStatic
        fun main(args:Array<String>){
         print("Hello ${add(5,6)}")
        }
        fun add(a:Int ,b: Int): Any{
            return a+b
        }
    }
}