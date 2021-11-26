import java.util.LinkedList;

public class part2 {

    public static void main(String[] args) {

        String str1 = new String("Добрый день");
        String str2 = new String("Сегодня в Москве 8 градусов тепла");
        String str3 = new String("Облачно с прояснениями");
        String str4 = new String("Хорошего дня!");

        LinkedList<String> earlBio = new LinkedList<>();
        earlBio.add(str1);
        earlBio.add(str2);
        earlBio.add(str3);
        earlBio.add(str4);

        System.out.println(earlBio);

    }
}