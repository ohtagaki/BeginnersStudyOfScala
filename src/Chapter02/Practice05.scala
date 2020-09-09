package Chapter02

object Practice05 {
  def main(args: Array[String]){
    val r = 5.0
    println("半径" + r + "円の面積は" + Practice05.getArea(r))

    val base = 9.0
    val height = 5.0
    println("底辺" + base + "、高さ" + height + "の三角形の面積は" + getArea(base, height))

    val upperBase = 8.0
    val lowerBase = 10.0
    println("上底" + upperBase +"、下底" + lowerBase + "、高さ" + height + "の三角形の面積は" + getArea(upperBase, lowerBase, height))
  }

  def getArea(x:Double): Double = {
    return x * x * 3.14
  }
  def getArea(x:Double, y:Double): Double = {
    return x * y / 2
  }
  def getArea(x:Double, y:Double, z:Double): Double = {
    return (x + y) * z / 2
  }
}
