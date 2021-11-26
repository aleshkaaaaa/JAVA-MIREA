import java.util.ArrayList;
import java.util.List;

public class part1 {

    public static void main(String []args){
        List <Integer> list = new ArrayList<Integer>();
        for (int i=0;i<13;i++){
            list.add(i);
        }
        for (Integer list1 : list){
            System.out.println(list1);
        }
        list.remove(8);
        list.remove(2);
        list.remove(4);
        for (Integer list1 : list){
            System.out.println(list1);
        }
    }
}