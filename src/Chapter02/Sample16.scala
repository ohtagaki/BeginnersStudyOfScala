package Chapter02

object Sample16 {
  def main(args: Array[String]){
    println("whileループ")
    var i = 0
    while(i < 5){
      println(i)
      i += 1
    }

    println("do-whileループ")
    var j = 10
    do{
      println(j)
      j += 1
    }while(j < 5)
  }
}
