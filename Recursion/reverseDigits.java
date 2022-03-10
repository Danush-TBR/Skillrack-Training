import java.util.*;
public class reverseDigits {
    public static void printMainOrder(int N){
        if(N==0) return;
        printMainOrder(N/10);
        System.out.print(N%10+" ");
    }
    public static void printReverseOrder(int N){
        if(N==0) return;
        System.out.print(N%10+" ");
        printReverseOrder(N/10);
    }
    public static void printDoubleValue(int N){
        if(N==0) return;
        printDoubleValue(N/10);
        System.out.print(((N%10)*2)+" ");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt();
        printMainOrder(N);
        System.out.println();
        printReverseOrder(N);
        System.out.println();
        printDoubleValue(N);
        scanner.close();
    }
}
