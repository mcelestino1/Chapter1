package Movie;

public class MovieTester {
    public static void main(String[] args) {
        Movie trial = new Movie();
        System.out.println(trial);

        trial.setTitle("Lion King");
        System.out.println("\n" + trial);

        Movie trial2 = new Movie("Batman", "Unknown", 2016, "Raymond Knowitall");
        System.out.println("\n" + trial2);
    }
}
