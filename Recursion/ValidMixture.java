import java.util.Scanner;

public class ValidMixture {
    public static boolean isValid(char[] str1,char[] str2,char[] str3,int ind1,int ind2,int ind3,int len1,int len2,int len3){
        if((ind1<len1 || ind2<len2) && ind3>=len3) return false;
        if(ind1>=len1 && ind2>=len2){
            if(ind3<len3) return false;
            else return true;
        }
        if(ind1<len1 && ind2<len2 && str1[ind1]!=str3[ind3] && str2[ind2]!=str3[ind3]) return false;
        if(ind1<len1 && ind2<len2){
            if(str1[ind1]==str2[ind2] && str2[ind2]==str3[ind3]){
                return isValid(str1, str2, str3, ind1+1, ind2, ind3+1, len1, len2, len3) || isValid(str1, str2, str3, ind1, ind2+1, ind3+1, len1, len2, len3);
                // boolean a=isValid(str1, str2, str3, ind1+1, ind2, ind3+1, len1, len2, len3);
                // boolean b=isValid(str1, str2, str3, ind1, ind2+1, ind3+1, len1, len2, len3);
                // return a||b;
            }
            else if(str1[ind1]==str3[ind3]){
                return isValid(str1, str2, str3, ind1+1, ind2, ind3+1, len1, len2, len3);
            }
            else{
                return isValid(str1, str2, str3, ind1, ind2+1, ind3+1, len1, len2, len3);
            }
        }
        else if(ind1<len1){
            if(str1[ind1]!=str3[ind3]) return false;
            else return isValid(str1, str2, str3, ind1+1, ind2, ind3+1, len1, len2, len3);
        }
        else{
            if(str2[ind2]!=str3[ind3]) return false;
            else return isValid(str1, str2, str3, ind1, ind2+1, ind3+1, len1, len2, len3);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] str1 = scanner.nextLine().toCharArray(),str2 = scanner.nextLine().toCharArray(),str3 = scanner.nextLine().toCharArray();
        int len1=str1.length,len2=str2.length,len3=str3.length;
        scanner.close();
        if(len2+len1!=len3){
            System.out.print("Not Valid");
            return;
        }
        if(isValid(str1,str2,str3,0,0,0,len1,len2,len3)){
            System.out.print("Valid");
        }
        else{
            System.out.print("Not Valid");
        }
    }
}
