import java.util.*;

public class validParanthesis {
    public static boolean isValid(char[] str,int len){
        Stack<Character> myStack = new Stack<>();
        for(int index=0;index<len;index++){
            if(str[index]=='(') myStack.push('(');
            else if(myStack.empty() || myStack.peek()!='(') return false;
            else myStack.pop();
        }
        if(myStack.empty()) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] array = scanner.nextLine().toCharArray();
        int len=array.length;
        System.out.println(isValid(array, len)?"Yes":"No");
        scanner.close();
    }
}
