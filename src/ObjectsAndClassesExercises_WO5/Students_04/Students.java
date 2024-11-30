package ObjectsAndClassesExercises_WO5.Students_04;

import java.util.*;

public class Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] studentData = scanner.nextLine().split(" ");
            String firstName = studentData[0];
            String lastName = studentData[1];
            double grade = Double.parseDouble(studentData[2]);

            students.add(new Student(firstName, lastName, grade));
        }

        // Sort the students by grade in descending order
        students.sort((s1, s2) -> Double.compare(s2.grade, s1.grade));

        // Print the sorted students
        for (Student student : students) {
            System.out.println(student);
        }
    }
}