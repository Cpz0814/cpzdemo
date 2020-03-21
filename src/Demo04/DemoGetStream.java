package Demo04;

import java.util.*;
import java.util.stream.Stream;

/*
    Stream流
 */
public class DemoGetStream {
    public static void main(String[] args) {
        //把集合转换为Stream流
        List<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> stream1 = set.stream();

        Map<String,String> map = new HashMap<>();
        //获取键，储存到一个Set集合中
        Set<String> keySet = map.keySet();
        Stream<String> stream2 = keySet.stream();
        //获取值，储存到一个Collection集合中
        Collection<String> values = map.values();
        Stream<String> stream3 = values.stream();
        //获取键值对（键与值得映射关系 entrySet）
        Set<Map.Entry<String,String>> entries = map.entrySet();
        Stream<Map.Entry<String,String>> stream4 = entries.stream();

        //把数组转换为Stream流
        Stream<Integer> stream5 = Stream.of(1,2,3,4,5,6);

        Integer[] arr = {1,2,3,4,5,6};
        //可变参数可以传递数组
        Stream<Integer> stream6 = Stream.of(arr);
        String[] arr2 = {"c","p","z"};
        Stream<String> stream7 = Stream.of(arr2);

    }
}
