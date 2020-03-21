package Demo04;

import java.util.stream.Stream;
/*
    forEach对Stream流数组进行遍历
 */
public class DemoStream_foEach {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三", "李四", "王五");

        stream.forEach((name)->
                System.out.println(name));

    }
}
