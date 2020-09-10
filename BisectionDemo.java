/**  
 * @Title: BisectionDemo.java
 * @Description: TODO(描述)
 * @author author
 * @date 2020-09-10 09:46:27 
 */
package demo01;

import java.util.Arrays;

/**  
 * @ClassName: BisectionDemo
 * @Description: TODO(描述)
 * @author author
 * @date 2020-09-10 09:46:27 
*/
public class BisectionDemo {
	public static void main (String[] args) {
		int[] Arr = {8,9,7,4,6,1}; //无序数组
		Arrays.parallelSort(Arr); //使用了 Java8 新增排序方法
		System.out.println(Arrays.toString(Arr));
		System.out.println(BinarySearch(Arr,1));
	}
	
	//封装二分法
	public static int BinarySearch (int[] array, int value) {
		int left = 0; // 数组开头元素下标位置标识为left
		int right = array.length - 1; //数组末尾元素下标位置标识 right
		
		while (left <= right) { //确保当当两个标识重合之前找到 value
			int mid  = (left + right) / 2; // 数组中间元素位置标识为 mid
			if (array[mid] == value) { //当数组中间元素等于 value
				return mid;//直接返回当前位置
			} else if (array[mid] > value) { //当数组中间位置元素大于 value
				right = mid - 1; //将标识符位置放到中间元素位置左边一位
			} else { //当数组中间位置元素小于 value
				left = mid + 1;  //将标识符位置放到中间元素的右边一位
			}
		}
		//没找到 value
		return -1;
	}
}
