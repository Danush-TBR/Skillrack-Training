import java.util.Scanner;

public class MaximumCouponPathMatrix {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        //Geting Input R,C
        int R=scanner.nextInt(),C=scanner.nextInt();
        int[][] arr=new int[R][C];

        //Getting Input Matrix
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        int[][] DP = new int[R+1][C+1];
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                DP[i+1][j+1]=Math.max(DP[i][j+1],DP[i+1][j])+arr[i][j];
            }
        }
        System.out.println();
        for(int i=1;i<=R;i++){
            for(int j=1;j<=C;j++){
                System.out.print(DP[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print(DP[R][C]);
        scanner.close();
    }
}
