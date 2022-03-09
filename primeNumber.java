import java.util.Scanner;
import java.lang.Math;
public class primeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n=scanner.nextLong();
        scanner.close();
        // long mySqrt = (long)Math.sqrt(n);
        for(long i=2;i*i<=n;i++){
            if(n%i==0){
                System.out.println("Not a Prime Number");
                return;
            }
        }
        System.out.println("Prime Number");
    }
}