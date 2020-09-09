package Chapter03

object Practice12 {
  def main(args: Array[String]): Unit = {
    println("ロボット総生産数：" + Robot.getTotal)
    var r1 = new Robot("RX")
    var r2 = new Robot("SS")
    var r3 = new Robot("ZK")
    println("ロボット総生産数：" + Robot.getTotal)
    r1.introduce()
    r2.introduce()
    r3.introduce()
  }
}

object Robot {
  private var total = 0
  def getTotal(): Int = {
    return total
  }
}

class Robot(private val name:String){
  Robot.total += 1
  private val id = Robot.total
  def introduce(): Unit = {
    println("ID：" + id + "　NAME：" + name)
  }
}
