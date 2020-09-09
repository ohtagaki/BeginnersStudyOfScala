package Chapter04

object Sample32 {
  def main(args: Array[String]): Unit = {
    val ant = new Ant
    val bee = new Bee
    ant.move()
    bee.move()
  }
}

//スーパークラス
class Insect(val kind:String){
  def move(): Unit ={
    println(kind + "が歩きました。")
  }
}

//サブクラス
class Ant extends Insect("アリ")
class Bee extends Insect("ハチ"){
  override def move(): Unit ={
    super.move()
    println(kind + "が飛びました。")
  }
}
