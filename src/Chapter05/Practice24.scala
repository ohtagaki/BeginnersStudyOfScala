package Chapter05

object Practice24 {
  def main(args: Array[String]): Unit = {
    val list = List(3,-5,0,-7,2,8,-1)
    var newList=choosePlus(list)
    println("正の数：" + newList)
  }

  def choosePlus(list: List[Int])={
    for(x <- list if x > 0)yield {
      x
    }
  }
}
