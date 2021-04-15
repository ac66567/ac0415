package demo02

import scala.collection.mutable.ArrayBuffer

/**
 *
 * 数组
 * mutable 和immutable
 * 数组 Array 是不可变数组
 * ArrayBuffer 在mutable包中 表示了可变数组
 *
 */
object ScalaDemo01 {
  //函数
  val f1 = (x: Int) => x * 10

  //方法,传入数组,将元素乘以10并返回数组
  def method(x: Array[Int]) = {
    val arr = ArrayBuffer[Int]()
    for (ele <- x) {
      arr += (ele * 10) //+=向其内部追加,相当于append
    }
    arr.toArray
  }

  def main(args: Array[String]): Unit = {

    //数组的定义
    val arr = Array(1, 2, 3, 4, 6, 5, 9)
    //获取数组中的值
    println(arr(0))
    //使用for循环遍历
    println("遍历数组")
    for (ele <- 0 until (arr.length)) {
      println(arr(ele))
    }

    //数组中的方法,map映射方法 映射数组中的每一个元素
    val arr1: Array[Int] = arr.map(x => x * 10)
    println(arr1.toBuffer)

    val arr2: Array[Int] = arr.map(f1(_))
    println(arr2.toBuffer)

    val arr3: Array[Int] = arr.map(_ * 10)
    println(arr3.toBuffer)

    //调用方法
    val arr4: Array[Int] = method(arr)
    println(arr4.toBuffer)

    //打印所有元素
    arr.foreach(println(_))

    val arr5: Array[Int] = arr.sortWith((x, y) => x < y)
    arr5.foreach(x => print(x + "\t"))

    println()
    //过滤
    val arr6: Array[Int] = arr.filter(x => x % 3 == 0)
    arr6.foreach(x => print(x + "\t"))

  }
}
