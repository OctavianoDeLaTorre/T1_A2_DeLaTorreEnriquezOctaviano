import scala.io.StdIn._

object E1_AreasPerimetros {
  def main(args: Array[String]): Unit = {
    menu()
  }
  
  def menu(){
    var opt1 = 0
    var opt2 = 0
    
    while(opt1 != 3){
      println("\n Elige una opcion: ")
      println("1) Calcular área ")
      println("2) Calcular perimetro ")
      println("3) SALIR ")
      opt1 = readInt()
      
     if(opt1 == 1){
       while(opt2 != 4){
          println("\n Elige una opcion para calcular área: ")
          println("1) Circulo ")
          println("2) Rectangulo ")
          println("3) Triangulo ")
          println("4) SALIR ")
          opt2 = readInt()
          
          if(opt2 == 1){
            println("Ingresa el radio: ")
            println("El área del circulo es: "+ AreaCirculo(readDouble()))
          } else if (opt2 == 2){
            println("Ingresa el largo: ")
            val l = readDouble()
            println("Ingresa el alto: ")
            val a = readDouble()
            println("El área del rectangulo es: "+ AreaRctangulo(l, a))
          } else if (opt2 == 2){
            println("Ingresa la base: ")
            val b = readDouble()
            println("Ingresa la altura: ")
            val a = readDouble()
            println("El área del rectangulo es: "+ AreaTrinagulo(b, a))
          }
       }
       
     } else if (opt1 == 2){
        while(opt2 != 4){
          println("\n Elige una opcion para calcular perimetro: ")
          println("1) Circulo ")
          println("2) Rectangulo ")
          println("3) Triangulo ")
          println("4) SALIR ")
          opt2 = readInt()
          
          
          if(opt2 == 1){
            println("Ingresa el diametro: ")
            println("El perimetro del circulo es: "+ PerimetroCirculo(readDouble()))
          } else if (opt2 == 2){
            println("Ingresa el largo: ")
            val l = readDouble()
            println("Ingresa el alto: ")
            val a = readDouble()
            println("El perimetro del rectangulo es: "+ PerimetroRectangulo(l, a))
          } else if (opt2 == 3){
            println("Ingresa lado 1: ")
            val l1 = readDouble()
            println("Ingresa lado 2: ")
            val l2 = readDouble()
            println("Ingresa lado 3: ")
            val l3 = readDouble()
            println("El perimetro del rectangulo es: "+ PerimetroTrinagulo(l1, l2, l3))
          }
        }
     }
    
    }
  }
  
  def AreaCirculo(r: Double): Double ={ 
    Math.PI * Math.pow(r, 2) 
    }
  
  def PerimetroCirculo (d: Double) : Double ={
    Math.PI * d
  }
  
  def AreaRctangulo (l: Double, a: Double): Double ={
    l*a
  }
  
  def PerimetroRectangulo (l: Double, a: Double): Double ={
    (l*2) + (a*2)
  }
  
  def AreaTrinagulo(b: Double, a: Double): Double = {
    (b*a)/2
  }
  
  def PerimetroTrinagulo(l1: Double, l2: Double, l3: Double): Double = {
    l1+l2+l3
  }
}