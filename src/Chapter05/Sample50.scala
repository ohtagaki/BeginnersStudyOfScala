package Chapter05

object Sample50 {
  def main(args: Array[String]): Unit = {
    for(i <- 1 to 3 ; j <- 7 to 10){
      println(i + "：" + j)
    }
    for(i <- 4 to 6 ; j <- 11 to 13){
      println(i + "：" + j)
    }
  }
}
