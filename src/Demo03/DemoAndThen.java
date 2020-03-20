package Demo03;

import java.util.function.Consumer;

public class DemoAndThen {
    public static void mythod(String s, Consumer<String> con1,
                              Consumer<String> con2){
        /*con1.accept(s);
        con2.accept(s);*/
        con1.andThen(con2).accept(s);
    }

    public static void main(String[] args) {
        mythod("Hello", (t)-> System.out.println(t.toUpperCase()),
            (t)-> System.out.println(t.toLowerCase()));
    }
}
