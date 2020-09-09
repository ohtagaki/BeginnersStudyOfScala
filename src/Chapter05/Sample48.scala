package Chapter05

object Sample48 {
  def main(args:Array[String]): Unit ={
    val array=Array(12,34,56)
    for(x <- array){
      println(x)
    }
    val list = List("AB","CD","EF")
    for(str <- list){
      println(str)
    }
    for (i <- 1 to 10){
      println(i)
    }
  }
}
