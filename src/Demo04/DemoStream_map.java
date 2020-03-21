package Demo04;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;
/*
    map可以将当前的Stream流中的数据类型转换为另一种的数据类型的流。
 */
public class DemoStream_map {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3", "4", "5");

        /*Stream<Integer> stream1 = stream.map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        });*/
        //使用Lambda表达式  ↓
        Stream<Integer> stream1 = stream.map((s)
                ->
            Integer.parseInt(s)
        );



        /*stream1.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                return System.out.println(i);
            }
        });*/
        //使用Lambda表达式  ↓
        stream1.forEach((i)
                ->
                System.out.println(i));
    }
}
