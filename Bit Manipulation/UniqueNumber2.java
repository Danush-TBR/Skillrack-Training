import java.util.Scanner;

public class UniqueNumber2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[]{1,2,2,3};
        int result=0,zero=0,ones=0,x=1;
        for(int i=0;i<4;i++) result^=arr[i];

        //finding mask bit
        while((x&result)==0) x<<=1;

        //using two variables
        for(int i=0;i<4;i++){
            if((x&arr[i])==0) zero^=arr[i];
            else ones^=arr[i];
        }
        System.out.println(zero+" "+ones);
        scanner.close();
    }
}
