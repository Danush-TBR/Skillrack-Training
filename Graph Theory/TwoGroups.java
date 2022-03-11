import java.util.*;
public class TwoGroups {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer,Integer> myMap = new HashMap<>();
        // Map<Integer,Integer> myMap1 = new HashMap<>();
        int left,right,temp; boolean lp,rp;
        int N=scanner.nextInt();
        for(int ctr = 0; ctr < N; ctr++){
            left=scanner.nextInt();
            right=scanner.nextInt();
            lp=myMap.containsKey(left);
            rp=myMap.containsKey(right);
            if(!lp && !rp){
                myMap.put(left,right);
                myMap.put(right,right);
            }
            else if(!lp){
                myMap.put(left,myMap.get(right));
            }
            else if(!rp){
                myMap.put(right,myMap.get(left));
            }
            else{
                temp=myMap.get(left);
                for(Map.Entry<Integer,Integer> entry:myMap.entrySet()){
                    if(entry.getValue()==temp) myMap.put(entry.getKey(),myMap.get(right));
                }
                myMap.put(left,myMap.get(right));
            }
            scanner.nextInt();
        }
        for(Map.Entry<Integer,Integer> entry:myMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        scanner.close();
    }
}
