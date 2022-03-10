import java.util.Scanner;

public class MaximumCouponMatrixTR_to_BL {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        //Geting Input R,C
        int R=scanner.nextInt(),C=scanner.nextInt();
        int[][] arr=new int[R][C];

        //Getting Input Matrix
        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                arr[row][col]=scanner.nextInt();
            }
        }
        for(int row=1;row<R;row++) arr[row][C-1]+=arr[row-1][C-1];
        for(int col=C-2;col>=0;col--) arr[0][col]+=arr[0][col+1];
        for(int row=1;row<R;row++){
            for(int col=C-2;col>=0;col--){
                arr[row][col]=Math.max(arr[row-1][col],arr[row][col+1])+arr[row][col];
            }
        }
        System.out.println();
        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
        System.out.print(arr[R-1][0]);
        // // Using a secondary DP Matrix
        // int[][] DP = new int[R+1][C+1];
        // for(int row=0;row<R;row++){
        //     for(int col=C-1;col>=0;col--){
        //         DP[row+1][col-1]=Math.max(DP[row-1][col],DP[row][col+1])+arr[row][col];
        //     }
        // }
        // System.out.println();
        // for(int row=1;row<=R;row++){
        //     for(int col=1;col<=C;col++){
        //         System.out.print(DP[row][col]+" ");
        //     }
        //     System.out.println();
        // } 
        // System.out.print(DP[R][C]);
        scanner.close();
    }
}
