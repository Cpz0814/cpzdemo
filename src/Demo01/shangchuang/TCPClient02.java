package Demo01.shangchuang;

import java.io.*;
import java.net.Socket;

public class TCPClient02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("F:\\Git\\CPZ\\bbb\\ddd\\a.jpg");


        Socket socket = new Socket("127.0.0.1",8888);
        OutputStream os = socket.getOutputStream();

        System.out.println("11111111111111111111");
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len=fis.read(bytes))!=-1){
            os.write(bytes,0,len);
        }

        socket.shutdownOutput();
        System.out.println("222222222222222222222222");
        InputStream is = socket.getInputStream();


        while ((len=is.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }

        fis.close();
        socket.close();
    }
}
