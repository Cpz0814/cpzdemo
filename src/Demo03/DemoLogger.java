package Demo03;

public class DemoLogger {
    public static void showlog(int level,String message){
        if (level==1){
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        String msg1="c";
        String msg2="p";
        String msg3="z";
        showlog(1,msg1+msg2+msg3);
    }
}
