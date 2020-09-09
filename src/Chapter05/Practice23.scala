package Chapter05

object Practice23 {
  def main(args: Array[String]): Unit = {
    var list = List(5,13,6,9,18,2,21,1)
    println("Listの偶数の個数：" + countEven(list))
  }
  def countEven(list: List[Int]):Int = {
    var index = 0
    var count = 0
    while(index < list.length){
      if(list(index) % 2 == 0){
        count += 1
      }
      index += 1
    }
    return count
  }
}
