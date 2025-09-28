import java.util.Scanner;
/*
	需求，使用程序找出所有水仙花数并打印。
	水仙花数：
		1. 是一个三位数。
		2. 每一个位上的数的立方和等于原数本身。        
	
	举例： 153   -->   27 + 125 + 1  == 153
	
	循环常见操作：2. 计数器
	思考： 控制每行打印两个水仙花数
			153  370
			371  407
*/
public class Demo05{
	public static void main(String[] args){
		// 1. 定义一个变量，用来统计数量
		int count = 0;
		
		for(int i = 100; i < 1000; i++){
			// 拿到当前数的个位，十位，百位
			int ge = i % 10 ;
			int shi = i / 10 % 10 ;
			int bai = i / 100 ;
			
			// 每一个位上的数的立方和等于原数本身
			if((ge * ge * ge + shi * shi * shi + bai * bai * bai) == i){
				//计数器+1
				count++;
				if(count % 2 == 0){
					System.out.println(i);
				}else{
					System.out.print(i + "  ");
				}
			}
		}
		
		//打印count，得到最终的个数
		System.out.println("水仙花数一共有：" + count +"个!");
	}
}