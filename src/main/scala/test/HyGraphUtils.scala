package test

import com.alibaba.fastjson.{JSON, JSONArray}
import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object HyGraphUtils {

  def main(args: Array[String]): Unit = {


    val conf = new SparkConf().setMaster("local[1]").setAppName("wc")

    val sc = new SparkContext(conf)

    val rdd: RDD[String] = sc.textFile(args(0))

    var rules = rdd.collect()(0)

    println(rules)

    val nodes = JSON.parseObject(rules).getJSONArray("node")

   var node = nodes.getJSONObject(0)
      .getJSONObject("data")
       println(node)



    println(nodes.getClass)



//    rdd.foreach(println)

  }

}

