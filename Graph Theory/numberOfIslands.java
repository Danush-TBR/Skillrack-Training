import java.util.Scanner;

public class numberOfIslands {
    public static void dfs(int[][] grid,int curr_row,int curr_col,int row,int col){
        if(curr_row>=row || curr_row<0 || curr_col>=col || curr_col<0 || grid[curr_row][curr_col]!=1) return;
        grid[curr_row][curr_col]=2;
        dfs(grid,curr_row,curr_col-1,row,col);
        dfs(grid,curr_row,curr_col+1,row,col);
        dfs(grid,curr_row-1,curr_col,row,col);
        dfs(grid,curr_row+1,curr_col,row,col);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R=scanner.nextInt(),C=scanner.nextInt(),ctr=0;
        int[][] grid = new int[R][C];
        for(int i=0;i<R;i++) for(int j=0;j<C;j++) grid[i][j]=scanner.nextInt();
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(grid[i][j]==1){
                    dfs(grid,i,j,R,C);
                    ctr++;
                }
            }
        }
        System.out.print(ctr);
        scanner.close();
    }
}
