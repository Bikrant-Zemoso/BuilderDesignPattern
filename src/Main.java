public class Main {
    public static void main(String[] args) {

		Person person1 = new PersonBuilder().firstName("Bikrant")
				.lastName("Kumar")
				.age(25)
				.address("Jamtara")
				.build();
		System.out.println(person1);

//		it will throw expception as the first name is empty
//		Person person2 = new PersonBuilder()
//				.lastName("Kumar")
//				.age(25)
//				.build();
//		System.out.println(person2);


    }
}