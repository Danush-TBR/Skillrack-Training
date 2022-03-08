import java.util.Scanner;

public class UniqueNumber2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[]{12,11,13,12,13,45};
        int result=0,zero=0,ones=0,x=1;
        for(int i=0;i<6;i++) result^=arr[i];

        //finding mask bit
        while(((1<<x)&result)==0) x++;

        //using two variables
        for(int i=0;i<6;i++){
            if(((1<<x)&arr[i])==0) zero^=arr[i];
            else ones^=arr[i];
        }
        System.out.println(zero+" "+ones);
        scanner.close();
    }
}
