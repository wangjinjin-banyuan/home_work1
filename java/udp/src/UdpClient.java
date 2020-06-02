import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UdpClient {

  public static void main(String[] args) throws IOException {
    DatagramSocket ds = new DatagramSocket();
    Scanner scan =new Scanner(System.in);
    System.out.println("请输入内容：");
    while (true) {
      String word = scan.nextLine();
      byte[] bytes = word.getBytes();
//      DatagramPacket dp = new DatagramPacket(bytes, bytes.length,
//          InetAddress.getByName("192.168.9.220"),
//          10000);
      DatagramPacket dp = new DatagramPacket(bytes, bytes.length,
          InetAddress.getByName("127.0.0.1"),
          10000);
      ds.send(dp);

      //ds.close();
    }
  }
}
