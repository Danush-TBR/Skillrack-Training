#include<stdio.h>
void xToY(int X,int Y){
    if(X>Y) return;
    printf("%d ",X);
    xToY(X+1,Y);
}
int main(){
    int X,Y;
    scanf("%d %d",&X,&Y);
    xToY(X,Y);
    return 0;
}