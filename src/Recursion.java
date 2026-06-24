import java.util.Scanner;

public class Recursion {
    public static void print(int n) {
        if (n == 0) return;
        print(n - 1);
        System.out.println(n);
    }

    public static int factorial(int n) {
        if (n < 2) return n;
        return n * factorial(n - 1);
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int mid = low + (high - low) / 2;
        while (low <= high) {
            mid = low+(high-low)/2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) low = mid + 1;
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
//    public static int smallestInArray(int[] arr){
//        int smallest = Integer.INT_MIN;
//        for(int i=1;i<arr.length;i++){
//
//            if
//        }


    }

        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            int Size = sc.nextInt();
            int[] arr = new int[Size];
            for (int i = 0; i < Size; i++) {
                arr[i] = sc.nextInt();
            }
            int Target = sc.nextInt();

            System.out.println(binarySearch(arr, Target));
        }
    }

