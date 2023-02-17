public class Main {
    public static void main(String[] args) {

		SetterPerson person3 = new SetterPerson();
		person3.setFirstName("XYZ");
		person3.setLastName("abc");
		person3.setAge(65);
		person3.setAddress("Hyderabad");
		person3.setMaritalStatus("Married");
		System.out.println(person3.toString());
    }
}