/*
	��֪2019�������꣬���ڿ���̨�����1949�굽2088������������������
*/
public class Homework01{
	public static void main(String[] args){
		for(int year = 2019; year >= 1949; year -= 12){
			System.out.println(year + "��������");
		}
		
		for(int year = 2019; year <= 2088; year += 12){
			if(year == 2019){
				continue;
			}
			System.out.println(year + "��������");
		}
		
		System.out.println("-------------");
		
		for(int year = 1949; year <= 2088; year ++){
			if((2019 - year) % 12 == 0){
				System.out.println(year + "��������");
			}
		}
		
	}
}