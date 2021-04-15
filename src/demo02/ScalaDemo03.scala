package demo02

object ScalaDemo03 {

  //多参函数
  def method(x: Int*): Unit = {
    var sum = 0
    for (ele <- x) {
      sum += ele
    }
    println(sum)
  }

  //默认值函数
  def method1(x: Int = 5, y: Int = 7) = {
    x + y
  }

  //高阶函数 函数的参数是函数
  def apply(k: Int => String, v: Int) = k(v)

  def layout(x: Int) = "[" + x.toString + "]"


  def add(x: Int, y: Int) = x + y

  def add1(x: Int)(y: Int) = x + y

  //柯里化函数,函数的返回值是函数,多参函数
  //柯里化定义
  def klh(a: Int) = (b: Int) => a * b

  def main(args: Array[String]): Unit = {
    method(1, 2, 3, 4, 5, 6)
    val res: Int = method1()
    println(method1(y = 20))

    //调用高阶函数
    println(apply(layout, 10))

    //调用add方法
    println(add(5, 6))
    val res1: Int => Int = add1(7) //返回值是函数
    val res2: Int = res1(8) //返回值是值

    val res3: Int => Int = klh(6)
    val res4: Int = res3(10)
    println(res4)

  }
}
