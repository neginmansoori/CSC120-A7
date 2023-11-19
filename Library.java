/* This is a stub for the Library class */

import java.util.Hashtable;
import java.util.Set;

public class Library extends Building {

  private Hashtable<String, Boolean> collection;
  public boolean hasElevator;

  /**
   * Library object constructor
   * @param name
   * @param address
   * @param nFloors
   * @param collection
   */
  public Library(String name, String address, int nFloors, boolean hasElevator) {
    super(name, address, nFloors);
    this.hasElevator = hasElevator;
    this.collection = new Hashtable<String, Boolean>();
    System.out.println("You have built a library: 📖");
  }
 /**
  * constructor with name, address, hasElevator
  * @param name
  * @param address
  * @param hasElevator
  */
  public Library(String name, String address, boolean hasElevator) {
    super(name, address, 1);
    this.hasElevator = hasElevator;
    this.collection = new Hashtable<String, Boolean>();
    System.out.println("You have built a library: 📖");
  }

 /**
 * adds a book to the book collection hashtable
 * @param title
 */
  public void addTitle(String title){
    this.collection.put(title, true);
  }
 /**
 * removes a book from collection
 * @param title
 * @return book title
 */
  public String removeTitle(String title){
    this.collection.remove(title);
    return (title);
  }
 /**
 * checking out a book by changing its availabality to 'false'
 * @param title
 */
  public void checkOut(String title){
    if (!this.collection.contains(title)){
      throw new RuntimeException(title+ " isn't in our collection.");}
    this.collection.replace(title, false); // will replace key value
  }
 /**
 * checking in a book by changing its availabality to 'true'
 * @param title
 */
  public void returnBook(String title){
    this.collection.replace(title, true);
  }
 /**
  * checks if a book is in the collection
  * @param string title
  * @return boolean: true if the title in the collection
  */
  public boolean containsTitle(String title){
    return this.collection.contains(title);
  }
 /**
 * checks if the status of a book is available
 * @param string title
 * @return boolean: true if book is not checked out
 */
  public boolean isAvailable(String title){
    return this.collection.get(title);
  }
 /**
  * prints collection
  * @param library
  * @return set
  */
  public Set printCollection(){
    return this.collection.entrySet();
  }

  /** prints the methods available for this class */
  public void showOptions (){
    System.out.println("available options at "+this.name+ ":\n + enter() \n + exit() \n + goUp() \n + goDown()\n + goToFloor(n) \n + addTitle(String title) \n + removeTitle(String name) \n + checkOut(String title)\n + returnBook (String title)\n + containsTitle(String title) \n + isAvailable(String title) \n + printCollection()");
  }

 /**
  * goes up one stair by foot
  */
  public void goUp() {
      this.goToFloor(this.activeFloor + 1);
    }

  /**
  * goes down one stair by foot
  */
  public void goDown() {
    this.goToFloor(this.activeFloor - 1);
  }

 /**
  * goes to non-adjacent floors
  * @param int number of the destination floor
  */
  public void goToFloor(int floorNum) {
    if (floorNum < 1 || floorNum > this.nFloors) {
        throw new RuntimeException("Invalid floor number. Valid range for the elevator is 1-" + this.nFloors +".");
    }
    if (this.hasElevator){
      throw new RuntimeException(this.name + " doesn't have any elevators. Please use the stairs.");
    }
    this.goToFloor(floorNum);
    System.out.println("You are now on floor #" + floorNum + " of " + this.name);
    }

    public static void main(String[] args) {
      Library neilson = new Library("neilson", "smith", 3, false);
      neilson.addTitle("Harry Potter");
      neilson.addTitle("Flatland");
      neilson.checkOut("Harry Potter"); //this gives error
      System.out.println(neilson.printCollection());
    }
  }