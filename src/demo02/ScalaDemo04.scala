package demo02

/**
 * 四个重点
 * 1 高阶函数
 * 2 柯里化函数
 * 3 偏函数
 * 4 隐式转换 相当于java中工厂模式
 */
object ScalaDemo04 {

  //偏函数PartialFunction

  def f1(x: Any): Int = {
    if (x.equals("a")) 97 else 0
  }

  //定义偏函数 判断值
  def f2: PartialFunction[Any, Int] = {
    case "a" => 97
    case "b" => 98
    case _ => 0
  }

  //定义偏函数 判断类型
  def f3: PartialFunction[Any, String] = {
    case i: String => "[" + i + "]"
  }

  def main(args: Array[String]): Unit = {
    println(f1("b"))
  }

  //调用偏函数
  println(f2(3.1))

  println(f3("world"))

  var arr = Array[Any](1, 3, "hello", 2.2, "scala", "world")
  val res: Array[String] = arr.collect(f3)
  println(res.toBuffer)

}
