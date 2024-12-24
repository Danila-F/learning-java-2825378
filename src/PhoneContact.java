public class PhoneContact {
    private String name;
    private PhoneNumber phoneNumber;
    private String email;

    public PhoneContact(String name, PhoneNumber phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public PhoneContact(String name, String email) {
        this(name, new PhoneNumber(null), email);
    }

    public PhoneContact(String name, PhoneNumber phoneNumber) {
        this(name, phoneNumber, null);
    }

    public void editName(String name) {
        this.name = name;
    }

    public void editPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void editEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        return "Name: " + name + ", Phone Number: " + phoneNumber.getPhoneNumber() + ", Email: " + email;
    }
}
