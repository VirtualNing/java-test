/**  
 * @Title: BisectionDemo.java
 * @Description: TODO(����)
 * @author author
 * @date 2020-09-10 09:46:27 
 */
package demo01;

import java.util.Arrays;

/**  
 * @ClassName: BisectionDemo
 * @Description: TODO(����)
 * @author author
 * @date 2020-09-10 09:46:27 
*/
public class BisectionDemo {
	public static void main (String[] args) {
		int[] Arr = {8,9,7,4,6,1}; //��������
		Arrays.parallelSort(Arr); //ʹ���� Java8 �������򷽷�
		System.out.println(Arrays.toString(Arr));
		System.out.println(BinarySearch(Arr,1));
	}
	
	//��װ���ַ�
	public static int BinarySearch (int[] array, int value) {
		int left = 0; // ���鿪ͷԪ���±�λ�ñ�ʶΪleft
		int right = array.length - 1; //����ĩβԪ���±�λ�ñ�ʶ right
		
		while (left <= right) { //ȷ������������ʶ�غ�֮ǰ�ҵ� value
			int mid  = (left + right) / 2; // �����м�Ԫ��λ�ñ�ʶΪ mid
			if (array[mid] == value) { //�������м�Ԫ�ص��� value
				return mid;//ֱ�ӷ��ص�ǰλ��
			} else if (array[mid] > value) { //�������м�λ��Ԫ�ش��� value
				right = mid - 1; //����ʶ��λ�÷ŵ��м�Ԫ��λ�����һλ
			} else { //�������м�λ��Ԫ��С�� value
				left = mid + 1;  //����ʶ��λ�÷ŵ��м�Ԫ�ص��ұ�һλ
			}
		}
		//û�ҵ� value
		return -1;
	}
}
