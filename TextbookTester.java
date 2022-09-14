package Textbook;

public class TextbookTester {
    public static void main(String[] args) {
        Textbook trial1 = new Textbook();
        Textbook trial2 = new Textbook("Poppy goes to town", "King Daniel", 142, 2006);

        System.out.println(trial1);
        System.out.println(trial2);

        System.out.println();

        trial1.setAuthor("Pete Muki");
        System.out.println(trial1);
    }
}