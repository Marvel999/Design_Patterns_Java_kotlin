package main

//First way to make main function
//fun main(arg:Array<String>) {
//    print("Hello")
//
//}
//

//second way to make main function

//class Main{
//    companion object{
//        @JvmStatic
//        fun main(args: Array<String>) {
//            print("Hello My name is manish")
//        }
//    }
//}


//third way to make main function
class Manish{


    companion object{
        var i=10;
      @JvmStatic
     fun main(ards:Array<String>){
      
      }
    }
}
fun main() {
    println(Manish.i)
    print("Hello")
}



