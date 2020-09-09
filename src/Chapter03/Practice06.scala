package Chapter03

object Practice06 {
  def main(args: Array[String]): Unit ={
    val book = new Book
    book.title = "楽しいScala"
    book.author = "山田太郎"
    book.price = 2980
    book.getInfo
  }

  class Book {
    var title = ""
    var author = ""
    var price = 0
    def getInfo(){
      println("タイトル：" + title)
      println("著者：" + author)
      println("価格：" + price + "円")
    }
  }
}
