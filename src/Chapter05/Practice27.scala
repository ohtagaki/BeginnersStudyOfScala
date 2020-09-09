package Chapter05

object Practice27 {
  def main(args: Array[String]): Unit = {
    val a = 24
    val b = 6
    val functions = Array(
      (x:Int,y:Int) => x + y,
      (x:Int,y:Int) => x - y,
      (x:Int,y:Int) => x * y,
      (x:Int,y:Int) => x / y
    )
    for(function <- functions){
      println(function(a,b))
    }
  }
}
