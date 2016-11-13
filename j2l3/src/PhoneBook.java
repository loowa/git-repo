import java.util.ArrayList;

/**
 * Created by User on 13.11.2016.
 */
public class PhoneBook {
    private static PhoneBook phoneBook = new PhoneBook();
    private static ArrayList<PhoneRecord> records;

    public PhoneBook() {
    }
    public static PhoneBook getPhoneBook(){
        return phoneBook;
    }
    public static void addRecord(String surName, String phone, String email){
        records.add(new PhoneRecord(surName, phone, email));
    }
}
