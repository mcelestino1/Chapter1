package Movie;

/**
 * class: Movie
 * written by: Muketoi Celestino
 * date: September 8, 2022
 * version: 1.2
 *
 * Description: this Movie type class has four attributes
 *              attribute/data part:
 *                  title of a movie
 *                  released year
 *                  name of a director
 *                  name of the leading role actor or actress.
 *
 *           constructors
 *              (1) no-arg constructors with default value you want to assign but you must
 *              apply a constructor with all attributes as parameters.
 *              (2)constructor takes all attributes
 *
 *           methods
 *              getters, setters, toString
 *              toString method should display information about the movie in a nice format.
 *
 */
public class Movie {
    private String title;
    private String director;
    private int year;
    private String lrole;

    public Movie(){
        this("Twilight", "King-Kong", 2021, "Leila Killua");
    }
    public Movie(String title, String director, int year, String leadRole){
        this.title = title;
        this.director = director;
        this.year = year;
        this.lrole = leadRole;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String getDirector(){
        return director;
    }
    public void setDirector(String director){
        this.director = director;
    }

    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }

    public String getLrole(){
        return lrole;
    }
    public void setLrole(String leadRole){
        this.lrole = leadRole;
    }
  @Override
    public String toString(){
        return "Movie Title: " + title + "\nDirector: " + director + "\nRelease year: " + year + "\nLeading Role Actor/Actress: " + lrole;
  }
}
