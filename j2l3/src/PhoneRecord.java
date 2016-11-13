
public class PhoneRecord {
    protected String surname;
    protected String email;
    protected String phone;
    protected int id;
    protected static int count;
    public PhoneRecord(String surname, String email, String phone) {
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        count++;
        this.id = count;
    }
}
