package demo04

abstract class AbstractClass {

  //抽象方法
  def add(str: String)

  //非抽象方法
  def play(str: String) = {
    println(str)
  }

}
