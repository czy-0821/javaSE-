/*
	2. 
	编号【318】
	在中国历法中有十二生肖年份，2019年是己亥猪年，请在控制台输出从1949年（包含）到2019年（包含）中所有是猪年的年份。

*/
public class Homework02{
	public static void main(String[] args){
		for(int year = 2019; year >= 1949; year-=12){
			
			//if((2019 - year) % 12 == 0 ){
				//筛选出猪年
				System.out.println(year+"年是猪年");
			//}
			
			
		}
	}
}