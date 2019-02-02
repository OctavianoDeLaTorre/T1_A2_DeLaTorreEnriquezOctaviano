import scala.io.StdIn._

object E2_CalificacionPromedio {
  def main(args: Array[String]): Unit = {
    
    var calificaciones = new Array[Double](5)
    
    for(i <- 0 until calificaciones.length){
      println("Ingresa la calificacion "+i+":")
      calificaciones(i) = readDouble()
    }
    
    println(mostrar_promedio(calcular_promedio(calificaciones)))
    
  }
  
  def calcular_promedio(calificaciones: Array[Double]): Double = {
    var sumatoria = 0.0
    for(i <- calificaciones){
      sumatoria += i
    }
    return sumatoria/calificaciones.length
  }
  
  def mostrar_promedio(promedio: Double) : String = {
    if (promedio >= 90){
      "Promedio: "+ promedio + " Exelente"
    } else if (promedio >= 80 && promedio < 90){
      "Promedio: "+ promedio + " Bien"
    }else if (promedio >= 70 && promedio < 80){
      "Promedio: "+ promedio + " Regular"
    }else{
      "Promedio: "+ promedio + " Terrible"
    }
  }
}