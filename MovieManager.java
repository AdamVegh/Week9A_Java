package Movies;

import java.util.List;
import java.util.ArrayList;

public class MovieManager {
	static final String XML_FILE_PATH = "XML/movies.xml";
	public static void main(String[] args){
		Person[] actors = new Person[5];
		
		actors[0] = new Person();
		Person diCaprio = actors[0];
		diCaprio.setFirstName("Leonardo");
		diCaprio.setLastName("Di Caprio");
		diCaprio.setGender(Gender.MALE);
		diCaprio.setHasOscar(false);
		diCaprio.setHasGoldenGlobe(true);
		
		actors[1] = new Person();
		Person winslet = actors[1];
		winslet.setFirstName("Kate");
		winslet.setLastName("Winslet");
		winslet.setGender(Gender.FEMALE);
		winslet.setHasOscar(true);
		winslet.setHasGoldenGlobe(true);
		
		actors[2] = new Person();
		Person reeves = actors[2];
		reeves.setFirstName("Keanu");
		reeves.setLastName("Reeves");
		reeves.setGender(Gender.MALE);
		reeves.setHasOscar(false);
		reeves.setHasGoldenGlobe(false);
		
		actors[3] = new Person();
		Person moss = actors[3];
		moss.setFirstName("Carrie-Anne");
		moss.setLastName("Moss");
		moss.setGender(Gender.FEMALE);
		moss.setHasOscar(false);
		moss.setHasGoldenGlobe(false);
		
		actors[4] = new Person();
		Person cotillard = actors[4];
		cotillard.setFirstName("Marion");
		cotillard.setLastName("Cotillard");
		cotillard.setGender(Gender.FEMALE);
		cotillard.setHasOscar(true);
		cotillard.setHasGoldenGlobe(true);
		
		ArrayList<Movie> movies = new ArrayList<Movie>(3);
		List<Person> cast = new ArrayList<Person>();
		
		movies.add(new Movie());
		Movie titanic = movies.get(0);
		titanic.setTitle("Titanic");
		titanic.setGenre(Genre.ROMANTIC);
		titanic.setDuration(200);
		titanic.setRate(4.8);
		cast.add(diCaprio);
		cast.add(winslet);
		titanic.setCast(cast);
		
		cast.clear();
		
		movies.add(new Movie());
		Movie theMatrix = movies.get(1);
		theMatrix.setTitle("The Matrix");
		theMatrix.setGenre(Genre.SCI_FI);
		theMatrix.setDuration(140);
		theMatrix.setRate(5.0);
		cast.add(reeves);
		cast.add(moss);
		theMatrix.setCast(cast);
		
		cast.clear();
		
		movies.add(new Movie());
		Movie inception = movies.get(2);
		inception.setTitle("Inception");
		inception.setGenre(Genre.SCI_FI);
		inception.setDuration(160);
		inception.setRate(5.0);
		cast.add(cotillard);
		cast.add(diCaprio);
		inception.setCast(cast);
	}
}
