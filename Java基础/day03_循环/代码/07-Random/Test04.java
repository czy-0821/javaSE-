/*
红茶妹妹有21元钱，她攒了几天钱之后自己的钱比原来的两倍还多三块。
绿茶妹妹有24元钱，她攒了几天钱之后自己的钱正好是原来的两倍。
那么红茶和绿茶现在的钱一样多，请问对么？请编写程序进行判断。
*/
public class Test04 {
	
	public static void main(String[] args){
		//1. 分别计算红茶妹妹和绿茶妹妹现在有多少钱
		int red = 21 * 2 + 3;
		int green = 24 * 2;
		
		//2. 比较红茶和绿茶现在的钱是否一样多
		System.out.println("红茶现在的钱:" + red);
		System.out.println("绿茶现在的钱:" + green);
		
		if(red == green){
			System.out.println("一样多");
		}else{
			System.out.println("不一样");
		}
		
	}
}