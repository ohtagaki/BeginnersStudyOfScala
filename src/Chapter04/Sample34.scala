package Chapter04

object Sample34 {
  def main(args: Array[String]): Unit = {
    val human = new Human("山本",26,true)
    human.speak()
    human.birthday()
    human.speak()
  }
}

//スーパークラス
class Animal2(protected var age:Int, protected val gender:Boolean){
  def birthday(): Unit ={
    println("1歳年を取りました。")
    age += 1
  }
}

//サブクラス
class Human(val name:String, a:Int, g:Boolean) extends Animal2(a,g){
  def speak(){
    println("私の名前は、" + name + "、性別は" + (if(gender)"女性" else "男性") + "で年齢は" + age + "歳です。")
  }
}
