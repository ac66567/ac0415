package demo01

object ScalaDemo04 {

  def main(args: Array[String]): Unit = {
    var a = 15
    //if判断结构
    println(if (a == 10) "正确")

    //if else结构
    println(if (a % 2 == 0) "偶数" else " 奇数")
    //if else if
    var res = if (a % 2 == 0) "偶数" else if (a % 3 == 0) "3的倍数"
    println(res)

    /**
     * 重点
     * 在scala中,if判断有返回值
     * 在scala中不需要return,最后一行是返回值
     */
    var b = 15
    var res1 = if (b % 2 == 0)
      1
    else {
      100
      10
    }
    println(res1)
  }
}
