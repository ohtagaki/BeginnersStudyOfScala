package Chapter04

object Practice16 {
  def main(args: Array[String]): Unit = {
    val airplane = new Airplane(0,0,100000)
    airplane.takeoff()
    airplane.information()
  }
}

//スーパークラス
class Vehicle(protected var speed:Int, protected var fuel:Double)
//サブクラス
class Airplane(private var height:Int, sp:Int, fu:Double) extends Vehicle(sp,fu){
  def takeoff(){
    println("離陸しました。")
    speed += 500
    height += 10000
    fuel -= 100.0
  }

  def information(){
    println("-- 現在の状況 --")
    println("高度：" + height + "フィート")
    println("速度：時速" + speed + "km")
    println("残燃料：" + fuel + "リットル")
  }
}
