package demo01

object ScalaDemo06 {

  /**
   * scala中拥有方法和函数
   * method是对象中的方法,在scala中所有的方法都是静态的
   * def 方法名(参数名:参数类型) : 返回值类型 = {执行体}
   */

  def method1(a: Int): Unit = {
    println(a)
  }

  def method2(a: Int) = {

  }

  def method3() = {
    10
  }

  def method4(): String = {
    "hello"
    "scala"
    "world"
  }

  def main(args: Array[String]): Unit = {
    //有参数方法
    method1(10)
    //有返回值的方法
    val str: String = method4()
    println(str)

    //自动推算返回值的方法
    val res1: Int = method3()

  }

}
