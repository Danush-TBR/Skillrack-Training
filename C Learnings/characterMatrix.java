import java.util.Scanner;

public class characterMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R=scanner.nextInt(),C=scanner.nextInt();
        char[][] matrix = new char[R][C];
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                matrix[i][j]=scanner.next().charAt(0);
            }
        }
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                System.out.print(matrix[i][j]);
            }
        }
        scanner.close();
    }
}
