public class Demo4Operator {
	/*
		参与操作:
		
			++在前: 先对该变量做自增(++)或者自减(--)，然后再拿变量参与操作。
					先加后用
		
			++在后:	先将该变量原本的值，取出来参与操作，随后再进行自增(++)，自减(--)。
					先用后加
	*/
	public static void main(String[] args){
		// ++在前: 先对该变量做自增(++)或者自减(--)，然后再拿变量参与操作。
		int a = 10;
		int b = ++a;
		
		System.out.println(a);		// 11
		System.out.println(b);		// 11
		
		
		// ++在后:	先将该变量原本的值，取出来参与操作，随后再进行自增(++)，自减(--)。
		int aa = 10;
				//bb = 10
		int bb = aa++;	// aa = 11
		
		System.out.println(aa);	// 11
		System.out.println(bb); // 10
		
		int num = 123;
		System.out.println(num++);	// 123
		System.out.println(num);	// 124	
		
	
		//作业
		int i = 10;
		//  j = 10 + 12   - 12  + 10  + 10 +  12;
		int j = i++ + ++i - i-- + --i + i++ + ++i;
		
	
		System.out.println(i);		//12
		System.out.println(j);		//42
		
		int x = 5;
		//int y = 4 + 5 + 5 + 6;
		int y = --x + ++x + x++ +x--;
		System.out.println(x);
		System.out.println(y);
		
		
		
		short s1 = 10;
		//s1 = (short)(s1 + 20);
		s1 += 20;
		System.out.println(s1);
		
		
	}
}