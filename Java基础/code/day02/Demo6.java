public class Demo6{
	public static void main(String [] args){
		int x = 3;
		int y = 4;
		
		boolean res = x++ > 4&& y++>3;
		System.out.println(res);
		System.out.println(x);
		System.out.println(y);
		
		
		int a =10;
		int b = 15;
		boolean res1 = a++>5 || b--<2;
		System.out.println(res1);
		System.out.println(a);
		System.out.println(b);
	}
}