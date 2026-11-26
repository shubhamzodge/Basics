package HamshmapInternal;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Objects;

public class first {
    public static void main(String [] args){
        Movie movie = new Movie("RHTM");
        Movie movie2 = new Movie("RHTM");
        HashMap<Movie,String>hmap = new HashMap<Movie,String>();

        hmap.put(movie,"maddy");
        hmap.put(movie,"SRK");
        System.out.println(hmap);


    }
}
class Movie{
    String name;
    //constructor
    public Movie(String name){
        this.name = name;
    }
    //hashcode
    public int hashCode(){
        System.out.println("**********");
        return Objects.hash(this.name);
    }
    //toString
    public String toString(){
        return "name "+ name;
    }
    //equals
    public boolean equals(Object obj){
        System.out.println("------------");
        Movie m = (Movie)obj;
        return this.name.equals(m.name);
    }
}
