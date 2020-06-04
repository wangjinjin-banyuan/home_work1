import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TcpClient {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
      try (Socket socket = new Socket("127.0.0.1", 10000)) {
        System.out.println("客户端启动");
        File file = new File("/Users/edz/home_work1/java/udp/Tcp/test1");
        FileWriter fw=null;
        FileReader fr=null;
       try {
         if (!file.exists()) {
           file.createNewFile();
         }
          fw = new FileWriter(file);
         System.out.println("请输入内容：");
         String word = scan.nextLine();

         fw.write(word);
       }catch(IOException e){
         e.printStackTrace();
       }finally {
         fw.close();
       }
       try{
          fr=new FileReader(file);
         char[] ch=new char[1024];
         while( fr.read(ch)!=-1){
           String b= new String(ch);
           OutputStream outputStream = socket.getOutputStream();
           outputStream.write(b.getBytes());
           System.out.println("发送成功");
         }

       }catch(IOException e){
         e.printStackTrace();
       }finally {
         fr.close();
       }

        //OutputStream outputStream = socket.getOutputStream();
       // outputStream.write("你好".getBytes());
       // System.out.println("发送成功");

        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
            inputStream.read(bytes);
        System.out.println("来自服务器的消息:" + new String(bytes));

      } catch (IOException e) {
        e.printStackTrace();
      }


    System.out.println("客户端退出");
  }
}
