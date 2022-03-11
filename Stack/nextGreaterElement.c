#include<stdio.h>
#include<stdlib.h>
int top=-1,*myStack,N;
void push(int value){
    if(top==N-1) printf("Stack OverFlow\n");
    myStack[++top]=value;
}
int isEmpty(){
    return top==-1;
}
int peek(){
    if(isEmpty()){
        printf("Stack UnderFlow ");
        return -1;
    }
    return myStack[top];
}
int pop(){
    if(isEmpty()){
        printf("Stack UnderFlow ");
        return -1;
    }
    else return myStack[top--];
}
int main(){
    int value;
    scanf("%d",&N);
    myStack = malloc(sizeof(int)*N);
    int arr[N];
    for(int ctr=0;ctr<N;ctr++){
        //Get the input
        scanf("%d",&arr[ctr]);
        //Condition for next Smaller element is commented below.
        //while(!isEmpty() && arr[peek()]<arr[ctr]){
        //Run a Loop till the last index pushed smaller than the current value we got.
        //If Its Empty, come out of the loop. (Exit Condition)
        while(!isEmpty() && arr[peek()]<arr[ctr]){
            //As we have found a element greater mark the the popped index with the element we got
            arr[pop()]=arr[ctr];
        }
        //After processing all indices push the value's index we got
        push(ctr);
    }
    //Printing the Next Greater element Array
    for(int i=0;i<N;i++){
        printf("%d ",arr[i]);
    }
}