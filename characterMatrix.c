#include<stdio.h>
int main(){
    int R,C;
    scanf("%d %d",&R,&C);
    char matrix[R][C],str[2];
    for(int row=0;row<R;row++){
        for(int col=0;col<C;col++){
            scanf("%s",str);
            matrix[row][col]=str[0];
        }
    }
    for(int row=0;row<R;row++){
        for(int col=0;col<C;col++){
            printf("%c",matrix[row][col]);
        }
        printf("\n");
    }
    return 0;
}