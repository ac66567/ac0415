package demo02

object ScalaDemo02 {

  def main(args: Array[String]): Unit = {
    val arrs = Array(23, 5, 77, 1, 65, 57, 32, 97)
    //属性
    println(arrs.max) //最大值
    println(arrs.min) //最小值
    println(arrs.sum) //求和
    println(arrs.count(x => x > 0)) //计数
    println(arrs.length) //长度

    /**
     * map映射每个元素的方法
     * flatten 扁平化,压平
     * flatMap
     * groupBy
     * mapValues
     * toList
     * sortBy
     */
    val str = Array("hello world hello scala hello scala", "tom jack hello jack tom scala lucy")
    val spl: Array[Array[String]] = str.map(x => x.split(" "))

    //将数组中数组切分压平
    val flatten: Array[String] = spl.flatten
    println(flatten.toBuffer)

    //worldCount
    //第一步,切分压平,flatMap是flatten和map的简写
    val str1: Array[String] = str.flatMap(_.split(" "))
    //第二步,对单词进行分组
    val str2: Map[String, Array[String]] = str1.groupBy(x => x)
    //第三步,对分组单词计数
    val str3: Map[String, Int] = str2.mapValues(x => x.length)
    //第四部,转换成list集合
    val str4: List[(String, Int)] = str3.toList
    //第五步,进行排序
    val str5: List[(String, Int)] = str4.sortBy(_._2)


    //val str = Array("hello jany hello scala hello scala", "tom jack hello jack tom scala lucy")
    str.flatMap(x => x.split(" ")).groupBy(x => x).mapValues(_.length).toList.sortBy(_._2).foreach(x => println(x))

  }

}
