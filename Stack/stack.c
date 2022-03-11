#include<stdio.h>
#include<stdlib.h>
int top=-1,*myStack,N;
// Queue<Integer> myStack = new LinkedList<>();
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
    for(int ctr=1;ctr<=N;ctr++){
        scanf("%d",&value);
        push(value);
    }
    while (!isEmpty())
    {
        if(top!=-1) printf("%d \n",pop());
    }
    pop();
}