package Demo04;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
    count 返回Stream流中元素的个数
 */

public class DemoStream_count {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        Stream<Integer> stream = list.stream();
        long count = stream.count();
        System.out.println(count);
    }
}
