package labact3;

/**
 * Class Hour. 
 * 
 *  @author (              ) 
 *  @version (Year 2014-15)
 */
public class Hour {
    // ATTRIBUTES:
	private int h;
	private int m;


    // CONSTRUCTORS:
   /** Hour corresponding to hh hours and mm minutes.
     * Precondition: 0<=hh<24, 0<=mm<60
     */
	public Hour(int hh, int mm) { 
		h = hh;
		m = mm;	
	}


   
   /** Current UTC Hour (hours and minutes)
      */
	public Hour() {
		
}
	
    // CONSULTORS AND MODIFYERS:
   /** Returns hour from current Hour object */
	public int getH() {

	}


   /** Returns minutes from current Hour object */
	public int getM() {

}
   
   /** Modifies hour of current Hour object */
  public void setH(int hh) {
}
   
   /** Modifies minutes of current Hour object */
public void setM(int mm) {
}   
   
   // OTHER METHODS:
   /** Returns current Hour object in format "hh:mm"
     */
public String toString() {
}

   
  /** Returns amount of minutes from 00:00 to current Hour object
    */
  public int toMinutes(){
  }
  

  /** Returns true only if o and current Hour object represent the same hour
    */
public boolean equals(Object o) {
}


  /** Compares chronologically current Hour object and hour; result is:
    *      - negative when current Hour is previous to hour
    *      - zero if they are equal
    *      - positive when current Hour is posterior to hour
    */
public int compareTo(Hour hour) {
}

  // EXTRA ACTIVITY:      
  /** Returns Hour from textual data
   *  in format "hh:mm".
   */ 
}

