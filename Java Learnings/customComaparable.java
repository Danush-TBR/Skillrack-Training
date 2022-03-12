import java.util.*;

class Player implements Comparable<Player>{
    Player(){}
    private String name;
    private int goals;
    void setName(String name){
        this.name = name;
    }
    void setGoals(int goals){
        this.goals = goals;
    }
    int getGoals(){
        return this.goals;
    }
    String getName(){
        return this.name;
    }
    @Override
    public int compareTo(Player o) {
        if(o.getGoals()==this.goals){
            return this.name.compareTo(o.getName());
        }
        else{
            return o.getGoals()-this.goals;
        }
    }
}
public class customComaparable {
    public static void main(String[] args) {
        List<Player> list = new ArrayList<>();
        Player p1 = new Player();
        p1.setGoals(15);
        p1.setName("Ronaldo");
        Player p2 = new Player();
        p2.setGoals(13);
        p2.setName("Messi");
        Player p3 = new Player();
        p3.setGoals(15);
        p3.setName("Hazard");
        list.add(p1); list.add(p2); list.add(p3);
        Collections.sort(list);
        for(Player player : list){
            System.out.println(player.getName()+" "+player.getGoals());
        }
    }
}