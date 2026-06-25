import java.util.Scanner;
public class ReverseArray {
    public static int[] reverseArray(int[] nums,int length) {
        int j = length - 1;
        int i=0;
        while(i<j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        return nums;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        int i;
        for(i=0;i<length;i++) {
            arr[ i]=sc.nextInt();
        }
        int[] result =  reverseArray(arr,length);
        for(i=0;i<length;i++) {
            System.out.print(result[i]+" ");
        }

    }
}
