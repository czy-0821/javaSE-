import java.util.Random;

public class Demo1Random {
	/*
		Random : 产生随机数
		1. 导包	: import java.util.Random;
				    导包的动作必须出现在类定义的上面

		2. 创建对象 : Random r = new Random();
					上面这个格式里面，r 是变量名，可以变，其他的都不允许变

		3. 获取随机数 : int number = r.nextInt(10);	//获取数据的范围：[0,10) 包括0,不包括10   : 含头不含尾
					上面这个格式里面，number是变量名，可以变，数字10可以变。其他的都不允许变
		需求: 产生随机数1-10之间的
	*/
	public static void main(String[] args){
		// 2. 创建对象
		Random r = new Random();
		
		for(int i = 1; i <= 10; i++){
			// 3. 获取随机数
			int num = r.nextInt(10) + 1;		// [0,9] + 1 --> [1,10]
			System.out.println(num);
		}
		
		// 需求: 生成一个 [20,50]范围内的随机数
		int res = r.nextInt(31) + 20;			//[0,30] + 20 -->[20,50]
		//[33,66]
		r.nextInt(34) + 33;					//[0,33] + 33 -->[33,66]
		
		// 规律: 小括号里的值 =  (范围最大值 - 范围最小值) +1  ,   要加的值 =  范围最小值
		
		int num1 = r.nextInt(31) + 20;		// [0,30] + 20 --> [20, 50]    
		System.out.println("---------------------");
		// 需求: 生成5个 [35,67] 范围内的随机数
		for(int i=1;i<=5;i++){
			int num2 = r.nextInt(33) + 35;
			System.out.println(num2);
		}
		
	}
}