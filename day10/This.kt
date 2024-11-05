// class This{
//     companion object{
//         @JvmStatic
        fun main(){
            val audi=audi()
            audi.interior(1234)
         }
         
          open class Car{
         
         }
         
         
         class audi:Car(){
             var chasisNo = 1000
             fun interior(chasisNo:Int){
                 println("Chasisno is:"+this.chasisNo)
             }
         }
//     }

// }
