package Chapter05

object Sample45 {
  def main(args: Array[String]): Unit = {
    val tuple = (123,"Hello",true,3.14)
    println(tuple._1)
    println(tuple._2)
    println(tuple._3)
    println(tuple._4)
    val arr = Array(23,19,46,53,38)
    val (max,min) = maxmin(arr)
    println(max)
    println(min)
  }

  def maxmin(array:Array[Int])={
    var max = array(0)
    var min = array(0)
    var index = 1
    while (index < array.length){
      max = if(max > array(index)){
        max
      }else{
        array(index)
      }
      min = if(min < array(index)){
        min
      }else{
        array(index)
      }
      index += 1
    }
    (max,min)
  }
}
