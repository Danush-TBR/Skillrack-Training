#include<stdio.h>
void baseConvertor(int N,int base){
    if(N==0) return;
    int X=N%base;
    baseConvertor(N/base,base);
    if(X>=10) printf("%c",'A'+X-10);
    else printf("%d",X);
}
int main(){
    int N;
    scanf("%d",&N);
    baseConvertor(N,2);
    printf("\n");
    baseConvertor(N,8);
    printf("\n");
    baseConvertor(N,16);
    printf("\n");
    return 0;
}