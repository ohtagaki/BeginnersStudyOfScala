package Chapter03

object Practice08 {
  def main(args: Array[String]): Unit = {
    val jp = new Japanese("山田一郎", "2001-04-01",false,123456789012L)
    jp.showPrivateData()
  }
}

class Japanese(n:String, b:String, g:Boolean, myn:Long) {
  private val name = n
  private val birthday = b
  private val gender = g
  private val mynumber = myn
  def showPrivateData() {
    println(name + "の個人情報")
    println("生年月日：" + birthday)
    if(!gender) {
      println("性別：男性")
    }else{
      println("性別：女性")
    }
    println("マイナンバー：" + mynumber)
  }
}
