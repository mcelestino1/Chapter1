package Person;

public class PersonTester {
    public static void main(String[] args) {
        Person person1 = new Person();

        System.out.println(person1.toString());

        person1.setName("Howard Roark");
        person1.talk();

    }
}
