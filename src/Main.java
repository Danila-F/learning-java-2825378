public class Main {

    public static void main(String[] args) {
        PhoneContact contact1 = new PhoneContact("John Doe", new PhoneNumber("123-456-7890"), "dffdfdsfd@fdsfds.com");
        PhoneContact contact2 = new PhoneContact("Gim B", new PhoneNumber("+370251476533"));
        PhoneContact contact3 = new PhoneContact("John Doe", "cvxvxc@plj.com");
        System.out.println(contact1);
        System.out.println(contact2);
        System.out.println(contact3);
        contact1.editName("Hipp Drill");
        contact2.editEmail("aaaaaa@aaa.aaa");
        contact3.editPhoneNumber(new PhoneNumber("1100"));
        System.out.println(contact1);
        System.out.println(contact2);
        System.out.println(contact3);
    }
}
