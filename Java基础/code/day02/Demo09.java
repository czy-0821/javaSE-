public class Demo09{
	
	/*
		�߼������ 
	*/
	public static void main(String[] args){
		// & : ���ҹ�ϵ
		System.out.println(true & false);		// false
		System.out.println(true & true);		// true
		
		// | : ���߹�ϵ
		System.out.println(true | false);		// true
		System.out.println(true | true);		// true
		System.out.println(false | false);		// false
		
		
		System.out.println(true ^ false);		// true
		System.out.println(true ^ true);		// false
		System.out.println(false ^ false);		// false
		
		// ! : ȡ��
		System.out.println(!false);				// true
		System.out.println(!!false);			// false
	}
	
}