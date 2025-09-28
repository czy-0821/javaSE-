


public class HomeWork02{
	
	public static void main(String [] args){
		System.out.println("从1988年到2088年的闰年有:");
		for(int i = 1988;i<2089;i++){
			if((i%4==0&&i%100!=0)||i%400==0)System.out.println(i);
		}
	}
}