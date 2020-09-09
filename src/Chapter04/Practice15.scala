package Chapter04

object Practice15 {
  def main(args: Array[String]): Unit = {
    val c1 = new Clock(10,15,30)
    c1.showData()
    println()
    val c2 = new AlarmClock(15,45,20,6,30)
    c2.showData()
  }
}

//スーパークラス
class Clock(private var hour:Int, private var minute:Int, private var second:Int){
  def showData(): Unit ={
    println("ただいまの時刻：" + hour + "時" + minute + "分" + second + "秒")
  }
}
//サブクラス
class AlarmClock(h:Int,m:Int,s:Int,private var alarmHour:Int, private var alarmMinute:Int) extends Clock(h,m,s){
  override def showData(): Unit ={
    super.showData()
    println("アラーム設定時刻：" + alarmHour + "時" + alarmMinute + "分")
  }
}
