package Chapter04

object Practice19 {
  def main(args: Array[String]): Unit = {
    val button = new CountButton()
    button.push()
    button.push()
    button.push()
    println("ボタンを押した回数：" + button.getCount())
  }
}

class Button(){
  def push(): Unit ={
    println("ボタンを押しました。")
  }
}

trait Counter{
  private var count = 0
  def incrementCount(){
    count += 1
  }
  def getCount():Int = { count }
}

class CountButton() extends Button() with Counter{
  override def push(): Unit = {
    super.push()
    incrementCount()
  }
}
