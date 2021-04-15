package demo04

/**
 * 面向对象
 * 在scala中,对象有两种
 * Object 静态类
 * class 封装类
 * Trait 特性,相当于java中接口
 * abstract 抽象类
 */
class Student(n: String, y: Int) {

  var name: String = n
  var age: Int = y

  //方法
  def show() = {
    println(name + "\t" + age)
  }

}

//伴生类,apply伴生方法
object Student {
  def apply(n: String, y: Int): Student = new Student(n, y)

  def apply(n: String, y: Int, x: Int): Student = new Student(n, y)
}