import java.util.Scanner;
public class HomeWork1{
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入用户名:");
		String  name = sc.next();
		System.out.println("请输入邮箱:");
		String  email = sc.next();
		System.out.println("尊敬的"+name+"用户您好，我们已向您的初始密码发送至"+email+"邮箱, 请注意查收!");
		
	}
	
}