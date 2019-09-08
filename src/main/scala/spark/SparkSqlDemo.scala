package spark

import org.apache.spark.sql.{DataFrame, SparkSession}
import org.apache.spark.{SparkConf, SparkContext}


object SparkSqlDemo {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("SparkSqlDemo").setMaster("local[2]")

    val session = SparkSession.builder().config(conf).getOrCreate()
    val payh = "./tmp/test.csv"

    import session.implicits._
    val data1 = session.read
      //          推断数据类型
      .option("inferSchema", "true")
      //         可设置分隔符，默认，
      //.option("delimiter",",")
      //          设置空值
      .option("nullValue", "?")
      //          表示有表头，若没有则为false
      .option("header", true)
      //          文件路径
      .csv("./tmp/test.csv")
    //          打印数据格式
    data1.printSchema()
    //      显示数据,false参数为不要把数据截断
    data1.show(false)
//
    val sql ="SELECT * from test"
    data1.createOrReplaceTempView("test")
    session.sql(sql).show(false)
  }
}

