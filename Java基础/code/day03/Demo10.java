//1. 导包
import java.util.Random;
/*
	Random随机数
*/
public class Demo10{
	public static void main(String[] args){
		//2. 创建对象
		Random r = new Random();
		
		//3. 生成随机数
		int num = r.nextInt(10) + 0;		// [0,10)
		
		System.out.println(num);
		
		//如何生成指定范围的随机数？
		// 需求： 生成一个[22,55]之间的随机数
		/*
			小括号里的数 = 范围最大值 - 范围最小值 + 1;
			小括号外要加的数 = 范围最小值;
		*/
		int num1 = r.nextInt(34) + 22;		// [22, 55]
		System.out.println(num1);
		
	}
}