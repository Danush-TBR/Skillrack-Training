import java.util.*;

public class abc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // char ch; int n;
        // ch=scanner.next().charAt(0);
        // n=scanner.nextInt();
        // System.out.println(ch+" "+n);
        // String str="Hello";
        System.out.println(String.format("%d", 20));
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(0);
        list.remove(0);
        System.out.print(list);
        scanner.close();
    }
}
