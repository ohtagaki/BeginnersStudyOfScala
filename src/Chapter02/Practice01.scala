package Chapter02

object Practice01 {
  def main(args: Array[String]){
    val z:Int = 6
    println("変数zの値：" + z)

    //コメント1
    var x:Int =10
    //コメント2
    x *= 2
    //コメント3
    val y:Int = (x % 7)
    //コメント4
    println("変数yの値：" + y)
  }
}
