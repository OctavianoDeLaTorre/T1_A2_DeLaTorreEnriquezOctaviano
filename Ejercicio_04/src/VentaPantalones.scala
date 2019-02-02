import scala.io.StdIn._

object VentaPantalones {
  def main(args: Array[String]): Unit = {
    println("Ingresa el número de pantalones comprdos:")
    var numPantalones = readInt()
    
    println("Total a pagar: "+total_apagar(numPantalones))
    
  }
  
  def total_apagar(numPantalones: Int): Double = {
    val precioBase = 356.82
    if(numPantalones < 5){
      precioBase * numPantalones
    } else if (numPantalones >= 5 && numPantalones < 12){
       (precioBase * 0.85)* numPantalones
    } else {
      (precioBase * 0.70)* numPantalones
    }
  }
}