public class Demo06{
	
	/*
		自增自减运算符
			单独使用：在前在后都一样，无所谓。
			
			参与操作使用：
				++在前： 先加后用
				++在后： 先用后加
	*/
	public static void main(String[] args){
		//单独使用
		int a = 10;
		a++;
		++a;
		System.out.println(a);
		a--;
		System.out.println(a);
		
		//参与操作使用
		int x = 10;
		int y = ++x ;          
		System.out.println(x);
		System.out.println(y);
		
		// 实战：笔试题
		int num1 = 15;
		int num2 = num1++ + ++num1 + num1-- - --num1 - num1++;	// 	 15 + 17 + 17 - 15 - 15;
		System.out.println(num1);		// 16
		System.out.println(num2);		// 19
		
	}
	
}