/**  
 * @Title: CopyOf.java
 * @Description: TODO(����)
 * @author author
 * @date 2020-09-11 09:59:03 
 */
package demo01;

import java.util.Arrays;


/**  
 * @ClassName: CopyOf
 * @Description: TODO(����)
 * @author author
 * @date 2020-09-11 09:59:03 
*/
public class CopyOf {

	/**  
	 * @Title: main
	 * @Description: TODO(����)
	 * @param args
	 * @author author
	 * @date 2020-09-11 09:59:03 
	 */
	public static void main(String[] args) {
		// ��������
		//int[] scores = {57,81,68,75,91};
		String[] str = {"da","rtr","6665","gf","gfd5","343s"};
		//char[] scores1 = {'3','a','g','8'};
		Person p1 = new Person();
		//int[] result1 = p1.getCopyArray(scores,8);
		//char[] result2 = p1.getCopyArray(scores1,5);
		String[] result3 = p1.getCopyArray(str,7);
		System.out.println(Arrays.toString(result3));
	}

}

class Person {
	Person () {};

	// �Զ��帴�����鷽��---int
	public int[] getCopyArray(int[] array, int len) {
		// ����һ�������飬����Ϊ len
		int[] arr = new int[len];
		//����ǰ���ж� ���鳤��
		if (len > array.length) {
			for (int i = 0; i < array.length; i++) {
				arr[i] = array[i]; //��array �е�
			}
		} else {
			for (int i = 0; i < len; i++) {
				arr[i] = array[i]; //��array �е�
			}
		}
		return arr;
	}
	// �Զ��帴�����鷽��---char
	public char[] getCopyArray(char[] array, int len) {
		char[] arr = new char[len];
		if (len > array.length) {
			for (int i = 0; i < array.length; i++) {
				arr[i] = array[i];
			}
		} else {
			for (int i = 0; i < len; i++) {
				arr[i] = array[i]; 
			}
		}
		return arr;
	}
	// �Զ��帴�����鷽��---String
		public String[] getCopyArray(String[] array, int len) {
			String[] arr = new String[len];
			if (len > array.length) {
				for (int i = 0; i < array.length; i++) {
					arr[i] = array[i];
				}
			} else {
				for (int i = 0; i < len; i++) {
					arr[i] = array[i]; 
				}
			}
			return arr;
		}
}
