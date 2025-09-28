public class Demo5{
	public static void main(String [] args){
		byte a = 126;
		int b = 34;
	
		b+=a;
		a+=b;
		System.out.println(a);
		System.out.println(b);
	}
}