import java.util.Scanner;
public class Demo7{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数:");
		int a = sc.nextInt();
		System.out.println("请输入第二个数:");
		int b = sc.nextInt();
		
		System.out.println("更大的数值是:"+(a>=b?a:b));
	}
}