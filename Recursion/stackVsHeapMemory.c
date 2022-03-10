#include<stdio.h>
int* repeatArray(int arr[],int N,int count){
    
    return;
}
int main(){
    int N;
    scanf("%d",N);
    int arr[N],count;
    for(int index=0;index<N;index++){
        scanf("%d",&arr[index]);
    }
    scanf("%d",&count);
    int *newArray = repeatArray(arr,N,count);
    for(int index=0;index<count*N;index++){
        printf("%d ",newArray[index]);
    }
}