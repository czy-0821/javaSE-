
/*����ĳĳ�༶������һ������, �ɼ��ֱ��� 10 20 30 40 50 60 , �뽫���ݴ�������, ����
����༶ƽ����*/


public class HomeWork01{
	public static void main(String[] args){
		int[] arr = {10,20,30,40,50,60};
		int sum=0;
		for(int i = 0;i<arr.length;i++){
			sum+=arr[i];
		}
		System.out.println("�༶ƽ����Ϊ:"+(sum/arr.length));
		
	}
}