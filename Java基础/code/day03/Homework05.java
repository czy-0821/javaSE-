/*
	键盘录入一个数字, 请计算1~该数字之间, 所有的奇数和, 并将结果打印到控制台上. 例如: 录入:
	10, 则打印: 1~10之间的奇数和为 25 录入: -10, 则打印: 您录入的数字无效, 请重新录入. 注意: 如
	果用户录入错误数字, 则一直录入. 直到用户录入正确的数字, 打印完结果后, 程序结束
*/
import java.util.Scanner;

public class Homework05{
	public static void main(String[] args){
		// 1. 拿到符合条件的数字：num
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数字：大于1");
		int num;
		while(true){
			num = sc.nextInt();
			if(num < 1){
				System.out.println("您录入的数字无效, 请重新录入");
			}else{
				break;
			}
		}
		
		// 2. 计算1~num之间, 所有的奇数和
		int sum = 0;
		for(int i = 1; i <= num ; i++){
			if(i % 2 == 1){
				sum += i;
			}
		}
		System.out.println("1~" + num + "之间的奇数和为：" + sum);
		
		
	}
}