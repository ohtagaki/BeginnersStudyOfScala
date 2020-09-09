package Chapter03

object Practice09 {
  def main(args: Array[String]): Unit = {
    val t1 = new Talent("石原真希", 22)
    val t2 = new Talent("本上ゆきえ", "本田真子")
    val t3 = new Talent("市川瑠璃子", "山田美紀", 24)
    t1.profile()
    t2.profile()
    t3.profile()
  }
}

class Talent(sn:String, rn:String, a:Int) {
  private val stageName = sn
  private val realName = rn
  private var age = a

  //補助コンストラクタ
  def this(sn:String, rn:String) {
    this(sn,rn,-1)
  }
  def this(sn:String, a:Int) {
    this(sn,"非公開", a)
  }

  def profile() {
    print("芸名：" + stageName + " 本名：" + realName + " 年齢：")
    if(age < 0){
      println("非公開")
    }else{
      println(age)
    }
  }
}
