package _05_netflix;

public class Netflix {
public static void main(String[] args) {
	Movie fort = new Movie("Fortnite Twilight", 0);
	Movie mine = new Movie("Minecraft",10);
	Movie john = new Movie("John Wick:4",3);
	Movie shrek = new Movie("Shrek 5",69);
	Movie blox = new Movie("Roblox",1);
	blox.getTicketPrice();
	fort.getTicketPrice();
	mine.getTicketPrice();
	john.getTicketPrice();
	shrek.getTicketPrice();
	NetflixQueue q = new NetflixQueue();
	q.addMovie(blox);
	q.addMovie(fort);
	q.addMovie(mine);
	q.addMovie(john);
	q.addMovie(shrek);
	q.printMovies();
	System.out.println("The best movie is " + q.getBestMovie());
	q.sortMoviesByRating();
	System.out.println("The second best movies is "+q.getMovie(1));
}
}
