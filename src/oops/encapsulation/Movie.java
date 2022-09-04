package oops.encapsulation;

public class Movie {

    //in class, we have two types of variables (global vs. local)
    private String movieName; //global variable (variable that you can reuse within the class)
    //you can use in multiple methods in this class, but not in other classes
    //setting this private, means this string moviename is only accessible in the class movie
    //QUESTION: NOW THAT IT IS PRIVATE; how can we use this variable without using this movieName?
    //ANSWER: by creating getter and setter
    public String getMovieName() {
        return movieName;
        //it will return String// return getMovieName = movieName
    }
    public void setMovieName(String movieName) {
        this.movieName = movieName;
        //you need to equalize the global variable (private)
        //cc to a local variable (movieName)
        //if you do not put "this", it will think you are referring to local variable(the movieName in paranthesis)
        //"this" keyword = java will always look at the global variable
    }
    public void createMovie(){
        movieName = "fast and furious";
        //you can still use the variable, "movieName" bc it is a global variable
        System.out.println(movieName);
    }
    public void watchMovie(){
        movieName = "the mask";
        String time = "8pm";
        //we are going to use this variable, time - LOCAL VARIABLE
        //LOCAL VARIABLE - only used in that method
        //local variable is always prioritized
        System.out.println("I will watch "+movieName+ "at" + time);
        //we are using this variable to print this statement

    }
    //data hiding
    //public is access modifier/ accessible from all packages in the project
    //private = can not access it outside the class
    //// String movieName;
    //we created a string called movie name
    //what if we don't want this variable to be used outside the class
    //change it to private

}
