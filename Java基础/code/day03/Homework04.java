/*
	1.��ӡ1��100֮�ڵ��������������а���9��Ҫ���� 9 19 91 92 ��λ��9����ʮλ��
		9����Ҫ���� 2.ÿ�����5����������������֮���ÿո�ָ� 3.�磺1 2 3 4 5 6 7 8 10 11 12 13
		14 15 16
*/
public class Homework04{
	public static void main(String[] args){
		int count = 0;
		
		for(int i = 1; i <= 100; i++){
			int ge = i % 10;
			int shi = i / 10 % 10;
			
			if(ge == 9 || shi == 9){
				continue;
			}
			
			count++;
			System.out.print(i + "  ");
			
			if(count % 5 == 0 ){
				System.out.println();		// �������һ������
			}
			
			
			
		}
		
	}
}