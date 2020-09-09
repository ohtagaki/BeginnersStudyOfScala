package Chapter02

object Sample12 {
  def main(args: Array[String]){
    val x = 14
    val y = 5
    print(x + " > 5 && " + y + " > 5：")
    println(x > 5 && y > 5)
    print(x + " > 5 || " + y + " > 5：")
    println(x > 5 || y > 5)
    print(!(x > 5))
  }
}
