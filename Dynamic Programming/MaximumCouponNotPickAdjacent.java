import java.util.*;
import java.lang.Math;
public class MaximumCouponNotPickAdjacent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt();
        int[] arr = new int[N];
        for(int index=0;index<N;index++){
            arr[index]=scanner.nextInt();
        }
        arr[1]=Math.max(arr[0],arr[1]);
        for(int index=2;index<N;index++){
            arr[index]=Math.max(arr[index-1],arr[index]+arr[index-2]);
        }
        System.out.print(arr[N-1]);
        scanner.close();
    }
}