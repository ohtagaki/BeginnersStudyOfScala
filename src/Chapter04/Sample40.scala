package Chapter04

object Sample40 {
  def main(args: Array[String]): Unit = {
    val swallow = new Swallow
    swallow.fly()
    val penguin = new Penguin
    penguin.swim()
    val atthis = new Atthis
    atthis.fly()
    atthis.swim()
  }
}

abstract class Bird
trait Flyable{
  def fly(){
    println(toString + "がスイスイ飛んでいます。")
  }
}
trait Swimable{
  def swim(): Unit ={
    println(toString + "がスイスイ泳いでいます。")
  }
}

//具象クラス
class Swallow extends Bird with Flyable{
  override def toString = "つばめ"
}
class Penguin extends Bird with Swimable{
  override def toString: String = "ペンギン"
}
class Atthis extends Bird with Flyable with Swimable{
  override def toString: String = "カワセミ"
}
