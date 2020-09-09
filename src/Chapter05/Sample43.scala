package Chapter05

object Sample43 {
  def main(args: Array[String]): Unit = {
    var array:Array[Int] = new Array[Int](3)
    array(0) = 123
    array(1) = 456
    array(2) = 789
    var index = 0
    while(index < array.length){
      println(array(index))
      index += 1
    }
  }
}
