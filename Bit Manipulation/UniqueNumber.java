import java.util.*;
public class UniqueNumber{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt(),x=0;
        for(int index=0;index<n;index++){
            x^=scanner.nextInt();
        }
        System.out.print(x);
        scanner.close();
    }
}