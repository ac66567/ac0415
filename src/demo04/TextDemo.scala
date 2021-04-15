package demo04

object TextDemo {

  def main(args: Array[String]): Unit = {
    var stu = new Student("ls", 20)
    println(stu.name)

    var stu1 = new Student("zs", 21)
    println(stu1.name)

    var stu2 = Student.apply("ww", 20) //语法糖
    var stu3 = Student("zl", 20, 20)

    List.apply(1, 2, 3, 4, 5)

    var tea = new Teacher("", 1)
    println(tea.name)

    //实例化Teacher
    var tea1 = Teacher("mi", 20)
    println(tea1.name)

  }

}
