package Chapter04

object Practice18 {
  def main(args: Array[String]): Unit = {
    val book = new Book("人間失格",500,"太宰治")
    val magazine = new Magazine("東京グルメ",980,"ABC出版編集部","上田彩")
    println(book.toString())
    println(magazine)
  }
}

class Book(protected val title:String,protected val price:Int,protected val author:String){
  override def toString() :String= {
    return "タイトル：" + title + " 価格：" + price + "円　著者：" + author
  }
}

class Magazine(t:String,p:Int,a:String,private val coverPersonName:String) extends Book(t,p,a){
  override def toString(): String = {
    return "タイトル：" + title + " 価格：" + price + "円　著者：" + author + " 表紙：" + coverPersonName + "さん"
  }
}
