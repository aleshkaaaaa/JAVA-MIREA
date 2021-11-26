import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        System.out.println("Enter five numbers:");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr1[i] = in.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            list.add(arr1[i]);
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
