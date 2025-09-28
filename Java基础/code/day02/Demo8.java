import java.util.Scanner;
public class Demo8{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年龄:");
		int age = sc.nextInt();
		
		if(age>=18&&age<=75)System.out.println("可以上网！！");
		else System.out.println("回家吧");
		
		System.out.println("end.....");
		
	}
}