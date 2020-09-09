package Chapter04

object Practice17 {
  def main(args: Array[String]): Unit = {
    val cook = new Cook("酒井")
    val designer = new Designer("片桐")
    cook.introduce()
    cook.work()
    designer.introduce()
    designer.work()
  }
}

//抽象クラス
abstract class Worker(protected val name:String){
  val jobType:String
  def work()
  def introduce(): Unit ={
    println("わたくし" + name + "は" + jobType + "です。")
  }
}

//クラス
class Cook(n: String) extends Worker(n) {
  override val jobType = "コック"
  override def work(){
    println(name + "さんはおいしいパスタを作りました。")
  }
}

class Designer(n: String) extends Worker(n) {
  override val jobType = "デザイナー"
  override def work(){
    println(name + "さんは斬新なイラストを描きました。")
  }
}
