
import java.util.Scanner;
import java.util.Random;
public class HomeWork04{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int[] arr = new int[6];
		int sum = 0;
		for(int i=0;i<6;i++){
			System.out.println("请输入第"+(i+1)+"个数字:");
			arr[i] = sc.nextInt();
			if(arr[i]%2!=0)sum+=arr[i];
		}
		System.out.println("数组中奇数和为:"+sum);
		System.out.print("[");
		for(int i=0;i<arr.length;i++){
			if(i==arr.length-1){System.out.print(arr[i]+"]");break;}
			System.out.print(arr[i]+",");
		}
		
	}
}