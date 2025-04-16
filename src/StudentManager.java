import java.util.*;

public class StudentManager {
    public void addStudent(Map<Integer, String> students, int studentId, String name){
        if(students.containsKey(studentId)){
            System.out.println("Student with id " + studentId + " already exists");

        } else {
            students.put(studentId, name);
            System.out.println("Student with id " + studentId + " added");
        }
    }
    public void sortStudents(Map<Integer, String> students) {
        // TreeMap automatically sorts by key
        Map<Integer, String> sorted = new TreeMap<>(students);

        System.out.println("Sorted students by ID:");
        for (Map.Entry<Integer, String> entry : sorted.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }

    public void searchStudent(Map<Integer, String> students, int studentId){

        if (students.containsKey(studentId)) {
            System.out.println("The student with ID " + studentId + " is " + students.get(studentId));

        } else {
            System.out.println("The student with ID " + studentId + " is not found");
        }
    }


    public void removeStudent(Map<Integer, String> students, int studentId)  {
        if (students.containsKey(studentId)) {
            System.out.println( "The Student with the "+studentId+" has successfully been removed" +students.remove(studentId));

        }
        else{
            System.out.println("The Student with the "+studentId+" is not found");

        }
    }

    public void findStudentWithHighestId(Map<Integer, String> students ){
        if (students.isEmpty()) {
            System.out.println("There are no students in the database");
        }
        int highestId = Collections.max(students.keySet());
        System.out.println("The student with the highest id is " + highestId );

    }

    public void findStudentWithLowestId(Map<Integer, String> students ){
        if (students.isEmpty()) {
            System.out.println("There are no students in the database");
        }
        int highestId = Collections.min(students.keySet());
        System.out.println("The student with the Lowest id is " + highestId );

    }

}