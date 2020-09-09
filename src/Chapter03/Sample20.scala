package Chapter03

object Sample20 {
  def main(args: Array[String]){
    val p1 = new Person("鈴木",30)
    val p2 = new Person("山本",27)
    p1.introduce()
    p2.introduce()
  }

  class Person(name: String, age:Int) {
    println("インスタンス化 名前：" + name + " 年齢：" + age)
    def introduce(){
      println("私は" + name + "、年齢は" + age + "歳です。")
    }
  }
}
