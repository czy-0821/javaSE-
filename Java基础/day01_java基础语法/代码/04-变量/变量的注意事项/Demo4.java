public class Demo4 {
	
	/*
		4. 定义float和long变量的注意事项
		
				定义float类型变量的使用: 需要在数值的后面加入F的标识,F可以大写也可以小写.[一定要给F]
				
				定义long类型变量的使用 : 需要在数值的后面加入L的标识,L可以大写也可以小写.
						1. 当变量的值没有超出int范围时, L可加可不加
						2. 当变量的值超出int范围时, L必须加
						但是, 建议大写
	*/
	public static void main(String[] args){
		// 定义float类型变量的使用: 需要在数值的后面加入F的标识,F可以大写也可以小写.
		float a2 = 12.3F;
		
		// 定义long类型变量的使用 : 需要在数值的后面加入L的标识,L可以大写也可以小写.
		long b = 10000000000L;
		
		System.out.println(a2);
		System.out.println(b);
	}
}