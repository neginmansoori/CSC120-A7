import java.util.ArrayList;

public class CampusMap {

    ArrayList<Building> buildings;

    /* Default constructor, initializes empty ArrayList */
    public CampusMap() {
        buildings = new ArrayList<Building>();
    }

    /**
     * Adds a Building to the map
     * @param b the Building to add
     */
    public void addBuilding(Building b) {
        System.out.println("Adding building...");
        buildings.add(b);
        System.out.println("-->Successfully added " + b.getName() + " to the map.");
    }

    /**
     * Removes a Building from the map
     * @param b the Building to remove
     * @return the removed Building
     */
    public Building removeBuilding(Building b) {
        System.out.println("Removing building...");
        buildings.remove(b);
        System.out.println("-->Successfully removed " + b.getName() + " to the map.");
        return b;
    }

    public String toString() {
        String mapString = "DIRECTORY of BUILDINGS";

        for (int i = 0; i < this.buildings.size(); i ++) {
            mapString += "\n  " + (i+1) + ". "+ this.buildings.get(i).getName() + " (" + this.buildings.get(i).getAddress() + ")";
        }
        return mapString;
    }

    public static void main(String[] args) {
        CampusMap myMap = new CampusMap();
        myMap.addBuilding(new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Bass Hall", "4 Tyler Court Northampton, MA 01063", 4));
        myMap.addBuilding(new House ("Wilson House" , "1 Paradise Road" , 4, true, false));
        myMap.addBuilding(new Library("Neilson Library", null, 4, true));
        myMap.addBuilding(new Cafe("The Compass", "Neilson Library"));
        myMap.addBuilding(new Library("Josten Library", "Mendenhall", 2, false));
        myMap.addBuilding(new House ("Cutter House" , "10 Prospect St" , 3, true, true));
        myMap.addBuilding(new Building("Boathouse" , null));
        myMap.addBuilding(new Building("Mendenhall", "122 Green St"));
        myMap.addBuilding(new House("Northrop House" , "49 Elm Street" , 4, true, false));
        myMap.addBuilding(new House("Ziskind House", "10 Prospect St.", 3, true, true));
        myMap.addBuilding(new Building("Sage Hall" , "144 Green Street"));
        System.out.println(myMap);
    }
    
}
