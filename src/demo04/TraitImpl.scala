package demo04

class TraitImpl extends AbstractClass with TraitOne {

  override def add(str: String): Unit = {
    println(str)
  }

  override def hello(): Unit = {
    println("实现接口中的方法")
  }
}
