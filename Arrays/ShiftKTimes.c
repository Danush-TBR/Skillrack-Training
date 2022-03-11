#include<stdio.h>
void swap(int *arr,int start,int end){
    arr[start]^=arr[end];
    arr[end]^=arr[start];
    arr[start]^=arr[end];
}
void reverse(int *arr,int start,int end){
    while(start<end){
        swap(arr,start,end);
        start++; end--;
    }
}
int main(){
    int N;
    scanf("%d",&N);
    int arr[N],K;
    for(int index=0;index<N;index++){
        scanf("%d",&arr[index]);
    }
    scanf("%d",&K);
    K%=N;
    //Anti - Clockwise
    if(K!=0){
        reverse(arr,0,K-1);
        reverse(arr,K,N-1);
        reverse(arr,0,N-1);
    }
    //Clockwise
    // if(K!=0){
    //     reverse(arr,0,N-1);
    //     reverse(arr,0,K-1);
    //     reverse(arr,K,N-1);
    // }
    for(int i=0;i<N;i++){
        printf("%d ",arr[i]);
    }
    return 0;
}