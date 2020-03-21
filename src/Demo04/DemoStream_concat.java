package Demo04;

import java.util.stream.Stream;

/*
    concat 用于把流组合到一起合并成为另一个流
 */
public class DemoStream_concat {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("李白", "杜甫", "苏轼", "张三丰", "曹操");
        String[] arr = {"张三", "李四", "王五"};
        Stream<String> stream1 = Stream.of(arr);
        Stream<String> concat = Stream.concat(stream, stream1);
        //lambda表达式
        concat.forEach((s)
                ->
                System.out.print(s+" "));
    }
}
