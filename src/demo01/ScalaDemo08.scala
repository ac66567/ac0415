package demo01

object ScalaDemo08 {
  //方法
  def method1(x: Int, y: Int) = {
    x + y
  }

  //函数
  val f1 = (x: Int, y: Int) => x + y

  //测验
  //我要一个方法,参数是函数,这个方法有三个参数, 函数,值,值
  def method2(f3: (Int, Int) => Int, x: Int, y: Int) = {
    f3(x, y)
  }

  val f3 = (x: Int, y: Int) => (x * y)

  def main(args: Array[String]): Unit = {
    val res1: Int = method1(10, 5)
    println(res1)
    val res2: Int = f1(10, 5)
    println(res2)

    //调用method2方法
    val res3: Int = method2((x, y) => x + y, 10, 20)
    println(res3)
    val res4: Int = method2((x, y) => x - y, 10, 20)
    println(res4)

    //方法中,传递函数
    val res5: Int = method2(f3, 10, 20)
    println(res5)

    //方法可以转换成函数,在方法名后加 _
    val f6: (Int, Int) => Int = method1 _
    val res7: Int = f6(10, 7)
    println(res7)

  }

}
