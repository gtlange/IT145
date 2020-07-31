
/* Geoff Lange
IT-145
July 20220
geoffrey.lange@snhu.edu
 */

import java.util.Scanner;


public class Driver {

    public static void main(String[] args) {

        // Instance variables
        String userAnimalRequest;
        String userCountryResidence;



        // create new scanner for user input
        Scanner scnr = new Scanner(System.in);

        // Create New Dog
        Dog userDog = new Dog(); // generic constructor for new dog



        // Create New Monkey
        Monkey userMonkey = new Monkey(); // generic constructor for new dog



        // Method to process request for a rescue animal
        // TODO: Future Menu option. Currently method not used and could remove the definition but not the statements.
        public void RequestAnimal(){
            // Questions for rescue animal request.
            System.out.println("Please enter a rescue animal type. Either Dog or Monkey");
            userAnimalRequest = scnr.nextLine();
            userAnimalRequest = userAnimalRequest.toLowerCase(); // Set to lowercase for validation

            System.out.println("Please enter your country of residence");
            userCountryResidence = scnr.nextLine();
            userCountryResidence = userCountryResidence.toLowerCase(); // Set to lowercase for validation

            // Check to see if animal available and reserve if available.
            if (userCountryResidence.equals(userDog.getInServiceCountry()) && userAnimalRequest.equals("dog")){
                System.out.println("A dog in your country is available and has been reserved.");
                userDog.setReserved(true);
            }
            else if (userCountryResidence.equals(userMonkey.getInServiceAgency()) && userAnimalRequest.equals("monkey")) {
                System.out.println("A monkey in your country is available and has been reserved.");
                userMonkey.setReserved(true);
            }
            else {
                System.out.println("No " + userAnimalRequest + " is available in " + userCountryResidence +".");
            }
        }
    }




        // Method(s) to update information on existing animals



        // Method to display matrix of animals based on location and status/training phase



        // Method to add animals



        // Method to out process animals for the farm or in-service placement



        // Method to display in-service animals



        // Process reports from in-service agencies reporting death/retirement





}
