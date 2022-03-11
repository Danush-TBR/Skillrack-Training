import java.util.*;
public class validSudoku{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] Rows = new int[9], Cols = new int[9], Matrix = new int[9];
        int current;
        for(int row=0; row<9; row++){
            for(int col=0; col<9; col++){
                current = scanner.nextInt();
                Rows[row]|=1<<(current-1);
                Cols[col]|=1<<(current-1);
                Matrix[((row/3)*3)+(col/3)]|=1<<(current-1);
            }
        }
        scanner.close();
        int check = (1<<9)-1;
        for(int i=0;i<9;i++){
            // System.out.println(Rows[i]+" "+Cols[i]+" "+Matrix[i]);
            if(Rows[i]!=check || Cols[i]!=check || Matrix[i]!=check){
                System.out.println("Not Valid");
                return;
            }
        }
        System.out.println("Valid");
    }
}