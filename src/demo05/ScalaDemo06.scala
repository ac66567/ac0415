package demo05

/**
 * 需求
 * 欢乐谷购票系统
 * 学生,老人, 特护人群(儿童,心脏病,饮酒者)
 */
class Worker(val name: String)

class Student(val name: String)

class Old(val name: String)

class SpecialPerson(val name: String) //特殊人群不可以购票

//购票系统
class TichkerSystem {
  def buy(p: SpecialPerson): Unit = {
    if (p.name.length > 1) {
      println("购票成功" + p.name)
    } else {
      println("购票失败")
    }
  }
}

object ScalaDemo06 {

  implicit def obj2SpecialPerson(obj: Object): SpecialPerson = {
    if (obj.getClass == classOf[Student]) {
      val stu = obj.asInstanceOf[Student]
      new SpecialPerson(stu.name)
    } else if (obj.getClass == classOf[Old]) {
      val old = obj.asInstanceOf[Old]
      new SpecialPerson(old.name)
    } else {
      new SpecialPerson("")
    }
  }


  def main(args: Array[String]): Unit = {
    val wor = new Worker("工作人员")
    val old = new Old("老人")
    val stu = new Student("李四")

    val sys = new TichkerSystem
    sys.buy(wor)
    sys.buy(old)
    sys.buy(stu)
  }

}
