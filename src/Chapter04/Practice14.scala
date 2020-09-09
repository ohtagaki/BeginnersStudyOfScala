package Chapter04

object Practice14 {
  def main(args: Array[String]): Unit = {
    val b = new Bicycle()
    val mb = new MotorBicycle()
    b.run()
    b.move()
    mb.run()
    mb.move()
  }
}

//自転車
class Bicycle(){
  def run(): Unit ={
    println("ハンドルを切ります。")
  }
  def move(){
    println("ペダルを漕いで進みます。")
  }
}

//バイク
class MotorBicycle() extends Bicycle(){
  override def move(){
    println("エンジンを動力に進みます。")
  }
}
