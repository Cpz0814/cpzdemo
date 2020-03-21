package Demo04;

import java.util.stream.Stream;
/*
    filter对Stream流中的数据进行过滤
 */
public class DemoStream_filter {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("李白", "杜甫", "苏轼", "张三丰", "曹操");

        Stream<String> stream1 = stream.filter((name)->name.startsWith("张"));

        stream1.forEach((name)-> System.out.println(name));

        /*
            Stream流只能使用一次
            第一个Stream流调用完毕方法，数据就会流到下一个Stream上
            而这时第一个Stream流已经使用完毕，就会关闭了
         */
    }
}
