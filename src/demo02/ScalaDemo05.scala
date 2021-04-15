package demo02

object ScalaDemo05 {
  /**
   * Map 集合
   */

  def main(args: Array[String]): Unit = {
    val map: Map[String, Int] = Map[String, Int]("abc" -> 1, "jack" -> 2, "hello" -> 5, "sql" -> 3)
    //获取集合中的元素
    println(map.get("a"))
    println(map.getOrElse("hello", 0))

    //遍历集合
    val keys: Iterable[String] = map.keys
    for (ele <- keys) {
      println(map.get(ele))
    }

    //获取到键值对
    for (e <- map) {
      println("key:" + e._1 + "values:" + e._2)
    }

    //向map中插入值
    val map1: Map[String, Int] = map.+("ad" -> 6)
    println(map1.toBuffer)

    //获取count值,包含 a 的数组元素
    println()
    println("获取count值,包含 a 的数组元素")
    val map2: Map[String, Int] = map.filter(x => x._1.contains("a"))
    println(map2.toBuffer + "\t" + map2.size)

    //    var aa = 0
    //    for (e <- map) {
    //      if (e._1.contains("a")) aa += 1
    //      if (e._1.contains("a")) println(e._1)
    //    }
    //    println(aa)

    //过滤出,长度大于3的数组元素
    println("过滤出,长度大于3的数组元素")
    //    for (e <- map) {
    //      if (e._1.length > 3) println(e._1)
    //    }
    val map3: Map[String, Int] = map.filter(x => x._1.size > 3)
    println(map3.toBuffer)
  }

}
