import java.util.*;
public class MatrixLayeredRotation {
    public static void reverse(int[] border,int start,int end){
        while(start<end){
            border[start]^=border[end];
            border[end]^=border[start];
            border[start]^=border[end];
            start++; end--;
        }
    }
    public static void rotate(int[] border,int K,int N){
        reverse(border,0,K-1);
        reverse(border,K,N-1);
        reverse(border,0,N-1);
    }
    public static void matrixRotation(List<List<Integer>> matrix, int r) {
        int R=matrix.size(),C=matrix.get(0).size();
        int SR=0,ER=R-1,SC=0,EC=C-1,size,curr;
        int [] border;
        while(SR<ER && SC<EC){
            size=(2*(ER-SR+1))+(2*(EC-SC+1))-4;
            border = new int[size]; curr=0;
            for(int i=SC;i<=EC;i++) border[curr++]=matrix.get(SR).get(i);
            for(int i=SR+1;i<=ER;i++) border[curr++]=matrix.get(i).get(EC);
            for(int i=EC-1;i>=SC;i--) border[curr++]=matrix.get(ER).get(i);
            for(int i=ER-1;i>=SR+1;i--) border[curr++]=matrix.get(i).get(SC);
            rotate(border,r%size,size);
            int index=0;
            for(int i=SC;i<=EC;i++){
                matrix.get(SR).set(i,border[index]);
                index++;
            }
            for(int i=SR+1;i<=ER;i++){
                matrix.get(i).set(EC,border[index]);
                index++;
            }
            for(int i=EC-1;i>=SC;i--){
                matrix.get(ER).set(i,border[index]);
                index++;
            }
            for(int i=ER-1;i>=SR+1;i--){
                 matrix.get(i).set(SC,border[index]);
                 index++;
            }
            SR++; ER--; SC++; EC--;
        }
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                System.out.print(matrix.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }    
}
