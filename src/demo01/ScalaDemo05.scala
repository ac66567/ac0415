package demo01

object ScalaDemo05 {

  //scala中的for循环
  def main(args: Array[String]): Unit = {
    //for循环
    for (ele <- 1 to 10) {
      print(ele + " ")
    }
    println()
    //until循环
    for (ele <- 1 until (10)) {
      print(ele + " ")
    }
    println()
    //定义数组
    var arr = Array(1, 2, 3, 4, 5, 6, 7, 8, 9)
    for (ele <- arr) {
      print(ele + " ")
    }
    println()
    //使用下标循环数组
    for (ele <- 0 until (arr.length)) {
      print(arr(ele) + " ")
    }
    println()

    //
    println("输出数组中的偶数")
    for (ele <- 0 until (arr.length)) {
      if (arr(ele) % 2 == 0)
        print(arr(ele) + " ")
    }
    println()
    //在scala中可以对for循环添加守卫
    println("输出数组中偶数,添加守卫")
    for (ele <- 0 until (arr.length) if (arr(ele) % 2 == 0)) {
      print(arr(ele) + " ")
    }

    println()
    //将数组中的偶数,循环添加到新数组中 yield
    var arr2 = for (e <- arr if (e % 2 == 0)) yield e
    for (ele <- arr2) println(ele + " ")
    println()

    //嵌套循环
    for (i <- 1 to 10; j <- 1 to 3) println(i + "--" + j + "  ")

    println()
    //打印99乘法表
    for (i <- 1 to 9; j <- 1 to i) {
      print(i + "*" + j + "=" + (i * j) + "\t")
      if (i == j) println()
    }
    println()


    //计算arr数组中值的和
    var sum = 0
    for (ele <- 0 until (arr.length)) {
      sum += arr(ele)
    }
    println("arr数组中值的和:" + sum)

    //冒泡排序
    println("冒泡排序")
    var arr1 = Array(3, 21, 55, 67, 86, 39, 91, 22, 7)
    for (i <- 0 to arr1.length - 1) {
      for (ele <- 0 until (arr1.length - 1 - i)) {
        var temp = 0
        if (arr1(ele) > arr1(ele + 1)) {
          temp = arr1(ele)
          arr1(ele) = arr1(ele + 1)
          arr1(ele + 1) = temp
        }
      }
    }
    for (ele <- arr1) print(ele + " ")


  }

}
