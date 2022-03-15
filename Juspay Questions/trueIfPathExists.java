import java.util.*;
public class trueIfPathExists {
    public static boolean isPathFound(Map<String,List<String>> graph,Map<String,Integer> visited,Queue<String> traverse,String start,String end){
        // if(start.equals(end)) return true;
        visited.put(start, 1);
        traverse.add(start);
        
        // for(String adj : graph.get(start)){
            // traverse.push(adj);
        while(!traverse.isEmpty()){
            String temp = traverse.poll();
            if(temp.equals(end)) return true;
            for(String adj : graph.get(temp)){
                if(visited.get(adj)==0){
                    traverse.add(adj);
                    visited.put(adj, 1);
                }
            }
            visited.put(temp, 2);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,List<String>> graph = new HashMap<>();
        Map<String,Integer> visited = new HashMap<>();
        Queue<String> traverse = new LinkedList<>();
        int N=scanner.nextInt(); String id; scanner.nextLine();
        for(int ctr = 1; ctr <= N; ctr++){
            id=scanner.nextLine();
            graph.put(id,new ArrayList<>());
            visited.put(id,0);
        }
        int queries = scanner.nextInt(); scanner.nextLine();
        for(int ctr = 1; ctr <= queries ; ctr++){
            String[] path = scanner.nextLine().split(" ");
            graph.get(path[0]).add(path[1]);
        }
        String[] pathNeeded = scanner.nextLine().split(" ");
        System.out.println(isPathFound(graph,visited,traverse,pathNeeded[0],pathNeeded[1])?"true":"false"); 
        scanner.close();
    }
}
