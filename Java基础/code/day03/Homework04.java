/*
	1.打印1到100之内的整数，但数字中包含9的要跳过 9 19 91 92 个位是9或者十位是
		9的数要跳过 2.每行输出5个满足条件的数，之间用空格分隔 3.如：1 2 3 4 5 6 7 8 10 11 12 13
		14 15 16
*/
public class Homework04{
	public static void main(String[] args){
		int count = 0;
		
		for(int i = 1; i <= 100; i++){
			int ge = i % 10;
			int shi = i / 10 % 10;
			
			if(ge == 9 || shi == 9){
				continue;
			}
			
			count++;
			System.out.print(i + "  ");
			
			if(count % 5 == 0 ){
				System.out.println();		// 仅仅输出一个换行
			}
			
			
			
		}
		
	}
}