#include<stdio.h>
int main(){
    int N,rev=0;
    scanf("%d",&N);
    while(N!=0){
        rev=(rev*10)+(N%10);
        N/=10;
    }
    rev=((rev/100)*100)+((rev%10)*10)+((rev/10)%10);
    while(rev!=0){
        N=(N*10)+(rev)%10;
        rev/=10;
    }
    printf("%d",N);
}