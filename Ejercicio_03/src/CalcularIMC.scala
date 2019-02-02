import scala.io.StdIn._

object CalcularIMC {
  def main(args: Array[String]): Unit = {
    println("Ingresa tu peso (kg):")
    var peso = readDouble()
     println("Ingresa tu altura (m):")
    var altura = readDouble()
    
    println(diagnosticoIMC(calcularIMC(peso, altura)))
  }
  
  def calcularIMC(peso:Double, altura:Double):Double = {
    peso / Math.pow(altura, 2)
  }
  
  def diagnosticoIMC(imc:Double): String = {
    if (imc > 40){
      "IMC: "+imc+" obesidad mórbida (obesidad de grado IV)"
    } else if(imc >=35 && imc < 40){
       "IMC: "+imc+" obesidad premórbida (obesidad de grado III)"
    } else if(imc >=30 && imc < 35){
       "IMC: "+imc+" sobrepeso crónico (obesidad de grado II)"
    }  else if(imc >=25 && imc < 30){
       "IMC: "+imc+" sobrepeso (obesidad de grado I)"
    } else if(imc >=18 && imc < 25){
       "IMC: "+imc+" peso normal (saludable)"
    } else if(imc >=17 && imc < 18){
      "IMC: "+imc+" bajo peso"
    } else if(imc >=16 && imc < 17){
      "IMC: "+imc+" infrapeso"
    } else{
      "IMC: "+imc+"  Criterio de ingreso en hospital"
    }
  }
}