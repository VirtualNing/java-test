/**  
 * @Title: ArrayPara.java
 * @Description: TODO(描述)
 * @author author
 * @date 2020-09-09 02:50:06 
 */
package demo01;

import java.util.Arrays;

/**  
 * @ClassName: ArrayPara
 * @Description: TODO(这是数组作为参数传递给方法的使用实例)
 * @author author
 * @date 2020-09-09 02:50:06 
*/
public class ArrayPara {
	public static void main (String[] args) {
		int[] arr = {31,5,8,72,1,6,21,9,80,10,56,18};
		System.out.println(Arrays.toString(arr));
		//System.out.println(Arrays.toString(getSort(arr)));
		//System.out.println("数组最大值为 " + getArrMax(arr));
		//System.out.println("数组最小值为 " + getArrMin(arr));
		System.out.println("数组最小值为 " + getArrMaxOrMin(arr,"min"));
		System.out.println("数组最大值为 " + getArrMaxOrMin(arr,"max"));
	}
	
	public static int[] getSort (int[] array) {
		//给数组排序
		int temp;
		boolean exchange;
		for (int i = 0; i < array.length; i++) {
			exchange = false;
			for (int j = array.length - 1; j >= 1; j--) {
				if (array[j] < array[j - 1] ) {
					temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
					exchange = true; //数据位置发生改变时
				}
			}
			if (!exchange)
				break;
		}
		return array;
	}
	
	public static int getArrMax (int[] array) {
		//求得数组中的最大值
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > temp) {
				temp = array[i];
			}
		}
		return temp;
	}
	
	public static int getArrMin (int[] array) {
		//求得数组中的最小值
		int temp = 0; //用来保存最小值的下标/索引
		for (int i = 1; i < array.length; i++) {
			if (array[i] < array[temp]) {
				temp = i;	
			}
		}
		return array[temp];
	}
	
	public static int getArrMaxOrMin (int[] array, String b) {
		//求得数组中的最大值或者最小值
		if (b == "min") {
			return getArrMin(array);
		} else if (b == "max"){
			return getArrMax(array);
		} else {
			return 0;
		}
	}

}
