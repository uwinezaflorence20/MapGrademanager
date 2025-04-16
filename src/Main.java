import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



                Map<Integer, String> students = new HashMap();
                StudentManager manager = new StudentManager();
                manager.addStudent(students, 1, "Florence");
                manager.addStudent(students, 2, "Milli");
                manager.addStudent(students, 3, "William");
                manager.addStudent(students, 4, "James");
                manager.addStudent(students, 5, "John");
                manager.addStudent(students, 6, "Jack");
                System.out.println("The whole Students:\n" + String.valueOf(students));
                manager.sortStudents(students);
                manager.searchStudent(students, 1);
                manager.searchStudent(students, 10);
                manager.removeStudent(students, 6);
                manager.findStudentWithHighestId(students);
                manager.findStudentWithLowestId(students);
            }
        }

