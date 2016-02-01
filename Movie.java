package Movies;

import java.util.ArrayList;

public class Movie {
	private String title;
	private enum Genre {ACTION, THRILLER, HORROR, SCI_FI, ROMANTIC, COMEDY, DRAMA};
	Genre genre;
	private long duration;
	private double rate;
	private ArrayList<Person> cast;
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public Genre getGenre(){
		return genre;
	}
	
	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public ArrayList<Person> getCast() {
		return cast;
	}

	public void setCast(ArrayList<Person> cast) {
		this.cast = cast;
	}
	
	public String toXMLTag(){
		String title = Tools.toXMLTag("title", this.title);
		String genre = Tools.toXMLTag("genre", this.genre.toString());
		String duration = Tools.toXMLTag("title", Long.toString(this.duration));
		String rate = Tools.toXMLTag("rate", Double.toString(this.rate));
		String cast = Tools.toXMLTag("cast", castToXML(this.cast));
		return Tools.toXMLTag("Movie", title + genre + duration + rate + cast);
	}
	
	private static String castToXML(ArrayList<Person> people){
		String personToTag = "";
		for (Person person: people){
			personToTag += person.toXMLString();
		}
		return personToTag;
		
	}
}
