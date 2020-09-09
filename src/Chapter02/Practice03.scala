package Chapter02

object Practice03 {
  def main(args: Array[String]){
    val answer = scala.util.Random.nextInt(10) + 1

    var count = 3
    while(count > 0){
      println("数値を入力してください" + "(残り" + count + "回)")
      val input = scala.io.StdIn.readInt

      if(answer == input){
        println("正解です！" + "答えは" + answer + "でした")
        return
      }else if(answer > input){
        println("答えは" + input + "より大きい値です")
      }else{
        println("答えは" + input + "より小さい値です")
      }
      count -= 1
    }
    if(count == 0) println("残念…正解は" + answer +"でした")

  }
}
