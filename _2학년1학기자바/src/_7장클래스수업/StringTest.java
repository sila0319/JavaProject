package _7��Ŭ��������;

public class StringTest {
	public static void main(String[] args) {
		String proverb = "A barking dog";		//new ������ ����
		String s1, s2, s3 ,s4;					//���� �����μ� �޼ҵ忡�� ��ȯ�� �������� �޴´�.
		String number = "123";
		System.out.println("���ڿ��� ���� = " + proverb.length());
		
		s1 = proverb.concat(" naver Bites!");	//���ڿ�����
		s2 = proverb.replace('b', 'B');			//���� ��ȯ
		s3 = proverb.substring(1, 5);			//�κ� ���ڿ� ����
		s4 = proverb.toUpperCase();				//�빮�ڷ� ��ȯ
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println();
		
		System.out.println(proverb.isEmpty());//proverb�� ���̰� 0�̸� true 
		System.out.println(proverb.compareTo(s1));//������ ������ ���ڿ��� ���Ѵ�. �ƿ������� -1, ������ 0, �ڿ������� 1�� ��ȯ�ȴ�.
		System.out.println(proverb.equalsIgnoreCase(s2));//��ҹ��ڸ� �����ϰ� ���Ѵ�.
		System.out.println(proverb.toLowerCase());//proverb�� ���� �ҹ��ڷ� �ٲ۴�.
		System.out.println(proverb.toUpperCase());//proverb�� ���� �빮�ڷ� �ٲ۴�.
		System.out.println(Integer.parseInt(number));//String�� ���ڷ� �ٲ��ش�.
	}
}
