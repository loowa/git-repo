
import java.util.HashSet;
import java.util.Random;


/**
 * Created by Фролагин Андрей on 13.11.2016.
 */
public class MainClass {
    public static void main(String[] args) {
        taskOne();
        taskTwo();
    }

    private static void taskTwo() {
        PhoneBook.getPhoneBook();
        PhoneBook.addRecord("Frolagin", "12345678", "djfhsk@sdffsd.ru");
        PhoneBook.addRecord("Frolagin2", "56781234", "djfdffsdhsk@s.ru");
        System.out.println(PhoneBook.getSurname(1) + " " + PhoneBook.getEmail(1));
        System.out.println(PhoneBook.getSurname(2) + " " + PhoneBook.getPhone(2));
    }

    private static void taskOne() {
        Random rnd = new Random();
        HashSet<String> hashStr = new HashSet<>();
        String someText = "один два три четыре пять шесть семь восемь девять десять одиннадцать двенадцать тринадцать четырнадцать пятнадцать шестнадцать семнадцать восемнадцать девятнадцать двадцать";
        String[] someTextArr = someText.split(" ");
        String[] arr = new String[rnd.nextInt(10) + 20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = someTextArr[rnd.nextInt(someTextArr.length)];
            hashStr.add(arr[i]);
        }
        for (String str:hashStr) {
            int i = 0;
            for (String strArr:arr) {
                if(str.equals(strArr)) i++;
            }
            System.out.println(str + " повторяется: " + i + " раз");
        }
    }
}
