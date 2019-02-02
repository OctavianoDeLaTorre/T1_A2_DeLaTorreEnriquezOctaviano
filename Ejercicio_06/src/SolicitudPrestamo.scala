import scala.io.StdIn._

object SolicitudPrestamo {
  
  
  def main(args: Array[String]): Unit = {
    solicitar_datos()
  }
  
  def solicitar_datos(){
    println("===INGRESA LOS SIGUIENTES DATOS===")
    println("Nombre: ")
    var nombre = readLine()
    println("Historia crediticia(‘b’buena o ‘m’ mala):")
    var hCrediticia = readLine()
    println("Cantidad pedida de prestamo:")
    var cPrestamo = readDouble()
    println("Salario actual:")
    var salActual = readDouble()
    println("Valor de otraas propiedades;")
    var valPropiedades = readDouble()
    
    if(hCrediticia.toLowerCase() == "m"){
      println("\n"+nombre+" su estado de crédito es malo, NO es posible aprobar el prestado")
    } else if (hCrediticia.toLowerCase() == "b"){
      val puntos = revisar_solicitud(hCrediticia, cPrestamo, salActual, valPropiedades)
      if(puntos < 6){
         println("\n"+nombre+" no es posible aprobar el prestado \n\t Puntos necesario 6 \n\t Puntos obtenidos "+puntos)
      }else{
        println("\n"+nombre+" su prestamo fue aprobado \n\t Puntos obtenidos "+puntos)
      }
    } else {
      println("\nIngreso historia crediticia incorrectamente")
    }
  }
  
  def revisar_solicitud(hCrediticia:String, cPrestamo:Double,salActual:Double, valPropiedades:Double):Int ={
    puntos_salario(salActual, cPrestamo) + puntos_propiedades(valPropiedades, cPrestamo)
  }
  
  def puntos_salario(salActual:Double, cPrestamo:Double):Int ={
    val porcentaje = (salActual*100) / cPrestamo;
    if(porcentaje >= 50 ){
      5
    } else if(porcentaje >= 25 && porcentaje < 50){
      3
    } else if(porcentaje >= 10 && porcentaje < 25){
      1
    } else {
      0
    }
  }
  
  def puntos_propiedades(valPropiedades:Double, cPrestamo:Double):Int ={
    var pPropiedades = valPropiedades/cPrestamo;
    if (pPropiedades >= 2){
      5
    } else if(pPropiedades >= 1 && pPropiedades < 2){
      3
    } else {
      0
    }
    
  }
}