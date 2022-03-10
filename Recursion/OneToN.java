import java.util.Scanner;

public class OneToN {
    public static void printOdd(int N){
        if(N==0){
            return;
        }
        else{
            printOdd(N-1);
            if((N&1)==1) System.out.print(N+" ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt();
        printOdd(N);
        scanner.close();
    }
}