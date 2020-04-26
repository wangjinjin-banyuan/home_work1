package club.banyuan;
import java.util.Random;
public class randomInt{
	static  int i;
	public static int randomInt(int from,int to){
		if(from>to)
		{
			System.out.println("输入不合理！");
			return 0;
		}
		else{
		Random random = new Random();
		i = random.nextInt(to-from+1)+from;
		return i;
	}

	
	
}
}
 class Test{
	public static void main(String[] args) {
		int i=randomInt.randomInt(0,5);
		System.out.println(i);
	}
}