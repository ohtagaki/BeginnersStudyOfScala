package Chapter02

object Sample14 {
  def main(args: Array[String]){
    val age = 19
    if(age >= 20){
      println("成人です")
    }else if(0 <= age && age < 20){
      println("未成年です")
    }else{
      println("年齢が負の値はおかしいです")
    }
  }
}
