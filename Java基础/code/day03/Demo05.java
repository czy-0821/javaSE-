import java.util.Scanner;
/*
	����ʹ�ó����ҳ�����ˮ�ɻ�������ӡ��
	ˮ�ɻ�����
		1. ��һ����λ����
		2. ÿһ��λ�ϵ����������͵���ԭ������        
	
	������ 153   -->   27 + 125 + 1  == 153
	
	ѭ������������2. ������
	˼���� ����ÿ�д�ӡ����ˮ�ɻ���
			153  370
			371  407
*/
public class Demo05{
	public static void main(String[] args){
		// 1. ����һ������������ͳ������
		int count = 0;
		
		for(int i = 100; i < 1000; i++){
			// �õ���ǰ���ĸ�λ��ʮλ����λ
			int ge = i % 10 ;
			int shi = i / 10 % 10 ;
			int bai = i / 100 ;
			
			// ÿһ��λ�ϵ����������͵���ԭ������
			if((ge * ge * ge + shi * shi * shi + bai * bai * bai) == i){
				//������+1
				count++;
				if(count % 2 == 0){
					System.out.println(i);
				}else{
					System.out.print(i + "  ");
				}
			}
		}
		
		//��ӡcount���õ����յĸ���
		System.out.println("ˮ�ɻ���һ���У�" + count +"��!");
	}
}