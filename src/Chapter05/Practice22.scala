package Chapter05

object Practice22 {
  def main(args: Array[String]): Unit = {
    val array = Array(13,48,93,52,81)
    val (sum,average) = sumAverage(array)
    println(sum)
    println(average)
  }
  def sumAverage(array:Array[Int]) = {
    var sum = 0
    var index = 0
    while (index < array.length){
      sum += array(index)
      index += 1
    }
    var average:Double = sum  / array.length
    (sum,average)
  }
}
