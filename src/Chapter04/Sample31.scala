package Chapter04

object Sample31 {
  def main(args: Array[String]): Unit = {
    val dog = new Dog2
    val cat = new Cat2
    val pla = new Platypus
    dog.birth()
    cat.birth()
    pla.birth()
  }
}

//スーパークラス
class Mammal(val kind:String){
  def birth(): Unit ={
    println(kind + "が赤ちゃんを産みました。")
  }
}

//サブクラス
class Dog2 extends Mammal("犬")
class Cat2 extends Mammal("猫")
class Platypus extends Mammal("カモノハシ"){
  override def birth(){
    println(kind + "が卵を産みました。")
  }
}
