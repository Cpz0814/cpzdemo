package Demo02;

//函数类接口的使用：一般可以作为方法的参数和返回值

public class Demo {

    public static void show(MyFunctionalInterface mtfun){
        mtfun.method();
    }

    public static void main(String[] args) {
        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("6666666666666666");
            }
        });

        show(()-> System.out.println("666666666655555"));
    }
}
