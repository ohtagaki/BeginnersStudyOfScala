package Chapter02

object Sample18 {
  def main(args: Array[String]): Unit = {
    val a = 3
    val b = 5
    val c = 1.2
    sum(a, b)
    sum(b, c)
    sum(c ,a)
  }

  def sum(x:Int, y:Int){
    println("Int + Int => " + (x + y))
  }
  def sum(x:Int, y:Double){
    println("Int + Double => " + (x + y))
  }
  def sum(x:Double, y:Int){
    println("Double + Int => " + (x + y))
  }
}
