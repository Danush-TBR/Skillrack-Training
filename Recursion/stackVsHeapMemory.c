#include<stdio.h>
#include<stdlib.h>
int* repeatArray(int arr[],int N,int count){
    int *newArray = malloc(sizeof(int)*N*count);
    for(int i=0;i<count;i++){
        for(int j=0;j<N;j++){
            newArray[(i*N)+j]=arr[j];
        }
    }
    return newArray;
}
int main(){
    int N;
    scanf("%d",&N);
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