package demo05

/**
 * 隐式转换 implicit
 * 自动类型转换
 * 数值类型自动转换,引用类型自动转换,方法自动转换
 *
 * 隐式函数
 * 隐式类
 * 隐式参数
 */
object ScalaDemo01 {

  def main(args: Array[String]): Unit = {

    //将 100.99 转换成 100
    implicit def double2Int(d: Double): Int = {
      d.toInt
    }

    var d: Int = 100.99
    println(d)

    //将 "255" 转换成 255
    implicit def String2Int(str: String): Int = {
      Integer.parseInt(str)
    }

    var str: Int = "255"
    println(str)

  }
}
