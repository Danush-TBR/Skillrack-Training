import java.util.Scanner;
// import java.lang.Math;
public class primeNumber {
    public static boolean checkPrime(long number){
        if(number==2 || number==3) return true;
        return (number+1)%6==0 || (number-1)%6==0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n=scanner.nextLong();
        scanner.close();
        if(checkPrime(n)) System.out.println("Prime");
        else System.out.println("Not Prime Number");
        // // long mySqrt = (long)Math.sqrt(n);
        // for(long i=2;i*i<=n;i++){
        //     if(n%i==0){
        //         System.out.println("Not a Prime Number");
        //         return;
        //     }
        // }
        // System.out.println("Prime Number");
    }
}