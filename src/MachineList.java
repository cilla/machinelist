
public class MachineList {

	/** Skapar nbrMachines st maskiner att fördela jobb på. Maskinerna ska numreras 1, 2, 3, ... */
	public MachineList(int nbrMachines)
	
	/** Nollställer maskinerna och schemalägger jobben i vektorn jobs 
	 * på de olika maskinerna enligt LPT-algoritmen. Jobben förutsätts vara sorterade efter avtagande tidsåtgång. 
	 * */
	public void schedule(Job[] jobs)
	
	/** Skriver ut information om alla maskiner. För varje maskin ska en rad med en sträng som 
	 * representerar maskinen skrivas ut. */
	public void print()
	
}
