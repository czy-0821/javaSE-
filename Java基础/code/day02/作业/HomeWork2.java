import java.util.Scanner;
public class HomeWork2{
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ﳵ�嵥:"+'\n'+
		"1. ���� ���ĺ����(�۸�: 30, ����: 2)"+'\n'+
		"2. �޺�����(�۸�: 20, ����: 1) "+'\n'+
		"--------------------------------------------");
		
		System.out.println("����������ѡ��:"+'\n'+
		"1. �������� "+'\n'+
		"2. ���㵥��");
		
		int opt = sc.nextInt();
		
		
		double sum=0;
		if(opt ==1){
			sum = 30*2+20;
		}else{
			System.out.println("��������Ҫ�������Ʒ  1. ���ĺ����   2. �޺�����");
			int goods = sc.nextInt();
			if(goods ==1)sum = 30*2;
			else sum = 20;
		}
		
		System.out.println("����ɹ�, ����֧��"+sum+"Ԫ");
		
	}
	
}