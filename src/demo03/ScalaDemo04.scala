package demo03

/**
 * 元组
 * tuple
 * 在scala中,  [()]是元组类型
 * 基本数据类型,引用数据类型,元组数据类型
 * 访问元组数据  _1  _2  _3 ......
 */
object ScalaDemo04 {

  def abc(x: Int, y: Int): (Int, Int, Int, Int) = {
    val list = ((x + y, x - y, x * y, x / y))
    list
  }

  def add(x: Int, y: Int): List[(Int, Int, Int, Int)] = {
    val list = List((x + y, x - y, x * y, x / y))
    list
  }

  def main(args: Array[String]): Unit = {

    val tuple: (String, String, Int) = Tuple3("战神", "男", 11)
    println(tuple._1)
    println(tuple._2)
    println(tuple._3)

    val tu: (Int, Int, Int, Int) = abc(5, 7)
    println(tu._1)

    val tuples: List[(Int, Int, Int, Int)] = add(5, 7)
    println(tuples(0)._1)

    //对偶元组
    val arrs: Array[(String, Int)] = Array(("hello", 19), ("scala", 18), ("tom", 20))
    val swap: (Int, String) = arrs(0).swap
    println(swap._1 + "\t" + swap._2)
  }

}
