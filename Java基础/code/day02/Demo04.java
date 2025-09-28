public class Demo04{
	
	/*
		算术运算符
			字符的 + 操作
	*/
	public static void main(String[] args){
	
		char ch = 'a';
		System.out.println(ch + 1);
		
		
		// 加密通话
		char ch1 = '有';
		char ch2 = '内';
		char ch3 = '鬼';
		 
		System.out.println(ch1 + 666);		// + 法就是加密算法   666 是秘钥
		System.out.println(ch2 + 666);
		System.out.println(ch3 + 666);
		
		System.out.println((char)(27043 - 666));
		System.out.println((char)(21535 - 666));
		System.out.println((char)(40406 - 666));
	}
	
}