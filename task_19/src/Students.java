import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Students {
    Student[] students = new Student[5];
    int[] IDNumber = new int[5];

    public Students() {
        students[0] = new Student(2, 4.8, "st1");
        students[1] = new Student(1, 4.4, "st2");
        students[2] = new Student(5, 4.9, "st3");
        students[3] = new Student(3, 3.6, "st4");
        students[4] = new Student(4, 3.2, "st5");

    }

    public void searchByName(String fio) {
        int check = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFio() == fio) {
                System.out.println("\nFound: " + students[i].getId() + " " + students[i].getAverage() + " " + students[i].getFio());
                check = 1;
            }
        }
        if (check == 0) {
            System.out.println("EXCEPTION: NOT FOUND");
        }
    }

    public void sortByName() {
        SortingByName sortingStudentByFIO = new SortingByName();
        ArrayList<Student> studentArrayList = new ArrayList<Student>();
        studentArrayList.addAll(Arrays.asList(students));
        Collections.sort(studentArrayList, sortingStudentByFIO);
        System.out.print("Sorted by name: ");
        for (Student s : studentArrayList) {
            System.out.print(s.getFio() + " ");
        }
    }

    public void sortByID() {
        for (int i = 0; i < students.length; i++) {
            IDNumber[i] = students[i].getId();
        }

        for (int i = 0; i < IDNumber.length - 1; i++) {
            for (int j = IDNumber.length - 1; j > i; j--) {
                if (IDNumber[j - 1] > IDNumber[j]) {
                    double tmp = IDNumber[j - 1];
                    IDNumber[j - 1] = IDNumber[j];
                    IDNumber[j] = (int) tmp;
                }
            }
        }
        System.out.print("Sorted by id: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(IDNumber[i] + " ");
        }
    }


    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int[] getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(int[] IDNumber) {
        this.IDNumber = IDNumber;
    }


    public static void main(String[] args) {
        Students students = new Students();
        students.sortByID();
        students.searchByName("st5");
        students.sortByName();
    }
}