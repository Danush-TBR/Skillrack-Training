import java.util.*;
class Student implements Comparable<Student>{
    String name;
    int maths,physics,chemistry,sum;
    Student(String name,int maths,int physics,int chemistry){
        this.name = name;
        this.maths = maths;
        this.physics = physics;
        this.chemistry = chemistry;
        this.sum = maths+physics+chemistry;
    }
    @Override
    public int compareTo(Student other) {
        if(this.sum==other.sum){
            if(this.maths==other.maths){
                if(this.physics==other.physics){
                    return this.name.compareTo(other.name);
                }
                return other.physics - this.physics;
            }
            return other.maths - this.maths;
        }
        return other.sum - this.sum;
    }
    
}
public class studentCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        List<Student> students = new ArrayList<>();
        for(int ctr = 1; ctr<=N; ctr++){
            Student student = new Student(scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
            scanner.nextLine();
            students.add(student);
        }
        Collections.sort(students);
        for(Student student : students){
            System.out.println(student.name+" "+student.sum+" "+student.maths+" "+student.physics+" "+student.chemistry);
        }
        scanner.close();
    }
}
