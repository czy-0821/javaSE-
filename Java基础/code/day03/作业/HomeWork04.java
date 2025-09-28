


public class HomeWork04{
	
	public static void main(String [] args){
		int count=0;
		
		for(int i=1;i<100;i++){ 
			int g = i%10;
			int s = i/10;
			if(g==9||s==9)continue;
			System.out.print(i+" ");
			count++;
			if(count%5==0)System.out.println();
			
		}
	}
}