

public class HomeWork01{
	
	public static void main(String [] args){
		System.out.println("所有是猪年的年份:");

		for(int i=1949;i<2089;i++){
			if(i%12==3)System.out.println(i);
		}
	}
}