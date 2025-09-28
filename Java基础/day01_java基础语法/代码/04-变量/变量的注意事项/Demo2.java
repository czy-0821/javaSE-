public class Demo2 {
	
	/*
		2. 一条语句可以定义多个变量，但需要使用逗号进行分割
		一条语句：java当中使用分号作为一条语句的结束.
	*/
	public static void main(String[] args){
		// 一条语句可以定义多个变量，但需要使用逗号进行分割
		// 黄老板发工资了, 工资发了很多,买了三个猫笼子,还买了三只猫. 分别往每个笼子里塞了一只猫
		//int a = 20, b = 10,c = 30;
		// 黄老板发工资了, 工资发的一般,买了三个猫笼子,只买了一只猫. 塞给了a笼子里. b,c两笼子空着.
		int a, b = 10,c;
		a = 15;
		System.out.println(a);		//变量没有赋值，不能使用！
		System.out.println(b);
		//System.out.println(c);
		
		/*
			float类型的变量在进行赋值的时候,必须要给小数值后面加一个F
			long类型的变量在进行赋值的时候,建议在整数值后面加一个L.
				当整数值没有超过int范围(-21亿~21亿),L其实是可加可不加
				当整数值超过int范围(-21亿~21亿),L必须加
		*/
		float d = 3.14F;
		System.out.println(d);
		
		long e = 10000000000L;
		System.out.println(e);
		
	}
}