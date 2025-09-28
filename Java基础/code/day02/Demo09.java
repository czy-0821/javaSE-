public class Demo09{
	
	/*
		逻辑运算符 
	*/
	public static void main(String[] args){
		// & : 并且关系
		System.out.println(true & false);		// false
		System.out.println(true & true);		// true
		
		// | : 或者关系
		System.out.println(true | false);		// true
		System.out.println(true | true);		// true
		System.out.println(false | false);		// false
		
		
		System.out.println(true ^ false);		// true
		System.out.println(true ^ true);		// false
		System.out.println(false ^ false);		// false
		
		// ! : 取反
		System.out.println(!false);				// true
		System.out.println(!!false);			// false
	}
	
}