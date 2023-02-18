import java.util.Date;

public class PersonBuilder {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String maritalStatus;
    private String phone;
    private String address;

    public PersonBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    public PersonBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    public PersonBuilder age(int age) {
        this.age = age;
        return this;
    }
    public PersonBuilder gender(String gender){
        this.gender = gender;
        return this;
    }
    public PersonBuilder maritalStatus(String status){
        this.maritalStatus = status;
        return this;
    }
    public PersonBuilder phone(String phone) {
        this.phone = phone;
        return this;
    }
    public PersonBuilder address(String address) {
        this.address = address;
        return this;
    }
    public Person build() {
        Person person =  new Person(firstName,lastName,age,gender,maritalStatus,phone,address);
        validateUserObject(person);
        return person;
    }
    private void validateUserObject(Person person) {
        if(person.getFirstName() == null){
            throw new RuntimeException("Person object cannot be created with FirstName");
        }
    }
}
