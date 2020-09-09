package Chapter05

object Practice25 {
  def main(args: Array[String]): Unit = {
    println("8 + 4 = " + calculate(8,4,"+"))
    println("8 - 4 = " + calculate(8,4,"-"))
    println("8 * 4 = " + calculate(8,4,"*"))
    println("8 / 4 = " + calculate(8,4,"/"))
    println("8 ? 4 = " + calculate(8,4,"?"))

  }
  def calculate(first:Int, second:Int, operator:String)={
    operator match {
      case "+" => first + second
      case "-" => first - second
      case "*" => first * second
      case "/" => first / second
      case _ => 0
    }
  }
}
