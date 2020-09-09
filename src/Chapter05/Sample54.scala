package Chapter05

object Sample54{
  def main(args: Array[String]): Unit = {
    val sum=(x:Int,y:Int)=> x+y
    val multiply=(x:Int,y:Int)=> x*y
    println(sum(1,2))
    println(multiply(3,4))
    println(calculate(sum))
  }
  def calculate(func:(Int,Int)=>Int)=func(5,9)
}
