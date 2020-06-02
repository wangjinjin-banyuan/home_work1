import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpServer {
  public static final int FIRST_UPPER = 65;
  public static final int FIRST_LOWER = 97;
  public static final int NUM_CHARS = 26;
  public static final int OFFSET = 3;

  public static void main(String[] args) throws IOException {
    DatagramSocket ds = new DatagramSocket(10000);
    byte[] bytes = new byte[1024];
    while (true){
      DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
      ds.receive(dp);

      byte[] data = dp.getData();


      System.out.println(new String(data,0, dp.getLength()));
     // System.out.println(dp.getAddress().getHostAddress());
      //System.out.println(dp.getPort());
    }

    // ds.close();
  }

}
