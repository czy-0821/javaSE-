
import java.util.Scanner;
import java.util.Random;
public class HomeWork03{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("请输入参与抽奖人数:");
		int number = sc.nextInt();
		String[] arr = new String[number];
		String[] list = {"劳斯莱斯5元代金券","iPhone13 pro Max手机壳","Huawei P50 钢化膜",
		"Air Jordan 1 篮球鞋元年纪念款鞋盒","北京昌平区沙河县一日游"};
		
		System.out.println("请继续输入参与抽奖人员姓名:");
		for(int i=0;i<arr.length;i++){
			System.out.println("第"+(i+1)+"个姓名:");
			arr[i] = sc.next();
			
		}
		
		int n = r.nextInt(number)+1;
		int m = r.nextInt(5)+1;
		
		System.out.println("恭喜:"+arr[n]+"抽到了大奖"+list[m]+"!!!");
		
	}
}