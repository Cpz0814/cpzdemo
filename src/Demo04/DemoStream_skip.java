package Demo04;

import java.util.function.Consumer;
import java.util.stream.Stream;

/*
    skip跳过流中的元素截取之后的元素
 */
public class DemoStream_skip {
    public static void main(String[] args) {
        String[] arr = {"李白","杜甫","苏轼"};
        Stream<String> stream = Stream.of(arr);
        Stream<String> skip = stream.skip(1);

        /*skip.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        //使用Lambda表达式
        skip.forEach((s)
                ->
                System.out.println(s)
        );
    }
}
