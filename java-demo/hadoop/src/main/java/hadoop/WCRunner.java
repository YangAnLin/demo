package hadoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import java.io.IOException;

public class WCRunner {

    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        Configuration configuration = new Configuration();
        System.setProperty("hadoop.home.dir", "C:\\develop\\hadoop-2.4.1");
        System.setProperty("hadoop.HADOOP_USER_NAME.dir", "root");

        final Job job = Job.getInstance(configuration);
        // 设置真个job所用的类在哪里NativeIO
        job.setJarByClass(WCRunner.class);

        // job使用的mapper和reduce
        job.setMapperClass(WCMapper.class);
        job.setReducerClass(WCReducer.class);

        // 指定reduce的输出类型kv类型
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(LongWritable.class);

        // 指定mapper的输出类型kv类型
        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(LongWritable.class);

        // 指定原始数据存放在哪里
        FileInputFormat.setInputPaths(job, new Path("C:\\develop\\hadoop-2.4.1\\share\\doc\\hadoop\\hadoop-project-dist\\hadoop-common\\core-default.xml"));

        // 处理结果的存放路径
        FileOutputFormat.setOutputPath(job, new Path("d:\\count.txt"));

        // 提交给集群
        job.waitForCompletion(true);

    }

}
