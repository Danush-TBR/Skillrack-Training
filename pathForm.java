import java.util.*;
public class pathForm {
    public static void dfs(int[][] grid,int curr_row,int curr_col,int R,int C){
        if(curr_row<0 || curr_row>=R || curr_col<0 || curr_col>=C || grid[curr_row][curr_col]!=1 || grid[R-1][C-1]==3) return;
        if(curr_row==R-1 && curr_col==C-1){
            grid[R-1][C-1]=3; return;
        }
        grid[curr_row][curr_col]=2;
        dfs(grid,curr_row-1,curr_col,R,C);
        dfs(grid,curr_row-1,curr_col-1,R,C);
        dfs(grid,curr_row-1,curr_col+1,R,C);
        dfs(grid,curr_row+1,curr_col,R,C);
        dfs(grid,curr_row+1,curr_col-1,R,C);
        dfs(grid,curr_row+1,curr_col+1,R,C);
        dfs(grid,curr_row,curr_col-1,R,C);
        dfs(grid,curr_row,curr_col+1,R,C);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R=scanner.nextInt(),C=scanner.nextInt();
        int[][] grid = new int[R][C];
        for(int i=0;i<R;i++) for(int j=0;j<C;j++) grid[i][j]=scanner.nextInt();
        dfs(grid,0,0,R,C);
        for(int i=0;i<R;i++,System.out.println()) for(int j=0;j<C;j++) System.out.print(grid[i][j]+" ");
        if(grid[R-1][C-1]==3) System.out.print("Yes");
        else System.out.println("No");
        scanner.close();
    }
}
