package Chapter05

object Sample42 {
  def main(args: Array[String]): Unit = {
    var str = "Hello Scala"
    println("str ->" + str)
    println("str.length " + str.length)
    println("str.charAt " + str.charAt(2))
    println(str.indexOf("ca"))
    println(str.indexOf("Ca"))
    println(str.substring(2,5))
    println(str.replaceAll("a","A"))
    println((str == "hello scala"))
    println(str.equalsIgnoreCase("hello scala"))
    println(str.contains("scala"))
    println(str.contains("Scala"))
    println(str.toUpperCase())
    println(str.toLowerCase())
  }
}
