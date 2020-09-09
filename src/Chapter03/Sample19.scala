package Chapter03

object Sample19 {
  def main(args: Array[String]){
    val p1 = new Person
    val p2 = new Person
    p1.name = "佐藤"
    p1.age = 23
    p2.name = "田中"
    p2.age = 36
    p1.introduce()
    p2.introduce()
  }

  class Person {
    var name = ""
    var age = 0
    def introduce(){
      println("私は" + name + "、年齢は" + age + "です。")
    }
  }
}
