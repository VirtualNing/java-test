package cn.itcast.day04.demo01;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        //冒泡排序法
        int[] Arr = {3,5,7,2,1,9,4};
        int len = Arr.length;
        BubbleSortTopDown b1 = new BubbleSortTopDown(Arr,len);
        BubbleSortSmallToBig bs1 = new BubbleSortSmallToBig(Arr,len);
    }
}

class BubbleSortTopDown {
    BubbleSortTopDown (int[] arr, int len) {
        this.topDown(arr,len);
    }
    public void topDown(int[] arr, int len) {
        boolean exchange;
        int temp;
       for (int i = 0; i < len - 1; i++) {
           exchange = false; //优化步骤一，exchange 先默认为 false
           for (int j = len - 1; j > i; j--) {
               if (arr[j] < arr[j - 1]) { //如果 数组中倒数第一个数值小于倒数第二个数值
                   temp = arr[j]; // 则将它们的位置交换
                   arr[j] = arr[j - 1];
                   arr[j - 1] = temp;
                   exchange = true; //优化步骤二，如果发生数据位置交换，exchange 为 true
               }
           }
           if (!exchange) //优化步骤三，如果没有发生数据位置交换，就跳出当前循环，执行循环外的语句
               break;
       }
       System.out.print(Arrays.toString(arr));
    }
}

class BubbleSortSmallToBig {
    BubbleSortSmallToBig (int[] arr, int len) {
        this.smallTopBig(arr,len);
    }
    public void smallTopBig (int[] arr, int len) {
        int temp;
        boolean exchange;
        for (int i = 0; i < len - 1; i++) {
            exchange = false; //优化步骤一，exchange 先默认为 false
            for (int j = len - 1; j > i; j--) {
                if (arr[j] > arr[j - 1]) { //当倒数第一个数大于倒数第二个数
                    temp = arr[j - 1]; // 将较小的值赋值给 temp
                    arr[j - 1] = arr[j]; //将较大的值赋值给较小的值，
                    arr[j] = temp; //将temp赋值给较大值
                    exchange = true; //优化步骤二，如果发生数据位置交换，exchange 为 true
                }
            }
            if (!exchange) //优化步骤三，如果没有发生数据位置交换，就跳出当前循环，执行循环外的语句
                break;
        }
        System.out.print(Arrays.toString(arr));//打印数组方法
    }
}