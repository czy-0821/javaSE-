/*
	有一个输出语句System.out.print("@")，表示输出一个"@"，并且不换行。
	使用这个语句，在控制台打印出一个四行五列的长方形，效果如下：
	
	@@@@@
	@@@@@
	@@@@@
	@@@@@
*/

public class Homework03{
	public static void main(String[] args){
		
		//外层循环控制行数
		for(int i=1;i<=4;i++){
			
			//内层循环控制每行输出多少个@
			for(int j=1;j<=5;j++){
				System.out.print("@");
			}
			//输出换行
			System.out.println();
		}
		
	}
}