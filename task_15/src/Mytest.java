import java.util.ArrayList;
import java.util.List;

public class Mytest {
    public static void main(String[] args) {
        Mylist<Integer> list = new Mylist<Integer>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }

    }
}
