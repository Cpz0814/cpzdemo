package Demo01.shangchuang;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class TCPServer02 {
    public static void main(String[] args) throws IOException {

        ServerSocket server = new ServerSocket(8866);

        while (true){
            Socket socket = server.accept();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        InputStream is = socket.getInputStream();

                        File file = new File("F:\\Git\\CPZ\\bbb\\sws");

                        if (!file.exists()){

                            file.mkdir();

                        }

                        String filename = "cpz"+System.currentTimeMillis()+new Random().nextInt(999999)+".jpg";

                        FileOutputStream fos = new FileOutputStream(file+"\\"+filename);

                        int len=0;

                        byte[] bytes = new byte[1024];

                        while ((len=is.read(bytes))!=-1){

                            fos.write(bytes,0,len);

                        }

                        socket.getOutputStream().write("上传成功".getBytes());

                        fos.close();

                        socket.close();
                    }catch (IOException e){
                        System.out.println(e);
                    }
                }
            }).start();


        }

    }
}
