#include<stdio.h>
#include<stdlib.h>
int top=-1,*myStack,N;
void push(int value){
    if(top==N-1) printf("Stack OverFlow... ");
    myStack[++top]=value;
}
int isEmpty(){
    return top==-1;
}
int peek(){
    if(isEmpty()){
        printf("Stack UnderFlow... ");
        return -1;
    }
    return myStack[top];
}
int pop(){
    if(isEmpty()){
        printf("Stack UnderFlow... ");
        return -1;
    }
    else return myStack[top--];
}
void printStack(){
    if(isEmpty()) return;
    int X=myStack[top--];
    printStack();
    printf("%d ",X);
    push(X);
}
int main(){
    int value;
    scanf("%d",&N);
    myStack = malloc(sizeof(int)*N);
    for(int ctr=0;ctr<N;ctr++){
        scanf("%d",&value);
        if(!isEmpty() && peek()==value){
            pop();
        }
        else push(value);
    }
    printStack();
}