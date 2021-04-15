package demo01

object ScalaDemo02 {

  def main(args: Array[String]): Unit = {
    /**
     * 输出
     * println
     * printf
     * println()
     */

    var stuName = "张三"
    var stuAge = 19
    var stuSex = '男'
    //输出1
    println("姓名:" + stuName)
    //输出2
    printf(f"姓名:${stuName}" + s"年龄:${stuAge}")
    //输出3
    printf("姓名:%s,年龄:%s,性别:%s", stuName, stuAge, stuSex)

    //
    var stu = new Student("tom", 19)
    println(stu.name)
    println(s"姓名:${stu.name}")
  }

}

//自定义类
class Student(var name: String, var age: Int)
