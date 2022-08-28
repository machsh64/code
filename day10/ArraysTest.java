package day10;

import java.util.Arrays;

//Arrays工具类的使用:
public class ArraysTest {
    public static void main(String[] args) {
        //1.boolean equals(int[] a,int[] b)  判断两个数组是否相同
        System.out.println("判断两个数组是否相同的段落");
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[]{1, 3, 2, 4, 5};
        boolean isEquals = Arrays.equals(arr1, arr2);
        System.out.println(isEquals);
        System.out.println();

        //2.String toString(int[] a)  输出数组信息
        System.out.println("输出数组信息的段落");
        System.out.println(Arrays.toString(arr2));
        System.out.println();
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
        System.out.println(Arrays.toString(arr[2]));   //[6,7,8,9]
        System.out.println();

        //3.void fill(int[] a,int val) 将指定值填充到数组之中
        System.out.println("将指定值填充到数组之中的段落");
        Arrays.fill(arr1, 10);
        System.out.println(Arrays.toString(arr1));   //[10,10,10,10,10]
        System.out.println();

        //4.void sort(int[] a)  对数组进行排序
        // 所使用的方法为 快速排序O（nlog2n）快速不稳定
        // 除此之外还有
        // 冒泡排序O（n2）稳定
        // 归并排序O（nlog2n） 稳定
        System.out.println("对数组进行排序的段落");
        int[] arr3 = new int[]{2, 4, 5, 73, 125, 63, -15, -52, 66};
        System.out.println("原数组： \n" + Arrays.toString(arr3));
        Arrays.sort(arr3);
        System.out.println("排序后的数组: \n" + Arrays.toString(arr3)); //[-52,-15,2,4,5,63,66,73,125]
        System.out.println();

        //5.int binarySearch(int[] a,int key)  对排序后的数组进行二分法检索指定的值
        System.out.println("检索指定值位置的段落");
        int num = 125;
        System.out.println("目标位置所在的数组: \n" + Arrays.toString(arr3) + "\n"+"所要查找的数为 :"+num+"\n");
        int desk = Arrays.binarySearch(arr3, num);
        System.out.println("所要查找的数在该数组中索引为 " + desk); // 8 > 指出的位置为重新排序后的位置
    }
}
