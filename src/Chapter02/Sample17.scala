package Chapter02

object Sample17 {
  def main(args: Array[String]): Unit = {
    val a = 6
    val b = 11
    println(Sample17.sum(a, b))
    Sample17.greet()
  }

  def sum(x:Int, y:Int): Int ={
    x + y
  }
  def greet() = println("Good Night")
}
