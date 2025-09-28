public class Demo7For {
	/*
		思考: 已知2021是牛年,求1949年至今所有的牛年年份,打印出来.
	*/
	public static void main(String[] args){
		
		for(int year = 2021; year >= 1949; year-=12){
			System.out.println(year+"年是牛年");
		}
		
	}
}