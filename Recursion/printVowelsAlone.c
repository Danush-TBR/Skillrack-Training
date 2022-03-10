#include<stdio.h>
#include<ctype.h>
int isVowel(char ch){
    ch=tolower(ch);
    return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
}
void printVowels(char *str,int index){
    if(str[index]=='\0') return;
    if(isVowel(str[index])) printf("%c",str[index]);
    printVowels(str,index+1);
}
int main(){
    char str[101];
    scanf("%s",str);
    printVowels(str,0);
    return 0;
}