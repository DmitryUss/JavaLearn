package Antiplagiat;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.lang.reflect.Array;

public class main {
    public static void maina(String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.println();

            for (int j = 0; j < i; j++) {
                System.out.print("0 ");
            }
        }

        System.out.println();

        for (int j = 0; j < 10; j++) {
            System.out.println();
            for (int i = 10; i > j; i--) {
                System.out.print("0 ");
            }

        }


    }

    public static void display(int arr[]){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {  //пришлось ставить STATIC
        int arr[] = {3,4,6,7,1,0,9,2,5,7};

//        for (int i=0; i<10; i++){  //заполняем массив
//            arr[i]=i;
//        }

       //выводим
        display(arr); //не сортированный массив

        //сортируем
        int temp=0, min=0, max=0;

        //находим max
        for (int i=0; i<arr.length; i++){
           if(max < arr[i]){
               max = arr[i];
           }

        }
        System.out.println(max); //выводим max

        //находим min
        for (int i=0; i<arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min); //выводим min

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }

        display(arr);


    }
}
