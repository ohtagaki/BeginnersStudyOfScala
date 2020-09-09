package Chapter05

object Sample49 {
  def main(args: Array[String]): Unit = {
    val array=Array(1,4,7,10,13,16,19,22,25)
    for(x<-array if x%2==0){
      println(x)
    }
    println("-----------------")
    for(x<-array if x%2!=0 if x > 10){
      println(x)
    }
  }
}
