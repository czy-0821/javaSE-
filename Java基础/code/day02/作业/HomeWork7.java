import java.util.Scanner;
public class HomeWork7{
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		lo:while(true){
			System.out.println("请输入成绩(输入101结束进程):");
			int num = sc.nextInt();
			if(num<80&&num>=0)System.out.println("挨顿揍, 这座城市又多了一个伤心的人~");
			else if(num<90)System.out.println("变形金刚一个");
			else if(num<95)System.out.println("游乐场一次");
			else if(num<=100)System.out.println("自行车一辆");
			else break lo;
		}
		
	}
	
}