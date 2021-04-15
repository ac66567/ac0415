package demo03

import scala.collection.mutable

object ScalaDemo03 {

  def main(args: Array[String]): Unit = {
    var set = Set(4, 6, 1, 8, 9, 5)
    //遍历集合
    for (ele <- set) println(ele)
    //向集合中插入元素
    val ints: Set[Int] = set.+(23)

    //可变集合
    val hashSet: mutable.HashSet[Int] = mutable.HashSet[Int]()
    hashSet += (12)
    hashSet += (13)
    hashSet += (14)
    hashSet += (15)
    println(hashSet)

    //集合的转换
    var list: List[Int] = hashSet.toList
    println(list.toBuffer)

    val set2: Set[Int] = list.toSet

    //map集合
    var map = mutable.HashMap[String, Int]("a" -> 97, "b" -> 98, "c" -> 100)
    var list1: List[(String, Int)] = map.toList

    val map2: Map[String, Int] = list1.toMap

    var setOne = Set(3, 4, 5, 6)
    var setTwo = Set(2, 7, 8, 9)

    val map3: Map[Int, Int] = setOne.zip(setTwo).toMap


  }

}
