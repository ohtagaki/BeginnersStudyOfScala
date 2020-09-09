package Chapter05

object Practice26 {
  def main(args: Array[String]): Unit = {
    try{
      println(28 / 7)
      println(72 / 9)
      println(44 / 0)
      println(54 / 6)
    }catch{
      case ex:ArithmeticException => println("ゼロ除算が発生しました")
    }

    def divide(x:Int,y:Int)={
      x/y
    }
  }
}
