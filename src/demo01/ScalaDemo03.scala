package demo01

object ScalaDemo03 {

  def main(args: Array[String]): Unit = {
    //运算符
    var a = 6
    var b = 7

    //算数运算符 + - * / %
    //在scala中的运算符也是函数 .+() .-()

    var c = a + b
    println(c)

    var d = a.+(b)
    println(d)

    //在scala中,自增自建运算符,使用+= -= 代替++ --
    var i = 10
    i += 1
    println(i)

  }
}
