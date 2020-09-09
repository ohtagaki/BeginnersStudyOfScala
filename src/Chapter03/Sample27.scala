package Chapter03

object Sample27 {
  def main(args: Array[String]): Unit ={
    val j1 = new Japan("山田")
    val j2 = new Japan("田中")
    Japan.situation()
    val j3 = new Japan("中西")
    val j4 = new Japan("西田")
    Japan.situation()
    j4.introduce()
  }
}

object Japan {
  private var total = 0
  val currency = "円"
  val capital = "東京"
  def situation() {
    println("現在の日本の総人口は、" + total + "人です。")
  }
}
class Japan(private val name:String) {
  Japan.total += 1
  def introduce(){
    println("私の名前は、" + name + "")
    println("日本の通貨は、" + Japan.currency)
    println("首都は、" + Japan.capital)
  }
}
