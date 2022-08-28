package day09;

public class Array {
    public static void main(String[] args) {

        //1.静态初始化：数组的声明和数组元素的赋值操作同时进行
        // int[] ads; //声明
        // ads = new int[]{1001, 1002, 1003, 1004, 1005,};//初始化
        int[] ads = new int[]{1001, 1002, 1003, 1004, 1005};

        //2.动态初始化：数组的声明和数组元素的初始化同时进行
        int[] abs = new int[5];//数组声明和数组元素初始化同时进行
        //数组元素赋值
        abs[0] = 1001;
        abs[1] = 1002;
        abs[2] = 1003;
        abs[3] = 1004;
        abs[4] = 1005;
        for (int i = 0; i < ads.length; i++) {           //小技巧，用数组长度代替人工输入数组长度  （  xxx.length代表数组长度  ）
            System.out.println(ads[i]);
        }
        System.out.println();
        for (int j = 0; j < abs.length; j++) {
            System.out.println(abs[j]);
        }
    }
}


/*C语言中的数组*/

/*
  #include"stdio.h"

  int main(){
  //1.静态初始化
  int ads[] = {1001,1002,1003,1004,1005};  //声明并赋值;
  for(int i=0;i<5;i++){
     printf("%d",ads[i]);                  //调用;
     }
  //2.动态初始化
  int abs[] = {0};                         //声明并首先赋0;
  for(int j=0;j<5;j++){
     abs[j] = j;                           //给abs[]赋值，也可以单调赋值;
     }
  for(j=0; j<5; j++){
     printf("%d",abs[j]);
  }

  }

*/



