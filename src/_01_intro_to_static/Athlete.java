package _01_intro_to_static;

public class Athlete {
    static int nextBibNumber;
    static String raceLocation = "New York";
    static String raceStartTime = "9.00am";

    String name;
    int speed;
    int bibNumber;
  
    Athlete (String name, int speed){
        this.name = name;
        this.speed = speed;
        bibNumber =nextBibNumber;
        nextBibNumber++;
    }

    public static void main(String[] args) {
        //create two athletes
        //print their names, bibNumbers, and the location of their race. 
    	Athlete Joe = new Athlete("Joe",50); 
    	System.out.println(Joe.bibNumber);
    	Athlete Bob = new Athlete("Bob",51);
    	System.out.println(Bob.bibNumber);
    	System.out.println(Joe.raceLocation);
    }
}
