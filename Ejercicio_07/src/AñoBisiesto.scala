import scala.io.StdIn._

object AñoBisiesto {
  def main(args: Array[String]): Unit = {
    println("Ingresa un año:")
    println("Es bisiesto :" + es_bisiesto(readInt()))
  }
  
  
  def es_bisiesto(año:Int):Boolean = {
    if(año%4 == 0 ){
      if(año%100 == 0 && año%400 == 0){
        true
      } else{
        false
      }
    }else{
      false
    }
  }
}