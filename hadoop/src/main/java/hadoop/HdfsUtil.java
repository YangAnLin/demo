package hadoop;


import org.apache.commons.io.IOUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.FileOutputStream;
import java.io.IOException;

public class HdfsUtil {

    public static void main(String[] args) throws IOException {

        Configuration configuration = new Configuration();
        System.setProperty("hadoop.home.dir", "C:\\develop\\hadoop-2.4.1");
        System.setProperty("hadoop.HADOOP_USER_NAME.dir", "root");
        configuration.addResource(new Path("./core-site.xml"));
        configuration.set("fs.defaultFS", "hdfs://192.168.2.200:9000");


        FileSystem fs = FileSystem.get(configuration);

        Path path = new Path("hdfs://192.168.2.200:9000/jdk-8u152-linux-x64.tar.gz");
        final FSDataInputStream in = fs.open(path);

        final FileOutputStream os = new FileOutputStream("D:\\jdk-8u152-linux-x64.tar.gz");

        IOUtils.copy(in, os);

    }


}
