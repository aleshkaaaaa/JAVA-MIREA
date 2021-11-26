import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void print() {

        try (FileReader fileReader = new FileReader("exFile.txt")) {
            System.out.println("New text from the file:");
            Scanner scan = new Scanner(fileReader);
            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public static void main(String[] args) {


        try (FileWriter fileWriter_1 = new FileWriter("exFile.txt", false)) {
            System.out.println("Enter the text that will be added to the file:");
            Scanner in = new Scanner(System.in);
            String str = in.nextLine();
            fileWriter_1.write(str);
            fileWriter_1.close();
        } catch (IOException e) {
            e.getMessage();
        }

        print();


        try (FileWriter fileWriter_2 = new FileWriter("exFile.txt", false)) {
            System.out.println("Enter the text that will replace text in the file:");
            Scanner in = new Scanner(System.in);
            String str = in.nextLine();
            fileWriter_2.write(str);
            fileWriter_2.close();

        } catch (IOException e) {
            e.getMessage();
        }

        print();


        try (FileWriter fileWriter_3 = new FileWriter("exFile.txt", true)) {
            System.out.println("Enter the text that will be added to the text in the file:");
            Scanner in = new Scanner(System.in);
            String str = in.nextLine();
            fileWriter_3.write(str);
            fileWriter_3.close();

        } catch (IOException e) {
            e.getMessage();
        }

        print();
    }
}