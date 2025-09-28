public class Demo3Operator {
	/*
		& 和 && 的区别 :
		
			& : 无论符号左边是true还是false, 右边都要继续执行
			
			&&【并且关系】 : 左侧为false,右侧不执行
							 如果符号左边为true, 右边要继续执行.
					
			||【或者关系】 : 左侧为true,右侧不执行
	*/
	public static void main(String[] args ){
		int x = 3;
		int y = 4;
		
		// false & true
		System.out.println(x++ > 3 && y-- < 5);	// false
		System.out.println("x=" + x);	// 4
		System.out.println("y=" + y);	// 4
	}
}