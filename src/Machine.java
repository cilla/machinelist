
public class Machine {

	/** Skapar en maskin med nummer nbr. */ 
	public Machine(int nbr)
	
	/** Tar reda på hur många minuter maskinen är schemalagd. */ 
	public int getScheduledTime()
	
	/** Tar bort alla jobb från maskinen och nollställer schemalagd tid. */ 
	public void reset()
	
	/** Schemalägger jobbet job till maskinen. */ 
	public void addJob(Job job)
	
	/** Returnerar en sträng som representerar maskinen. Exempel: 
	 * Om maskinens nr är 3 och den har schemalagts med jobben med nr 3 4 5 7 som tillsammans skulle 
	 * ta 17 minuter att slutföra ska följande sträng returneras: 
	 * "Maskin nr 3 har tilldelats jobb nr: 3 4 5 7 och är klar efter 17 min." */
	public String toString()
	
}
