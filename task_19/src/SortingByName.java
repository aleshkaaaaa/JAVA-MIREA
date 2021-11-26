import java.util.Comparator;


public class SortingByName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getFio().compareTo(o2.getFio());
    }

}