package demo05

/**
 * 隐式类,通过构造方法,进行隐式转换
 */
object ScalaDemo04 {

  implicit class DB1(val m: Mysql1) {
    def display = println(m.n + " scala")
  }

  def main(args: Array[String]): Unit = {
    val mysql = new Mysql1("hello")
    mysql.display
  }
}

class Mysql1(var n: String)