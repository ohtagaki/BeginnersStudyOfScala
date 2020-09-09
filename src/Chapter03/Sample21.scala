package Chapter03

object Sample21 {
  def main(args: Array[String]){
    val p1 = new Person("鈴木",30,"東京","公務員")
    val p2 = new Person("山本",27,"千葉")
    val p3 = new Person("松岡",45)
    p1.introduce()
    p2.introduce()
    p3.introduce()
  }
}
class Person(name: String, age: Int, graduate:String, job:String) {
  //補助コンストラクタその1
  def this(name: String, age: Int, graduate:String) {
    this(name,age,graduate,"無職")
  }
  //補助コンストラクタその2
  def this(name: String, age: Int) {
    this(name,age,"不明")
  }
  def introduce(){
    println("----------------------------")
    println("名前：" + name)
    println("年齢" + age)
    println("出身：" + graduate)
    println("職業：" +job)
  }
}

