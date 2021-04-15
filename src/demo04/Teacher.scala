package demo04

class Teacher(
               var name: String,
               var age: Int)

object Teacher {
  //静态类的构造方法
  def apply(n: String, a: Int): Teacher = new Teacher(n, a)
}


