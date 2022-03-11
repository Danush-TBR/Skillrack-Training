#include<stdio.h>
int main(){
    int R,C;
    scanf("%d %d",&R,&C); 
    int matrix[R][C];
    // {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    for(int row=0;row<R;row++){
        for(int col=0;col<C;col++){
            scanf("%d",&matrix[row][col]);
        }
    }
    int SR=0,ER=R-1,SC=0,EC=C-1;
    while(SR<=ER && SC<=EC){
        for(int i=SC;i<=EC;i++) printf("%d ",matrix[SR][i]);
        for(int i=SR+1;i<=ER;i++) printf("%d ",matrix[i][EC]);
        for(int i=EC-1;i>=SC;i--) printf("%d ",matrix[ER][i]);
        for(int i=ER-1;i>=SR+1;i--) printf("%d ",matrix[i][SC]);
        SR++; ER--; SC++; EC--;
    }
}