package oops.encapsulation;

public class RunMovie {

    public static void main(String[] args) {
//        Movie myMovie = new Movie();
//        myMovie.movieName = "Lord of Rings";
//        System.out.println(myMovie.movieName);

//        myMovie.movieName = "harry potter";
//        System.out.println(myMovie.movieName);
        //can change values twice
        //this is if it were public ^^^, we would be able to change the name and access myMovie

        //since myMovie is private...
        Movie myMovie = new Movie();
        //this is the object
        myMovie.setMovieName("lord of rights");
        System.out.println(myMovie.getMovieName());
        myMovie.setMovieName("eliza");
        System.out.println(myMovie.getMovieName());
        //now you can access the movie name ^^ by using the getMovieName
    }
}
