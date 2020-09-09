package Chapter05

object Sample52 {
  def main(args: Array[String]): Unit = {
    val season = "summer"
    val seasonJapanese= season match{
      case "spring" => "春"
      case "summer" => "夏"
      case "autumn" => "秋"
      case "winter" => "冬"
      case _ => "?"
    }
    println("季節：" + seasonJapanese)
  }
}
