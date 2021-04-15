package demo03

object ScalaDemo01 {
  /**
   * Scala中的集合
   * List Set Map
   *
   * immutable.List 表示当前集合存储数据不可变
   */

  def main(args: Array[String]): Unit = {

    //定义集合
    val list = List(11, 22, 33, 44)
    val listCopy = List(5, 6, 7, 8)
    //获取数据
    //遍历集合
    for (ele <- list) println(ele + " ")
    println()

    //获取头部数据
    println(list.head)
    //获取尾部数据
    println(list.tail)

    //创建集合,使用拼接模式
    val list1: List[Int] = 4 :: 5 :: 6 :: 7 :: Nil

    //向集合头部追加数据
    val list2: List[Int] = list1.+:(1)
    //向集合尾部追加数据
    val list3: List[Int] = list2.:+(1)

    //向头部追加集合
    val list4: List[Int] = list3.++:(list)
    //向尾部追加集合
    val list5: List[Int] = list4 ++ (list)


    //拼接集合
    val copy: List[Int] = list ::: listCopy

    //拼接元素
    val copy1: List[Any] = list :: List(99, 100)

    //拼接元素
    val copy2: List[Int] = copy.::(5)
    val copy3: List[Int] = 100 :: copy

    //集合长度
    println(list.size)

    //集合的统计个数
    println(list.count(x => x % 2 == 0))

    //集合中的过滤 filter  ("","")元组
    var fil = List(("hello", 2), ("scala", 3), ("java", 4))
    val tuples: List[(String, Int)] = fil.filter(x => x._1.length == 5)
    println(tuples.toBuffer)

  }

}
