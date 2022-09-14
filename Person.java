package Person;
/**
 * class: Person
 * author: Muketoi Celestino
 * course: ITEC 2150 - 09
 * date: September 13, 2022
 * description: This program will create a model of a person to be used for object creation in PersonTesterClass
 * Attributes: Name, Age, eye Color
 *
 */
public class Person {
    private String name;
    private int age;
    private String eyeColor;

    // Constructors
    public Person() {
        this.name = "Muketoi";
        this.age = 20;
        this.eyeColor = "Brown";
    }

    public Person(String name, int age, String eyeColor){
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
    }

    // Getters and Setters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String setEyeColor(){
        return eyeColor;
    }
    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    // Talk method
    public void talk() {
        System.out.println("Welcome, coders! I am " + name);
    }
   @Override
        public String toString(){
        return "Name: " + name +"\nAge: " + age + "\nEyeColor: " + eyeColor;
   }
}
