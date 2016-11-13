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
    }

    private static void taskOne() {
        Random rnd = new Random();
        HashSet<String> hashStr = new HashSet<>();
        String someText = "один два три четыре пять шесть семь восемь девять десять одиннадцать двенадцать тринадцать четырнадцать пятнадцать шестандцать семнадцать восемнадцать девятнадцать двадцать";
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
