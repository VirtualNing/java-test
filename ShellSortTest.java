/**  
 * @Title: ShellSortTest.java
 * @Description: TODO(����)
 * @author author
 * @date 2020-10-16 07:21:51 
 */
package first;

import java.util.Arrays;

/**  
 * @ClassName: ShellSortTest
 * @Description: TODO(����)
 * @author author
 * @date 2020-10-16 07:21:51 
*/
public class ShellSortTest {
	// ����һ������,ʹ��ϣ�������㷨����������
	private int[] getArraySort(int[] array) {
		// ʹ��ϣ������
		// ������鳤��
		int len = array.length;
		// ����һ������ temp,���ڱ���Ҫ�Ƚϵ�������ֵ�е���һ����ֵ
		// ����һ������,���ڱ�ʾ��ǰ������ʱ�������м�Ԫ���±�
		int temp;
		int gap = len / 2;

		// ȷ��������Լ��������ȥ
		while (gap > 0) {

			// ѭ��,i = gap ��һ��Ҫ�Ƚϵ��±�Ӵ˴���ʼ����

			for (int i = gap; i < len; i++) {

				// ����˴�Ҫ�Ƚϵ���һ����ֵ
				temp = array[i];
				// ����һ������,����ǰһ��Ҫ�Ƚϵ��±�
				int perIndex = i - gap; // perIndex = i - gap ,(i + 1) - gap, (i+1+1) - gap

				// ѭ���Ƚ�,���� perIndex >= 0,��������ǰһ����ֵ���ں�һ��Ҫ�Ƚϵ���ֵ
				while (perIndex >= 0 && array[perIndex] > temp) {
					// �ͽ�ǰһ����ֵ��ֵ����һ����ֵ
					// perIndex + gap ��ʾǰһ��Ԫ���±� + ��ǰ�����м�Ԫ���±� = ��һ��Ԫ���±�
					array[perIndex + gap] = array[perIndex];
					// ������ǰѭ��
					perIndex -= gap;
				}
				// ����һ��Ԫ����ֵ��ֵ�����鿪ͷ��Ԫ��,�������� 0
				array[perIndex + gap] = temp;
			}
			// �����ʾ��ֵ�����Ƚ����
			// �ٽ�������
			gap /= 2;
		}
		return array;
	}

	public static void main(String[] args) {
		int[] array = new int[] { 85, 35, 23, 109, 32, 11, 88 };
		int[] result = new ShellSortTest().getArraySort(array);
		System.out.println(Arrays.toString(result));//
	}
}
