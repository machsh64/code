package day09;

/*
 * 定义一个int型的一堆数组,包含10个元素,分别赋一些随机整数,
 * 然后求出所有元素的最大值,最小值,和值,平均值,并输出出来,
 * 要求: 所有随机值必须都是两位数.
 *
 * */
public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random() * (99 - 10 + 1) + 10);
        }
        int maxValue = arr[0];
        int minValue = arr[0];
        for (int i = 0;i < arr.length; i++) {
            System.out.print(arr[i]+"\t");

            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
            if (minValue > arr[i]) {
                minValue = arr[i];
            }
            sum += arr[i];
        }
        double aver = (double)sum / 10;
        System.out.println("\nMax = " + maxValue + "\nMin = " + minValue + "\nSum = " + sum + "\nAver = " + aver);
    }
}
