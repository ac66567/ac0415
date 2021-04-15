package demo01

object ScalaDemo07 {
  /**
   * scala中的函数 function
   *
   * val f1:(Int,Int) =>Int ={(x,y)=>x+y}
   * val 函数名 : (函数数据类型) => 返回值类型 == {(参数名) => 执行体}
   *
   * val f2 = (x:Int,y:Int) => x-y
   * val 函数名 = (参数名:参数类型) => 执行体
   *
   */

  val f1: (Int, Int) => Int = { (x, y) => x + y }

  //val f2 = 匿名函数
  val f2 = (x: Int, y: Int) => x - y

  //val map1 = 匿名函数
  val map1 = (x: String) => x + "*"

  def main(args: Array[String]): Unit = {

    //调用f1方法
    var a = 10
    var b = 5
    val res = f1(a, b)
    println(res)

    //调用f2方法
    val res1 = f2(a, b)
    println(res1)

    //使用数组
    var arrs = Array("1", "2", "3")
    val str1: Array[String] = arrs.map(a => a + "*")
    val str2: Array[String] = arrs.map(map1)
    println(str1.toBuffer)
    println(str2.toBuffer)


  }
}
