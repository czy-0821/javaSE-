public class Demo1Switch {
	/*
		��ʽ��
			switch(���ʽ) {
				case ֵ1��
					�����1;
					break;
				case ֵ2��
					�����2;
					break;
					��
				default��	
					�����n+1;
					[break;]
			}

		1. ���ȼ�����ʽ��ֵ��
		2. ���κ�case�����ֵ���бȽϣ�����ж�Ӧ��ֵ���ͻ�ִ����Ӧ�����
			��ִ�еĹ����У�����break�ͻ������
		3. ������е�case�����ֵ�ͱ��ʽ��ֵ����ƥ��
			�ͻ�ִ��default���������壬Ȼ������������

		����: ����week������¼����ֵ, ���������Ӧ������
		����: int week = 1;		����һ
	*/
	public static void main(String[] args){
		double week = 5;
		
		switch(week){		//ֵ������ֻ֧��: byte,short,int,char,ö��,String�ַ���
			case 1 :
				System.out.println("����һ");
				break;
			case 2 :
				System.out.println("���ڶ�");
				break;
			case 3 :
				System.out.println("������");
				break;
			case 4 :
				System.out.println("������");
				break;
			case 5 :
				System.out.println("������");
				break;
			case 6 :
				System.out.println("������");
				break;
			case 7 :
				System.out.println("������");
				break;
			default:
				System.out.println("������������");
				break;
		}
	}
}