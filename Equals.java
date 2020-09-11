/**  
 * @Title: Equals.java
 * @Description: TODO(描述)
 * @author author
 * @date 2020-09-11 11:32:21 
 */
package demo01;

import java.util.Arrays;

/**  
 * @ClassName: Equals
 * @Description: TODO(描述)
 * @author author
 * @date 2020-09-11 11:32:21 
*/
public class Equals {

	/**  
	 * @Title: main
	 * @Description: TODO(描述)
	 * @param args
	 * @author author
	 * @date 2020-09-11 11:32:21 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] arr1 = { 99, 100, 98.54, 96.5, 72 };
		//double[] arr2 = { 99, 96.5, 98.5, 100 };
		//double[] arr3 = { 99, 100, 98.5, 96.5, 72 };
		double[] arr4 = { 99, 100, 98.5, 96.5,72 };
		System.out.println(getEquals(arr1,arr4));
		
	}
	//自定义数组比较方法
	public static boolean getEquals (double[] array1, double[] array2) {
		boolean exchange = false;
		if (array1.length != array2.length) {
			exchange = false;
			return exchange;
		} else {
			for (int i = 0; i < array2.length; i++) {
				if (Arrays.binarySearch(array1, array2[i]) == Arrays.binarySearch(array2, array1[i])
						&& Arrays.binarySearch(array1, array2[i]) != -1) {
					exchange = true;
				} else {
					exchange = false;
					return exchange;
				}
			}
		}
		return exchange;
		
	}

}
