package demo01

object ScalaDemo01 {

  def main(args: Array[String]): Unit = {

    //输出
    println("hello scala")
    //定义变量
    /**
     * var 定义变量值可变
     * val 定义的变量值不可变,想当于java中的常量
     */
    //scala中八种基本数据类型
    var name: String = "张三"
    println(name)

    val age: Float = 19
    println(age)
    //val定义的值,不可变
    //age=20

    //空Unit
    val res:Unit =println("hello")
    println(res)

  }
}
