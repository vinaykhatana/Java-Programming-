import java.util.Scanner;
    public class PrimeInRange {

        public static boolean isPrime(int n) {
            if(n < 2) return false;
            if(n == 2) return true;
            if(n % 2 == 0) return false;

            for(int i = 3; i * i <= n; i += 2) {
                if(n % i == 0) return false;
            }
            return true;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter start:");
            int start = sc.nextInt();
            System.out.println("Enter end:");
            int end = sc.nextInt();

            for(int i = start; i <= end; i++) {
                if(isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
        }
    }

