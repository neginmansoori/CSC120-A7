import java.util.ArrayList;

public class House extends Building{

  /** Arraylist of Strings consisting of residents */
  private ArrayList<String> residents;
  /** boolean of whether the house has a dining room */
  private boolean hasDiningRoom;

 /**
  * Default constructor for 'House' with default of having 1 floor
  */
  public House (){
    super("Name unknown" , "Address unknown", 1);
    this.residents = new ArrayList<String>();
    System.out.println("You have built a house: 🏠");
  }

  /**
   * Overloaded constructor with address only
   * @param String address
   */
  public House (String address){
    this(); // does this call the House class constructor or the parent class constructor?
    // why doesn't the line above initialize the arraylist for this constructor?
    this.address = address;
    this.residents = new ArrayList<String>();
  }

 /**
 * full constructor for 'House' class with the following attributes
 * @param string name
 * @param string address
 * @param int nFloors
 * @param boolean hasDiningRoom
 * @param ArrayList residents
 */
  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors); // super or this(name, address, nFloors)?
    this.hasDiningRoom = hasDiningRoom;
    this.residents = new ArrayList<String>();
  }

 /**
 * method to check whether the house has a dining room
 * @param house
 * @return boolean: hasDiningRoom
 */
  public boolean hasDiningRoom(){
    return this.hasDiningRoom;
  }
 /**
 * returns the number of residents
 * @param house
 * @return int: number of residents
 */
  public int nResidents(){
    return this.residents.size();
  }
 /**
 * adds person to the list of residents
 * @param name, house
 */
  public void moveIn(String name){
    if (this.residents.contains(name)){
      throw new RuntimeException(name + "is already a resident");
    }
    this.residents.add(name);
    System.out.println(name +" has moved in this house.");
  }

 /**
 * removes person from the list of residents
 * @param name, house
 */
  public String moveOut (String name){
    if (!this.residents.contains(name)){
      throw new RuntimeException(name + "doesn't live here");
    }
    this.residents.remove(name);
    return name;
  }
 /**
  * checks if a person lives in the building
  * @param person, house
  * @return boolean: isResident
  */
  public boolean isResident(String person){
    return (this.residents.contains(person));
  }

  public void showOptions(){
    System.out.println("available options at "+this.name+ ":\n + enter() \n + exit() \n + goUp() \n + goDown()\n + goToFloor(n)\n + hasDiningRoom()\n + nResidents() \n + movein(String name) \n + moveOut(String name)  \n + isResident");
  }

  public static void main(String[] args) {
    House Wilson = new House("Wilson", "Smith college", 3, true);
    Wilson.moveIn("Steph");
    System.out.println(Wilson.isResident("Steph"));
    Wilson.moveOut("Steph");
    System.out.println(Wilson.isResident("Steph"));
    Wilson.showOptions();
    House Wilder = new House("1 Paradise road");
    Wilder.moveIn("Mia");
    Wilder.isResident("Mia");
  }
}