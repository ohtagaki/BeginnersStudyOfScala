package Chapter02

object Practice04 {
  def main(args: Array[String]): Unit = {
    val x = 88
    val y = 79
    val z = 96
    print("3つの整数の中で最小値は、")
    println(min(x,y,z) + "です")
  }
  def min(x:Int, y:Int, z:Int): Int ={
    val minTmp = Math.min(x, y)
    val minNum = Math.min(minTmp, z)
    return minNum
  }

}
