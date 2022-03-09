import java.util.Scanner;
public class EuclideanAlgorithm {
    //Euclidean Algorithm

    public static long gcdUsingEuclidean(long number1,long number2){
        return (number1==0)? number2: gcdUsingEuclidean(number2%number1, number1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number1 = scanner.nextLong();
        long number2 = scanner.nextLong();
        System.out.print(gcdUsingEuclidean(number1,number2));
        scanner.close();
    }
}
