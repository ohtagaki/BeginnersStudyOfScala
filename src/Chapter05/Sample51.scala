package Chapter05

object Sample51 {
  def main(args: Array[String]): Unit = {
    val oldList = List(1,2,3,4,5,6)
    val newList=for(x <- oldList)yield(x * x * x)
    println("New List："+ newList)
  }
}
