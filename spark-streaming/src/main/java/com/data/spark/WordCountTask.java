package com.data.spark;

import java.util.Arrays;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.streaming.Duration;
import org.apache.spark.streaming.api.java.JavaStreamingContext;

import scala.Tuple2;

/**
 * 统计单词计数
 * 
 * @author onlyone
 */
public class WordCountTask {

    /*
     * This is the address of the Spark cluster. We will call the task from WordCountTest and we use a local standalone
     * cluster. [*] means use all the cores available. See {@see
     * http://spark.apache.org/docs/latest/submitting-applications.html#master-urls}.
     */
    private static String master = "local[*]";

    public static void splitWordCount(String inputFile) {

        SparkConf conf = new SparkConf();
        JavaSparkContext javaSparkContext = new JavaSparkContext(conf);
        JavaStreamingContext ssc = new JavaStreamingContext(javaSparkContext, new Duration(1000));
        
        

    }
}
