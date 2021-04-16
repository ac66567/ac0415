package demo04

class AbstractClassImpl extends AbstractClass {

  override def add(str: String): Unit = {
    println("[" + str + "]")
  }

  override def play(str: String): Unit = {

  }
}
