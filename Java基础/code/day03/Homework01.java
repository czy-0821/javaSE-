/*
	已知2019年是猪年，请在控制台输出从1949年到2088年中所有是猪年的年份
*/
public class Homework01{
	public static void main(String[] args){
		for(int year = 2019; year >= 1949; year -= 12){
			System.out.println(year + "年是猪年");
		}
		
		for(int year = 2019; year <= 2088; year += 12){
			if(year == 2019){
				continue;
			}
			System.out.println(year + "年是猪年");
		}
		
		System.out.println("-------------");
		
		for(int year = 1949; year <= 2088; year ++){
			if((2019 - year) % 12 == 0){
				System.out.println(year + "年是猪年");
			}
		}
		
	}
}