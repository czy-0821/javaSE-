import java.util.Scanner;
/*
	循环练习
*/
public class Test2{
	public static void main(String[] args){
		
		for(int year = 1988; year <= 2088; year++){
			if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
				System.out.println(year+"年是闰年...");
			}
		}
	}
}