#include<stdio.h>
int main(){
    int N,ctr=0;
    scanf("%d",&N);
    while(N){
        ctr+=(N&1);
        N>>=1;
    }
    printf("%d",ctr);
}