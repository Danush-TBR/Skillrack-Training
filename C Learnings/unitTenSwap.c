#include<stdio.h>
int main(){
    int N;
    scanf("%d",&N);
    printf("%d",((N/100)*100)+((N%10)*10)+((N/10)%10));
    return 0;
}