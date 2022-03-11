import java.util.Scanner;

public class vowelsInOneIter {
    public static boolean isVowel(char ch){
        ch=Character.toLowerCase(ch);
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] arr=scanner.next().toCharArray();
        int gap=scanner.nextInt(),len=arr.length,count=0;
        for(int i=0;i<gap && i<len;i++){
            if(isVowel(arr[i])){
                count++;
            }
        }
        System.out.print(count+" ");
        for(int i=gap;i<len;i++){
            if(isVowel(arr[i-gap])){
                count--;
            }
            if(isVowel((arr[i]))){
                count++;
            }
            System.out.print(count+" ");
        }
        scanner.close();
    }
}
