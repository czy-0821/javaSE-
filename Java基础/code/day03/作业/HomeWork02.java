


public class HomeWork02{
	
	public static void main(String [] args){
		System.out.println("��1988�굽2088���������:");
		for(int i = 1988;i<2089;i++){
			if((i%4==0&&i%100!=0)||i%400==0)System.out.println(i);
		}
	}
}