package demo03

import scala.collection.mutable.ListBuffer

object ScalaDemo02 {

  def main(args: Array[String]): Unit = {
    val list = List.apply(2, 1, 3, 7, 5, 6, 9, 8)
    val list1 = List(1, 2, 3, 4, 5)

    val tuples = List(("hello", 2), ("world", 1), ("tom", 5), ("lucy", 18))

    //排序
    tuples.sortWith((x, y) => x._2 > y._2)
    tuples.sortBy(x => x._2)

    //fold折叠
    val res: Int = list1.fold(5)((x, y) => x + y)
    println(res)
    list1.foldLeft(1)((x, y) => x + y)
    list1.foldRight(1)((x, y) => x + y)

    //分组统计
    val list4: List[List[Int]] = list.grouped(3).toList
    println(list4.toBuffer)

    //集合反转 sorted整理排序 reverse反转
    println(list.sorted.reverse.toBuffer)

    //统计reduce分区内部聚合
    println(list.reduce((x, y) => x + y))

    //全集,交集,差集
    var coll = List(1, 2, 3, 4)
    var coll1 = List(3, 4, 5, 6)
    println(coll.union(coll1).toBuffer)
    println(coll.intersect(coll1).toBuffer)
    println(coll.diff(coll1).toBuffer)

    //拉链 zip
    val zip: List[(Int, Int)] = coll.zip(coll1)
    println(zip.toBuffer)

    //aggregate 局部聚合,全局聚合
    println(coll.aggregate(1)((x, y) => x + y, (x, y) => x + y))

    //可变集合
    val ints: ListBuffer[Int] = ListBuffer[Int](1, 2)
    ints += 11
    ints.append(16)
    println(ints.toBuffer)


  }
}
