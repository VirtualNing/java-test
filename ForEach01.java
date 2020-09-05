public class ForEach01 
{
	public static void main(String[] args) 
	{
		System.out.println("----------------正金字塔--------");
		Zsjx z1 = new Zsjx("*",6);
		System.out.println("----------------倒金字塔--------");
		Fsjx f1 = new Fsjx("^",6);
		System.out.println("----------------菱形宝石--------");
		Lx l1 = new Lx("*",6);
	}
}

class Zsjx
{
	//打印输正金字塔
	Zsjx(String start, int num) {
		this.setStart(start,num);
	}
	public void setStart(String start, int num) {
		for (int i = 1; i <= num; i++)
		{
			for (int j = 1; j <= (num - i);j++)
			{
				//打印空格
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i) - 1; k++)
			{
				//打印字符
				System.out.print(start);
			}
			//循环一次就换行
			System.out.println();
		}
	}
}

class Fsjx
{
	//打印倒金字塔
	Fsjx(String start, int num) {
		this.setStarts(start,num);
	}
	public void setStarts(String start, int num) {
		//打印行数
		for (int ii = num; ii >= 1; ii--)
		{
			//打印空格
			for (int jj = 1; jj <= (num - ii); jj++)
			{
				System.out.print(" ");
			}
			//打印字母
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
	//打印菱形
	Lx(String start, int num) {
		this.setStart(start,num);
		this.setStarts(start,num);
	}
	public void setStart(String start, int num) {
		//控制总的循环次数
		for (int i = 1; i <= num; i++)
		{
			//控制打印的空格数
			for (int j = 1; j <= (num - i); j++)
			{
				System.out.print(" ");
			}
			//控制要打印的字符串
			for (int k = 0; k < (2 * i) - 1; k++)
			{
				System.out.print(start);
			}
			System.out.println(); //循环一次就换行
		}
	}
	public void setStarts(String start, int num) {
		for (int i = num; i > 1; i--) //循环 num - 1 次
		{
			for (int j = 0; j <= (num - i); j++) //第一次有 num - i 个空格
			{
				System.out.print(" ");
			}
			for (int k = 1; k < 2 * (i - 1); k++) //每循环一次都减去 2 个空格
			{
				System.out.print(start);
			}
			System.out.println();
		}
	}
}