package Sorting;
import java.util.Scanner;
public class BubbleSort {
    public static void bubbleSort(int[] arr, int length){
        int i,j,temp;
        boolean swapped;
        for(i=0;i<length;i++){
            swapped = false;
            for(j=0;j<length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                    swapped = true;
                }

            }
            if(!swapped){
                break;
            }

        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array:");
        int length = sc.nextInt();
        int[] arr = new int[length];
        for(int i=0;i<length;i++){
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr,length);
        for(int i=0;i<length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
