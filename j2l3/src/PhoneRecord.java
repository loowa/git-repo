
public class PhoneRecord {
    protected String surname;
    protected String email;
    protected String phone;


    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public PhoneRecord(String surname, String email, String phone) {
        this.surname = surname;
        this.email = email;
        this.phone = phone;
    }
    public void printRecord(int id){
        System.out.println("[" + id + "]     " + surname + " " + phone + " " + email);
    }
}
