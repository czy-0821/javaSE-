import java.util.Scanner;

public class Test2{
	public static void main(String[] args){
		int hgqPrice = 30;
		int hgqCount = 2;
		
		int lhgPrice = 20;
		int lhgCount = 1;
		
		//1. չʾ���ﳵ�嵥
		System.out.println("���ﳵ�嵥��");
		System.out.println("1. ���ĺ����(�۸�"+hgqPrice+"������"+hgqCount+")");
		System.out.println("2. �޺�����(�۸�"+lhgPrice+"������"+lhgCount+")");
		System.out.println("-------------------------------------");
		
		//2. �õ��û������ѡ��
		Scanner sc = new Scanner(System.in);
		System.out.println("����������ѡ��");
		System.out.println("1. ��������");
		System.out.println("2. ���㵥��");
		int choice = sc.nextInt();
		
		if(choice == 1){
			//�������У������ﳵ��������Ʒ�������
			int money = hgqPrice * hgqCount + lhgPrice * lhgCount;
			System.out.println("����ɹ�������֧����"+ money + "Ԫ");
		}else if(choice == 2){
			//���㵥��
			System.out.println("��������Ҫ�������Ʒ��1. ���ĺ����    2. �޺�����");
			int choice1 = sc.nextInt();	
			if(choice1 == 1){
				System.out.println("����ɹ�������֧����"+ (hgqPrice * hgqCount) + "Ԫ");	
			}else if(choice1 == 2){
				System.out.println("����ɹ�������֧����"+ (lhgPrice * lhgCount) + "Ԫ");	
			}else{
				System.out.println("��������");
			}
		}else{
			System.out.println("��������");
		}
	
	}
	
}