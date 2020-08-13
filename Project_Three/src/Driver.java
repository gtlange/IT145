import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

    // instance variables (add more as needed)
    private static ArrayList<Ship> shipList = new ArrayList();
    private static ArrayList<Cruise> cruiseList = new ArrayList();
    private static ArrayList<Passenger> passengerList = new ArrayList();


    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userChoice = "";

        initializeShipList(shipList);       		// initial ships
        initializeCruiseList(cruiseList);    		// initial cruises
        initializePassengerList(passengerList);	// initial passengers

        //do-while to continue prompting until "x" is entered to quit
        do {
            try {
                /* Try-catch block for error handling
                The displayMenu() method is called to display the text menu.
                Used if-else if statements to validate userChoice
                */

                displayMenu();
                userChoice = scnr.nextLine();

                if (userChoice.equals("1")) {
                    addShip();
                }
                else if (userChoice.equals("2")) {
                    editShip();
                }
                else if (userChoice.equals("3")) {
                    addCruise();
                }
                else if (userChoice.equals("4")) {
                    editCruise();
                }
                else if (userChoice.equals("5")) {
                    addPassenger();
                }
                else if (userChoice.equals("6")) {
                    editPassenger();
                }
                else if (userChoice.equalsIgnoreCase("A")) {
                    printShipList("name");
                }
                else if (userChoice.equalsIgnoreCase("B")) {
                    printShipList("active");
                }
                else if (userChoice.equalsIgnoreCase("C")) {
                    printShipList("full");
                }
                else if (userChoice.equalsIgnoreCase("D")) {
                    printCruiseList("list");
                }
                else if (userChoice.equalsIgnoreCase("E")) {
                    printCruiseList("details");
                }
                else if (userChoice.equalsIgnoreCase("F")) {
                    printPassengerList();
                }
                else if (userChoice.equalsIgnoreCase("x")) {
                    System.out.println("Goodbye...");
                    return;
                }
            }
            //catch block for errors.
            catch (Exception e) {
                System.out.println("Error, invalid input. Please try again.");
                e.printStackTrace();
            }
        }while (!userChoice.equalsIgnoreCase("x"));


    }



    // hardcoded ship data for testing
    // Initialize ship list
    public static void initializeShipList(ArrayList<Ship> shipList) {
        shipList.add(new Ship("Candy Cane", 20, 40, 10, 60, true));
        shipList.add(new Ship("Peppermint Stick", 10, 20, 5, 40, true));
        shipList.add(new Ship("Bon Bon", 12, 18, 2, 24, false));
        shipList.add(new Ship("Candy Corn", 12, 18, 2, 24, false));
        shipList.add(new Ship("Malitta Coffee", 12, 18, 2, 24, true));
    }

    // hardcoded cruise data for testing
    // Initialize cruise list
    public static void initializeCruiseList(ArrayList<Cruise> cruiseList) {
        Cruise newCruise = new Cruise("Southern Swirl", "Candy Cane", "Miami", "Cuba", "Miami");
        cruiseList.add(newCruise);
        Cruise newCruise1 = new Cruise("Southern Biscuit", "Kandy Kaine", "ZMACenter", "Kuba", "Kuba");
        cruiseList.add(newCruise1);
        Cruise newCruise2 = new Cruise("Southern", "Carnival", "FooManChu", "Timbuktu", "Jordan");
        cruiseList.add(newCruise2);
        Cruise newCruise3 = new Cruise("Alaskan Cruise", "Sealaska", "Brazil", "Fairbanks", "Minas Gerais");
        cruiseList.add(newCruise3);
    }

    //hardcoded cruise data for testing
    //Initialize passenger list
    public static void initializePassengerList(ArrayList<Passenger> passengerList) {
        Passenger newPassenger1 = new Passenger("Neo Anderson", "Southern Swirl", "STE");
        passengerList.add(newPassenger1);

        Passenger newPassenger2 = new Passenger("Trinity", "Southern Swirl", "STE");
        passengerList.add(newPassenger2);

        Passenger newPassenger3 = new Passenger("Morpheus", "Southern Swirl", "BAL");
        passengerList.add(newPassenger3);
    }

    // custom method to add ships to the shipList ArrayList
    public static void add(String tName, int tBalcony, int tOceanView, int tSuite, int tInterior, boolean tInService) {
        Ship newShip = new Ship(tName, tBalcony, tOceanView, tSuite, tInterior, tInService);
        shipList.add(newShip);
    }


    public static void printShipList(String listType) {
        // printShipList() method prints list of ships from the
        // shipList ArrayList. There are three different outputs
        // based on the listType String parameter:
        // name - prints a list of ship names only
        // active - prints a list of ship names that are "in service"
        // full - prints tabbed data on all ships

        if (shipList.size() < 1) {
            System.out.println("\nThere are no ships to print.");
            return;
        }
        if (listType == "name") {
            System.out.println("\n\nSHIP LIST - Name");
            for (int i = 0; i < shipList.size(); i++) {
                System.out.println(shipList.get(i));
            }
        } else if (listType == "active") { 								// TODO: FIX this code  Print ships which contain
            // 	boolean "true" for inService status
            System.out.println("\n\nSHIP LIST - Active");
            int i = 0; 													//Counter set to zero
            for (i = 0; i < shipList.size(); ++i) {
                if (shipList.get(i).getInService()) {
                    System.out.println(shipList.get(i).toString());		//Use toString method which returns ship's name
                }
            }
            i = i + 1;													//Increment counter when exiting for loop
            // complete this code block


        } else if (listType == "full") {
            // TODO: Fix this code
            System.out.println("\n\nSHIP LIST - Full");
            System.out.println("-----------------------------------------------");
            System.out.println("                    Number of Rooms     In");
            System.out.print("SHIP NAME           Bal OV  Ste Int     Service");
            System.out.println("\n-----------------------------------------------");
            for (Ship eachShip: shipList)
                eachShip.printShipData();

        } else
            System.out.println("\n\nError: List type not defined.");
    }

    public static void printCruiseList(String listType) {
        if (cruiseList.size() < 1) {
            System.out.println("\nThere are no cruises to print.");
            return;
        }
        if (listType == "list") {
            System.out.println("\n\nCRUISE LIST");
            for (int i=0; i < cruiseList.size(); i++) {
                System.out.println(cruiseList.get(i));
            }
        } else if (listType == "details") {
            System.out.println("\n\nCRUISE LIST - Details");
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println("                                      |----------------------PORTS-----------------------|");
            System.out.print("CRUISE NAME         SHIP NAME           DEPARTURE           DESTINATION         RETURN");
            System.out.println("\n-----------------------------------------------------------------------------------------");
            for (Cruise eachCruise: cruiseList)
                eachCruise.printCruiseDetails();
        } else
            System.out.println("\n\nError: List type not defined.");
    }

    public static void printPassengerList() {
        if (passengerList.size() < 1) {
            System.out.println("\nThere are no passengers to print.");
            return;
        }
        System.out.println("\n\nPASSENGER LIST");
        System.out.println("-----------------------------------------------------");
        System.out.print("PASSENGER NAME      CRUISE              ROOM TYPE");
        System.out.println("\n-----------------------------------------------------");
        for (Passenger eachPassenger: passengerList)
            eachPassenger.printPassenger();
    }

    // display text-based menu
    public static void displayMenu() {

        System.out.println("\n\n");
        System.out.println("\t\t\tLuxury Ocean Cruise Outings");
        System.out.println("\t\t\t\t\tSystem Menu\n");
        System.out.println("[1] Add Ship            [A] Print Ship Names");
        System.out.println("[2] Edit Ship           [B] Print Ship In Service List");
        System.out.println("[3] Add Cruise          [C] Print Ship Full List");
        System.out.println("[4] Edit Cruise         [D] Print Cruise List");
        System.out.println("[5] Add Passenger       [E] Print Cruise Details");
        System.out.println("[6] Edit Passenger      [F] Print Passenger List");
        System.out.println("[x] Exit System");
        System.out.println("\nEnter a menu selection: ");
    }

    // Add a New Ship
    public static void addShip() {
        Scanner newShipInput = new Scanner(System.in);
        int x = 1;

        do {
            try {
                System.out.println("Enter the new ship's name: ");
                String newShipName = newShipInput.nextLine();
                for (Ship eachShip: shipList) {											//Compare input from user to each shipName in shipList using enhanced for loop
                    if (eachShip.getShipName().equalsIgnoreCase(newShipName)) {
                        System.out.println("That ship is already in the system.");
                        return; 														//If duplicate, exit addShip method and present user with message ship already exists
                    }
                }
                Ship newShip1 = new Ship(newShipName,20, 40, 10, 60, true);				//Since shipName is not a duplicate, create new ship object containing instance variables and input from user as shipName
                shipList.add(newShip1);													//Add new ship object to shipList ArrayList
                System.out.println("Your ship has been added successfully");			//Notify user ship has been added
                x = 2;
            } catch (Exception e) {														//Code executed in the event of an exception
                System.out.println("Error - please enter valid character.");
                e.printStackTrace();
            }
        } while(x==1);
    }
    // complete this method



    // Edit an existing ship
    public static void editShip() {

        // This method does not need to be completed
        System.out.println("The \"Edit Ship\" feature is not yet implemented.");

    }

    // Add a New Cruise
    public static void addCruise() {

        Scanner newCruiseInput1 = new Scanner(System.in);												//Input from user
        System.out.println("Enter the ship name: ");
        String newShipName = newCruiseInput1.nextLine();

        for (Ship eachShip: shipList) {
            if (eachShip.getShipName().equalsIgnoreCase(newShipName) && eachShip.getInService()) {		//Ensures ship unique and is inSservice
                System.out.println("Ship found and in service");
                continue;
            }
        }
        for (Cruise eachCruise: cruiseList) {															//Ensures ship does not show up on cruiseList
            if (eachCruise.getCruiseShipName().equalsIgnoreCase(newShipName)) {
                System.out.println("Error: Cruise Ship Name taken");
                return;
            }
        }
        Cruise newCruise5 = new Cruise("Sea Starlett", newShipName, "Bolivia", "Taiwan", "Bolivia");	//Creates new cruise object
        cruiseList.add(newCruise5);																		//Adds cruise object to cruiseList ArrayList
        System.out.println("Cruise successfully added");

    }//END OF addCruise() METHOD****************************************************************************************





    // Edit an existing cruise
    public static void editCruise() {

        // This method does not need to be completed
        System.out.println("The \"Edit Cruise\" feature is not yet implemented.");

    }

    // Add a New Passenger
    public static void addPassenger() {

        Scanner newPassengerInput = new Scanner(System.in);
        System.out.println("Enter the new passenger's name: ");
        String newPassengerName = newPassengerInput.nextLine();

        // ensure new passenger name does not already exist
        for (Passenger eachPassenger: passengerList) {
            if (eachPassenger.getPassengerName().equalsIgnoreCase(newPassengerName)) {
                System.out.println("That passenger is already in the system. Exiting to menu...");
                return; // quits addPassenger() method processing
            }
        }

        // get cruise name for passenger
        System.out.println("Enter cruise name: ");
        String newCruiseName = newPassengerInput.nextLine();

        // ensure cruise exists
        for (Cruise eachCruise: cruiseList) {
            if (eachCruise.getCruiseName().equalsIgnoreCase(newCruiseName)) {
                // cruise does exist
            } else {
                System.out.println("That cruise does not exist in the system. Exiting to menu...");
                return; // quits addPassenger() method processing
            }
        }

        // get room type
        System.out.println("Enter Room Type (BAL, OV, STE, or INT: ");
        String room = newPassengerInput.nextLine();
        // validate room type
        if ((room.equalsIgnoreCase("BAL")) || (room.equalsIgnoreCase("OV")) ||
                (room.equalsIgnoreCase("STE")) || (room.equalsIgnoreCase("INT"))) {
            // validation passed - add passenger
            Passenger newPassenger = new Passenger(newPassengerName, newCruiseName, room.toUpperCase());
            passengerList.add(newPassenger);
        } else {
            System.out.println("Invalid input. Exiting to menu...");
            return; // quits addPassenger() method processing
        }
    }

    // Edit an existing passenger
    public static void editPassenger() {

        // This method does not need to be completed
        System.out.println("The \"Edit Passenger\" feature is not yet implemented.");

    }

    // Method to check if input is a number
    public static boolean isANumber(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)) == false)
                return false;
        }
        return true;
    }

}
