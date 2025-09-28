import java.util.Scanner;
import java.util.Random;
/*
	综合练习4： 猜数字小游戏
	设计一个程序，程序先内部生成一个[1,100]的随机数，实现如下效果：
	请输入你要猜的数：
	50
	50 猜大了
	25
	25 猜小了
	40
	40 猜大了
	35 
	恭喜你，猜中了
*/
public class Test4{
	public static void main(String[] args){
		//1. 生成一个[1,100]随机数
		Random r = new Random();
		int randomNumber = r.nextInt(100) + 1;
		
		//2. 键盘录入用户猜的数
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你要猜的数：");
		while(true){
			int guessNumber = sc.nextInt();
			
			//3. 数字比较
			if(guessNumber > randomNumber){
				System.out.println(guessNumber + " 猜大了");
			}else if(guessNumber < randomNumber){
				System.out.println(guessNumber + " 猜小了");
			}else{
				System.out.println("恭喜你，猜中了！");
				break;
			}
		}
	}
}