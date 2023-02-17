import java.util.Date;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String maritalStatus;
    private String phone;
    private String address;

    public Person(String firstName, String lastName, int age, String gender, String maritalStatus, String phone, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.phone = phone;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
