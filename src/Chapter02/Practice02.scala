package Chapter02

object Practice02 {
  def main(args: Array[String]){
    println("身長(cm)を入力してください。")
    val height = scala.io.StdIn.readDouble
    println("体重(kg)を入力してください。")
    val weight = scala.io.StdIn.readDouble

    //2
    val BMI:Double = weight / (height * height / 10000)
    //3
    val result =
      if(26.5 <= BMI){
        "肥満"
      }else if(24 <= BMI && BMI <= 26.5){
        "太り気味"
      }else if(20 <= BMI && BMI <= 24){
        "普通"
      }else{
        "スリム"
      }
    println("あなたのBMI値は" + BMI + "です")
    println("あなたは" + result + "です")

  }
}
