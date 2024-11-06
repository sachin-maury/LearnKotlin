// class This{
//     companion object{
//         @JvmStatic
        fun main(){
            val audi=audi()
            audi.interior(1234)
         }
         
          open class Car{
            var ManufactureNo =1010101
         
            fun PressBrakes(){
                println("Car has been stoped")
                
            }
            fun PressAccln(speed :Int){
                println("Car acclerated with " + speed + "km/hm")
            }

            fun ChangeGear(gear:Int){
                println("Gear shifted to " + gear  )
            }

         }
         
         
         class audi:Car(){
             var chasisNo = 1000
             init{
                println("Audi Created"+ super.ManufactureNo)
                println("Step1:"+ super.ChangeGear(1))
                println("Step2:"+ super.PressAccln(10))
                println("Step3:"+ super.ChangeGear(2))
                println("Step4:"+ super.PressBrakes())
                
             }
             fun interior(chasisNo:Int){
                 println("Chasisno is:"+this.chasisNo)
             }
         }
//     }

// }
