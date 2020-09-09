package Chapter04

object Practice13 {
  def main(args: Array[String]): Unit = {
    val picther = new Pitcher("山田",99,0.09,2.13)
    picther.changeBattingAverage(0.02)
    picther.introduce()
  }
}

//スーパークラス
class BaseballPlayer(val name:String, val uniformNumber:Int, var battingAverage:Double){
  def changeBattingAverage(change:Double){
    battingAverage = battingAverage + change
  }
}

//サブクラス
//変数名はスーパークラスのものと被ってはいけない
class Pitcher(n:String, un:Int, ba:Double, var era:Double) extends BaseballPlayer(n, un, ba){
  def introduce(){
    println("選手名：" + this.name)
    println("背番号：" + this.uniformNumber)
    println("打率：" + this.battingAverage)
    println("防御率：" + this.era)
  }

}
