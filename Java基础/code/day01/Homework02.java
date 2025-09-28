import java.util.Scanner;

public class Homework02{
	public static void main(String[] args){
		//创建Scanner对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入您注册的用户名：");
		String username = sc.next();
		System.out.println("请输入您的密码：");
		String password = sc.next();
		System.out.println("请输入您的手机号：");
		String tel = sc.next();
		System.out.println("请输入您的邮箱：");
		String email = sc.next();
		System.out.println("已发送验证码至您的手机：");
		int code = sc.nextInt();
		System.out.println("注册成功!");
		System.out.println(username);
		System.out.println(password);
		System.out.println(tel);
		System.out.println(email);
		System.out.println(code);
		
		
		
	}
}