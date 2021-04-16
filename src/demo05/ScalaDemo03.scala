package demo05

object ScalaDemo03 {

  implicit def mysql2DB(ms: Mysql): DB = new DB

  implicit def mysql2NoSql(ms: Mysql): NoSql = new NoSql

  def main(args: Array[String]): Unit = {
    var sql = new Mysql()
    sql.insert
    sql.select

    //通过隐式转换,获取转换类的方法
    sql.create
    sql.buffer

  }
}

class Mysql {
  def insert = {
    println("我可以向数据库插入数据")
  }

  def select = {
    println("我可以从数据库查询数据")
  }
}

class DB {
  def create = {
    println("我可以创建数据库")
  }
}

class NoSql {
  def buffer = {}

  println("我可以缓存数据")
}