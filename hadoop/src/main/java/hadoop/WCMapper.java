package hadoop;

import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

// 4个泛型仲,1:输入key的类型,2输入的value类型,4
public class WCMapper extends Mapper<LongWritable, Text,Text,LongWritable> {


    // 每读一行,调用改方法
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {

        final String s = value.toString();


        final String[] words = StringUtils.split(s, " ");


        for(String word:words){
            context.write(new Text(word),new LongWritable(1));
        }
    }
}
