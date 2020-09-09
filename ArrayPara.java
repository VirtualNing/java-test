/**  
 * @Title: ArrayPara.java
 * @Description: TODO(����)
 * @author author
 * @date 2020-09-09 02:50:06 
 */
package demo01;

import java.util.Arrays;

/**  
 * @ClassName: ArrayPara
 * @Description: TODO(����������Ϊ�������ݸ�������ʹ��ʵ��)
 * @author author
 * @date 2020-09-09 02:50:06 
*/
public class ArrayPara {
	public static void main (String[] args) {
		int[] arr = {31,5,8,72,1,6,21,9,80,10,56,18};
		System.out.println(Arrays.toString(arr));
		//System.out.println(Arrays.toString(getSort(arr)));
		//System.out.println("�������ֵΪ " + getArrMax(arr));
		//System.out.println("������СֵΪ " + getArrMin(arr));
		System.out.println("������СֵΪ " + getArrMaxOrMin(arr,"min"));
		System.out.println("�������ֵΪ " + getArrMaxOrMin(arr,"max"));
	}
	
	public static int[] getSort (int[] array) {
		//����������
		int temp;
		boolean exchange;
		for (int i = 0; i < array.length; i++) {
			exchange = false;
			for (int j = array.length - 1; j >= 1; j--) {
				if (array[j] < array[j - 1] ) {
					temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
					exchange = true; //����λ�÷����ı�ʱ
				}
			}
			if (!exchange)
				break;
		}
		return array;
	}
	
	public static int getArrMax (int[] array) {
		//��������е����ֵ
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > temp) {
				temp = array[i];
			}
		}
		return temp;
	}
	
	public static int getArrMin (int[] array) {
		//��������е���Сֵ
		int temp = 0; //����������Сֵ���±�/����
		for (int i = 1; i < array.length; i++) {
			if (array[i] < array[temp]) {
				temp = i;	
			}
		}
		return array[temp];
	}
	
	public static int getArrMaxOrMin (int[] array, String b) {
		//��������е����ֵ������Сֵ
		if (b == "min") {
			return getArrMin(array);
		} else if (b == "max"){
			return getArrMax(array);
		} else {
			return 0;
		}
	}

}
