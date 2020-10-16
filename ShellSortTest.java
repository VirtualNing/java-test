/**  
 * @Title: ShellSortTest.java
 * @Description: TODO(描述)
 * @author author
 * @date 2020-10-16 07:21:51 
 */
package first;

import java.util.Arrays;

/**  
 * @ClassName: ShellSortTest
 * @Description: TODO(描述)
 * @author author
 * @date 2020-10-16 07:21:51 
*/
public class ShellSortTest {
	// 定义一个方法,使用希尔排序算法给数组排序
	private int[] getArraySort(int[] array) {
		// 使用希尔排序
		// 获得数组长度
		int len = array.length;
		// 定义一个变量 temp,用于保存要比较的两个数值中的下一个数值
		// 定义一个变量,用于表示当前数组拆分时的数组中间元素下标
		int temp;
		int gap = len / 2;

		// 确保数组可以继续拆分下去
		while (gap > 0) {

			// 循环,i = gap 后一个要比较的下标从此处开始往后

			for (int i = gap; i < len; i++) {

				// 保存此次要比较的下一个数值
				temp = array[i];
				// 定义一个变量,保存前一个要比较的下标
				int perIndex = i - gap; // perIndex = i - gap ,(i + 1) - gap, (i+1+1) - gap

				// 循环比较,假如 perIndex >= 0,并且数组前一个数值大于后一个要比较的数值
				while (perIndex >= 0 && array[perIndex] > temp) {
					// 就将前一个数值赋值给后一个数值
					// perIndex + gap 表示前一个元素下标 + 当前数组中间元素下标 = 后一个元素下标
					array[perIndex + gap] = array[perIndex];
					// 跳出当前循环
					perIndex -= gap;
				}
				// 将后一个元素数值赋值给数组开头的元素,此意类推 0
				array[perIndex + gap] = temp;
			}
			// 上面表示拆分的数组比较完毕
			// 再将数组拆分
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
