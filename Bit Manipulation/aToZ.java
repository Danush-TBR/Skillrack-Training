import java.util.Scanner;

public class aToZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] myArr = scanner.nextLine().toCharArray();
        int result=0,len=myArr.length;
        for(int i=0;i<len;i++){
            result|=(1<<(myArr[i]-97));
        }
        System.out.println(result);
        if((result&(1<<26))==0){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
        scanner.close();
    }
}
