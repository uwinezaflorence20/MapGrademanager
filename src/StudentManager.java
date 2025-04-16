
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class StudentManager {
    public StudentManager() {
    }

    public void addStudent(Map<Integer, String> students, int studentId, String name) {
        try {
            if (students.containsKey(studentId)) {
                System.out.println("Student with id " + studentId + " already exists");
            } else {
                students.put(studentId, name);
                System.out.println("Student with id " + studentId + " added");
            }
        } catch (NullPointerException e) {
            System.out.println("Students map is null or student name is null");


        }
    }


    public void sortStudents(Map<Integer, String> students) {
        try {
            Map<Integer, String> sorted = new TreeMap<>(students);
            System.out.println("Sorted students by ID:");

            for (Map.Entry<Integer, String> entry : sorted.entrySet()) {
                System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
            }
        } catch (NullPointerException e) {
            System.out.println("Students map is null");
        }

    }



    public void searchStudent(Map<Integer, String> students, int studentId) {
        try {
            if (students.containsKey(studentId)) {
                System.out.println("The student with ID " + studentId + " is " + students.get(studentId));
            } else {
                System.out.println("The student with ID " + studentId + " is not found");
            }
        } catch (NullPointerException e) {
            System.out.println("Students map is null");
        }
    }



    public void removeStudent(Map<Integer, String> students, int studentId) {
        try {
            if (students.containsKey(studentId)) {
                 students.remove(studentId);
                System.out.println("The Student with the ID " + studentId + " has successfully been removed!! " );
            } else {
                System.out.println("The Student with the ID " + studentId + " is not found");
            }
        } catch (NullPointerException e) {
            System.out.println(" Students map is null");
        }
    }




    public void findStudentWithHighestId(Map<Integer, String> students) {
        try {
            if (students == null || students.isEmpty()) {
                System.out.println("There are no students in the database");
            } else {
                int highestId = Collections.max(students.keySet());
                System.out.println("The lowest ID is "+highestId+ " And The student with the lowest ID is " +students.get(highestId));
            }
        } catch (NullPointerException e) {
            System.out.println("Error: Students map is null");
        }

    }

    public void findStudentWithLowestId(Map<Integer, String> students) {
        try {
            if (students == null || students.isEmpty()) {
                System.out.println("There are no students in the database");
            } else {
                int lowestId = Collections.min(students.keySet());
                System.out.println("The lowest ID is "+lowestId+ " And The student with the lowest ID is " +students.get(lowestId));
            }
        } catch (NullPointerException e) {
            System.out.println("Error: Students map is null");
        }

    }
}