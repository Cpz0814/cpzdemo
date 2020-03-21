package Demo04;

import java.util.function.Consumer;
import java.util.stream.Stream;

/*
    limit截取流中的元素
 */
public class DemoStream_limit {
    public static void main(String[] args) {
        String[] arr = {"李白","杜甫","苏轼"};
        Stream<String> arr1 = Stream.of(arr);
        Stream<String> limit = arr1.limit(3);

        /*limit.forEach(new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println(name);
            }
        });*/
        //使用Lambda表达式
        limit.forEach((name)
                ->
                System.out.println(name)
            );
    }
}
