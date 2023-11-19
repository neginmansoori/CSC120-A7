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
 * adds a book to the book collection hashtable
 * @param title, library
 */
  public void addTitle(String title){
    this.collection.put(title, true);
  }
 /**
 * removes a book from collection
 * @param title, library
 * @return book title
 */
  public String removeTitle(String title){
    this.collection.remove(title);
    return (title);
  }
 /**
 * checking out a book by changing its availabality to 'false'
 * @param title, library
 */
  public void checkOut(String title){
    if (!this.collection.contains(title)){
      throw new RuntimeException(title+ " isn't in our collection.");}
    this.collection.replace(title, false); // will replace key value
  }
 /**
 * checking in a book by changing its availabality to 'true'
 * @param title, library
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
  public void showOptions (){
    System.out.println("available options at "+this.name+ ":\n + enter() \n + exit() \n + goUp() \n + goDown()\n + goToFloor(n) \n + addTitle(String title) \n + removeTitle(String name) \n + checkOut(String title)\n + returnBook (String title)\n + containsTitle(String title) \n + isAvailable(String title) \n + printCollection()");
  }

  /// I didn't understand what in the goToFloor(int) function needed to be modified. It made more sense for me to override and overload goUp() and goDown()
  
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
  * 
  * @param int floorNum
  */
  public void goUp(int floorNum) {
    if (floorNum < 1 || floorNum > this.nFloors) {
        throw new RuntimeException("Invalid floor number. Valid range for the elevator is 1-" + this.nFloors +".");
    }
    if (this.hasElevator){
      throw new RuntimeException(this.name + " doesn't have any elevators. Please use the stairs.");
        
      }
    this.goToFloor(floorNum);
    System.out.println("You are now on floor #" + floorNum + " of " + this.name);
    }

  public void goDown(int floorNum) {
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