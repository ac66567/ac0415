package demo04

/**
 * 混入特性
 */

class Stu()

object HunTrait {

  def main(args: Array[String]): Unit = {

    //相当于java中匿名内部类
    var stu = new Stu() with TraitOne {
      override def hello(): Unit = {
        println("trait")
      }
    }
    stu.hello()
  }

}
