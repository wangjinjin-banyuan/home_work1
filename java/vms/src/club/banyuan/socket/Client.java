package club.banyuan.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;



public class Client {

  public static void main(String[] args) {
    try(Socket socket=new Socket()){
      System.out.println("客户端启动");

      OutputStream outputStream = socket.getOutputStream();
      InputStream inputStream=socket.getInputStream();
      byte[] bytes=new byte[1024];
      while(inputStream.read(bytes)!=-1){
        System.out.println(new String(bytes));
      }
      Scanner scan=new Scanner(System.in);
      String input=scan.nextLine();

      outputStream.write(input.getBytes());
    }catch(IOException e){
       e.printStackTrace();
    }
    System.out.println("客户端退出！");
  }

}
