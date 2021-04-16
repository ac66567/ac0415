package demo05

object ScalaDemo05 {

  def hello(str: String)(implicit context: String, age: Int) = {
    println("姓名:" + str + " 职业:" + context + " 年龄:" + age)
  }

  implicit val name: String = "学生"
  implicit val ag: Int = 18

  def main(args: Array[String]): Unit = {
    hello("zs")
  }
}
