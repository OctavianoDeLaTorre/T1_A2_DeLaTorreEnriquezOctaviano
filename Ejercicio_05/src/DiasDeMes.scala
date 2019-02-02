import scala.io.StdIn._

object DiasDeMes {
  def main(args: Array[String]): Unit = {
    println("Ingresa el número de mes:")
    println(dias_mes(readInt()))
  }
  
  def dias_mes(mes: Int):String = {
    if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
      "El mes "+mes+" tiene: 31 dias"
    }else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
      "El mes "+mes+" tiene: 30 dias"
    }else if(mes == 2){
      "El mes "+mes+" tiene: 28 dias"
    }else{
      "El mes "+mes+" no existe"
    }
  }
}