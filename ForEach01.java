public class ForEach01 
{
	public static void main(String[] args) 
	{
		System.out.println("----------------��������--------");
		Zsjx z1 = new Zsjx("*",6);
		System.out.println("----------------��������--------");
		Fsjx f1 = new Fsjx("^",6);
		System.out.println("----------------���α�ʯ--------");
		Lx l1 = new Lx("*",6);
	}
}

class Zsjx
{
	//��ӡ����������
	Zsjx(String start, int num) {
		this.setStart(start,num);
	}
	public void setStart(String start, int num) {
		for (int i = 1; i <= num; i++)
		{
			for (int j = 1; j <= (num - i);j++)
			{
				//��ӡ�ո�
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i) - 1; k++)
			{
				//��ӡ�ַ�
				System.out.print(start);
			}
			//ѭ��һ�ξͻ���
			System.out.println();
		}
	}
}

class Fsjx
{
	//��ӡ��������
	Fsjx(String start, int num) {
		this.setStarts(start,num);
	}
	public void setStarts(String start, int num) {
		//��ӡ����
		for (int ii = num; ii >= 1; ii--)
		{
			//��ӡ�ո�
			for (int jj = 1; jj <= (num - ii); jj++)
			{
				System.out.print(" ");
			}
			//��ӡ��ĸ
			for (int kk = 1; kk <= (2 * ii) - 1; kk++)
			{
				System.out.print(start);
			}
			System.out.println();
		}
	}
}

class Lx
{
	//��ӡ����
	Lx(String start, int num) {
		this.setStart(start,num);
		this.setStarts(start,num);
	}
	public void setStart(String start, int num) {
		//�����ܵ�ѭ������
		for (int i = 1; i <= num; i++)
		{
			//���ƴ�ӡ�Ŀո���
			for (int j = 1; j <= (num - i); j++)
			{
				System.out.print(" ");
			}
			//����Ҫ��ӡ���ַ���
			for (int k = 0; k < (2 * i) - 1; k++)
			{
				System.out.print(start);
			}
			System.out.println(); //ѭ��һ�ξͻ���
		}
	}
	public void setStarts(String start, int num) {
		for (int i = num; i > 1; i--) //ѭ�� num - 1 ��
		{
			for (int j = 0; j <= (num - i); j++) //��һ���� num - i ���ո�
			{
				System.out.print(" ");
			}
			for (int k = 1; k < 2 * (i - 1); k++) //ÿѭ��һ�ζ���ȥ 2 ���ո�
			{
				System.out.print(start);
			}
			System.out.println();
		}
	}
}