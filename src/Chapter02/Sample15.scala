package Chapter02

object Sample15 {
  def main(args: Array[String]){
    val month = 6
    val season =
      if(3 <= month && month <= 5){
        "春"
      }else if(6 <= month && month <= 8){
        "夏"
      }else if(9 <= month && month <= 11){
        "秋"
      }else if(1 <= month && month <= 2 || month == 12){
        "冬"
      }else{
        "不明"
      }
      println(month + "月は"+ season)
    }
}
