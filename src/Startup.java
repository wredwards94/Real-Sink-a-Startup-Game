import java.util.ArrayList;

public class Startup {
    private ArrayList<String> locationCells; // an ArrayList of the cell locations
    private String name; // the Startup's name

    public void setLocationCells(ArrayList<String> loc){
        // a setter method that updates the Startup's location.
        // (Random location provided by the GameHelper placeStartup method)
        locationCells = loc;
    }

    public void setName(String n){
        // setter method for name
        name = n;
    }

    public String checkYourself(String userInput){
        String result = "miss";
        /* The Arraylist indexof() method in action; if the user guess is one of the entries
        in the Arraylist, indexOf() will return its ArrayList location. If not, indexOf() will
        return -1.
         */
        int index = locationCells.indexOf(userInput);
        if(index >= 0){
            locationCells.remove(index); // using the ArrayList remove method to delete an entry

            if(locationCells.isEmpty()){
                // using the isEmpty() method to see if all of the locations have been guessed
                result = "kill";
                System.out.println("Ouch! You sunk " + name + " : ("); // tell the user that a Startup sunk
            }else{
                result = "hit";
            } // end if
        } // end outer if
        return result; // return miss, hit, or kill
    } // end of method
}
