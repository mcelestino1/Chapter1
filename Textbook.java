package Textbook;
/**
 * class: Textbook
 * author: Muketoi Celestino
 * course: ITEC 2150 - 09
 * date: September 13, 2022
 * description: This program will create a model of a textbook to be used for object creation in TextbookTester class
 * Attributes: Title of Book, Name of author, Number of Pages, Year published.
 */
public class Textbook {

  // ATTRIBUTES
    private String title;
    private String author;
    private int pages;
    private int year;

  // CONSTRUCTORS
    public Textbook(){      //no-arg constructor
        this.title = "The Greatest Book of All Times";
        this.author = "Omega Gonzalez";
        this.pages = 391;
        this.year = 2002;
    }

    public Textbook(String title, String author, int pages, int year){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.year = year;
    }

  // GETTERS AND SETTERS

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void message(){
        System.out.println("Thank you for choosing to read the textbook " + title);
    }

    @Override
    public String toString() {
        return "Textbook Title: " + title + "\nName of Author: " + author + "Number of Pages: " + pages + "\nYear: " + year;
    }

}

