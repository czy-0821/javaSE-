
import java.util.Scanner;
public class HomeWork02{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("������༶����:");
		int number = sc.nextInt();
		int[] arr = new int[number];
		int sum=0,max=0,min=100,count=0;
		double ave=0;
		System.out.println("���������ѧ���ɼ�:");
		for(int i=0;i<arr.length;i++){
			System.out.println("��"+(i+1)+"��ѧ���ɼ�Ϊ:");
			arr[i] = sc.nextInt();
			sum+=arr[i];
			if(arr[i]>=max)max=arr[i];
			if(arr[i]<=min)min = arr[i];
			if(arr[i]<60)count++;
		}
		ave = sum/arr.length;
		System.out.println("�༶�ܳɼ�Ϊ:"+sum+'\n'+"�༶ƽ����Ϊ:"+ave+'\n'
		+"��߷�Ϊ:"+max+'\n'+"��ͷ�Ϊ:"+min+'\n'+"����������Ϊ:"+count);
		
	}
}