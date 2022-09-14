package Textbook;

public class TextbookTester {
    public static void main(String[] args) {
        Textbook trial1 = new Textbook();
        Textbook trial2 = new Textbook("Poppy goes to town", "King Daniel", 142, 2006);

        System.out.println(trial1);
        System.out.println(); // Adds new line

        System.out.println(trial2);
        System.out.println(); // Adds new line

        trial1.setAuthor("Pete Muki");
        System.out.println(trial1);

        System.out.println(); // Adds New Line
        System.out.println("The author of '" + trial2.getTitle() + "' is " + trial2.getAuthor());

        trial2.message();
    }
}
