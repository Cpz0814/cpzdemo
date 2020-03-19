package Demo01.shangchuang;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer02 {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        Socket socket = server.accept();
        InputStream is = socket.getInputStream();
        File file = new File("F:\\Git\\CPZ\\bbb\\sws");
        if (!file.exists()){
            file.mkdir();
        }
        FileOutputStream fos = new FileOutputStream(file+"\\a.jpg");
        System.out.println("111221212121212");
        int len=0;
        byte[] bytes = new byte[1024];
        while ((len=is.read(bytes))!=1){
            fos.write(bytes);
        }

        System.out.println("45454545454545");
        socket.getOutputStream().write("上传成功".getBytes());

        fos.close();
        socket.close();
        server.close();
    }
}
