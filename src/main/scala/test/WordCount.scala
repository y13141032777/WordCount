package test

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object WordCount {

    def wc(path:String) {
//      val list = List("hello", "leno", "hello")

      val conf = new SparkConf().setMaster("local").setAppName("wc")

      val sc = new SparkContext(conf)

      val rdd: RDD[String] = sc.textFile(path).flatMap(_.split(" "))
      rdd.map {
        (_, 1)
      }.reduceByKey(_ + _).foreach(println)
    }

  def main(args: Array[String]): Unit = {
    wc(args(0))
  }
}
