package demo05

class A {
  def a(name: String): Unit = {
    println("我是A方法 " + name)
  }
}

class B {
  def b(name: String): Unit = {
    println("我是B方法 " + name)
  }
}

/**
 * 隐式转换类,希望通过隐式转换,让A类中具备B类中方法
 */
object ScalaDemo02 {

  implicit def a2B(a: A): B = {
    new B
  }

  def main(args: Array[String]): Unit = {
    var a = new A()
    var b = new B()
    a.a("hello")
    b.b("scala")

    //使用隐式转换,调用B类中方法
    a.b("隐式转换")

  }

}
