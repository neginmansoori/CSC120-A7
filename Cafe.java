/* This is a stub for the Cafe class */
public class Cafe extends Building {

    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory


 /**
  * cafe object constructor
  * @param string name
  * @param string address
  * @param int nFloors
  * @param int nCoffeeOunces
  * @param int nSugarPackets
  * @param int nCreams
  * @param int nCups
  */
    public Cafe(String name, String address, int nFloors, int nCoffeeOunces,
    int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("You have built a cafe: ☕");
    }
 /**
  * sells coffee by reducing the inventory size
  * @param size,nSugarPackets,nCreams,cafe
  */
    public void sellCoffee(int size,int nSugarPackets, int nCreams){
        this.nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        this.nCups -= 1;
        if (this.nCoffeeOunces <=0 || this.nSugarPackets <=0 || this.nCreams<=0 || this.nCreams <= 0 || this.nCups <=0){
            restock(size, nSugarPackets, nCreams, 1);
        }
        System.out.println("Here is your coffee!");
    }
 /**
  * resets the inventory values to the input value
  * @param int nCoffeeOunces
  * @param int nSugarPackets
  * @param int nCreams
  * @param int nCups
  */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
    }

    public void showOptions() {
        System.out.println("Available options at " + this.name + ":\n + enter() \n + exit() \n + goUp() \n + goDown()\n + goToFloor(n)\n + sellCoffee(int size,int nSugarPackets, int nCreams)\n + restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups)");
    }
    
    public static void main(String[] args) {
        Cafe compass = new Cafe("compass", "neilson", 1, 1,1,1,1);
        compass.sellCoffee(1,1,1);
        compass.sellCoffee(2, 2, 0);
    }
    
}
