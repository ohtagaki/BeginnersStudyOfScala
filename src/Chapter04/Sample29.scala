package Chapter04

object Sample29 {
  def main(args: Array[String]): Unit = {
    val dog:Animal = new Dog("ジョン", 5, false)
    val cat:Animal = new Cat("ミー", 3, true)
    dog.introduce()
    cat.introduce()
    dog.move()
    cat.move()
  }
}

//スーパークラス
class Animal(private val kind:String, private val name:String,
            private var age:Int, private val gender:Boolean){
  def introduce(): Unit ={
    println(kind + "の" + name + "は、" + (if(gender)"メス" else "オス") + "で" + age + "歳です。")
  }
  def move(){
    println(kind + "の" + name + "は移動しました。")
  }
}

//サブクラス
class Dog(name:String, age:Int, gender:Boolean) extends Animal("犬", name, age, gender)
class Cat(name:String, age:Int, gender:Boolean) extends Animal("猫", name, age, gender)
