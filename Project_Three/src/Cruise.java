public class Cruise {

    // Instance Variables
    private String cruiseName;
    private String cruiseShipName;
    private String departurePort;
    private String destination;
    private String returnPort;

    // Constructor - default
    Cruise() {
    }

    // Constructor - full
    Cruise(String tCruiseName, String tShipName, String tDeparture, String tDestination, String tReturn) {
        cruiseName = tCruiseName;
        cruiseShipName = tShipName;
        departurePort = tDeparture;
        destination = tDestination;
        returnPort = tReturn;
    }

    // Accessors
    public String getCruiseName() {
        return cruiseName;
    }

    public String getCruiseShipName() {
        return cruiseShipName;
    }

    public String getDeparturePort() {
        return departurePort;
    }

    public String getDestination() {
        return destination;
    }

    public String getReturnPort() {
        return returnPort;
    }

    // Mutators
    public void setCruiseName(String tVar) {
        cruiseName = tVar;
    }

    public void setCruiseShipName(String tVar) {
        cruiseShipName = tVar;
    }

    public void setDeparturePort(String tVar) {
        departurePort = tVar;
    }

    public void setDestination(String tVar) {
        destination = tVar;
    }

    public void setReturnPort(String tVar) {
        returnPort = tVar;
    }



    // print cruise details
    // TODO: Clean this up.
    public void printCruiseDetails() {
        int spaceCount;															//Int variables
        int spaceCount1;
        int spaceCount2;
        int spaceCount3;
        String spaces = "";														//String variables
        String spaces1 = "";
        String spaces2 = "";
        String spaces3 = "";
        spaceCount = 20 - cruiseName.length();	 								//Determining number of spaces between words.
        spaceCount1 = 20 - cruiseShipName.length(); 							//Value based on 20 spaces minus length of word received from input
        spaceCount2 = 20 - departurePort.length(); 								//to keep all output uniform in column format.
        spaceCount3 = 20 - destination.length();

        for (int i = 1; i <= spaceCount; i++) {									//for loops used to iterate over String spaces and add spaces
            spaces = spaces + " ";
        }
        for (int i = 1; i <= spaceCount1; i++) {
            spaces1 = spaces1 + " ";
        }
        for (int i = 1; i <= spaceCount2; i++) {
            spaces2 = spaces2 + " ";
        }
        for (int i = 1; i <= spaceCount3; i++) {
            spaces3 = spaces3 + " ";
        }



        System.out.println(cruiseName + spaces + cruiseShipName  + spaces1 +	//Print statement using dynamic spaces between variables ensuring
                departurePort + spaces2 + destination + spaces3 + 				//uniform spacing between words.
                returnPort);

    }






    // method added to print ship's name vice memory address
    @Override
    public String toString() {
        return cruiseName;
    }
}
