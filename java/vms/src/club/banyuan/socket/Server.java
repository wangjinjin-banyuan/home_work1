package club.banyuan.socket;

import club.banyuan.machine.VendingMachine;
import club.banyuan.machine.VendingMachineWithMenu;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

  public static void main(String[] args) {
    try(ServerSocket serverSocket=new ServerSocket(10000)){
      System.out.println("服务端启动，等待客户端连接");
      Socket socket=serverSocket.accept();
      String hostAddress=socket.getInetAddress().getHostAddress();
      System.out.println(hostAddress+"客户端接入");

      InputStream inputStream=socket.getInputStream();
      OutputStream outputStream=socket.getOutputStream();
      byte[] bytes=new byte[1024];
      //开始接受数据然后进行处理
      //然后将处理后的答案通过输出流传回客户端
      while(true){
        int count=inputStream.read(bytes);
        String input=new String(bytes,0,count);
        System.out.println("客户端的输入是："+input);
        //对接受的数据进行处理,去得到一个返回，将返回的结果写到输出流发送到客户端
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.start();
        VendingMachineWithMenu vendingMachineWithMenu = new VendingMachineWithMenu();
        vendingMachineWithMenu.start();
        outputStream.write(bytes);

      }



    }catch(IOException e){
      e.printStackTrace();
    }
    System.out.println("服务器退出");
  }
}
