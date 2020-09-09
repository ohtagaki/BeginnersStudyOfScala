package Chapter05

object Practice20 {
  def main(args: Array[String]): Unit = {
    var array = Array(167,218,271,121)
    var index = 0
    var sum = 0
    while (index < array.length){
      sum += array(index)
      index += 1
    }
    println("配列のすべての要素の合計は" + sum + "です")
  }
}
