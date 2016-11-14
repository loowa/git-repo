import java.util.HashMap;

/**
 * Created by User on 13.11.2016.
 */
public class PhoneBook {
    private static PhoneBook phoneBook = new PhoneBook();
    private static HashMap<Integer,PhoneRecord> records = new HashMap<>();
    private static int count = 1;

    public PhoneBook() {
    }
    public static PhoneBook getPhoneBook(){
        return phoneBook;
    }
    public static void addRecord(String surName, String phone, String email){
        records.put(new Integer(count++),new PhoneRecord(surName, phone, email));
    }
    public static String getPhone(int id){
        return records.get(new Integer(id)).getPhone();
    }
    public static String getEmail(int id){
        return records.get(new Integer(id)).getEmail();
    }
    public static String getSurname(int id){
        return records.get(new Integer(id)).getSurname();
    }
}
