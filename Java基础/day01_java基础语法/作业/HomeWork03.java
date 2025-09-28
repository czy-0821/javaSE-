
import java.util.Scanner;
public class HomeWork03{
	public static void main(String[] args){
		
		/*
		请简单模拟某网站的注册系统, 从键盘采集用户的信息 (用户名, 密码, 手机号, 邮箱, 验
		证码)
		*/

		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入您注册的用户名:");
		String name=sc.next();
		
		System.out.println("请输入您的密码:");
		String password = sc.next();
		
		System.out.println("请输入您的手机号:");
		int phoneNum = sc.nextInt();
		
		System.out.println("请输入您的邮箱:");
		String emila = sc.next();
		
		System.out.println("已发送验证码至您的手机: ");
		System.out.println(788962 );
		System.out.println("注册成功! ");
		System.out.println(name );
		System.out.println(password );
		System.out.println(phoneNum );
		System.out.println(emila);
	}
}