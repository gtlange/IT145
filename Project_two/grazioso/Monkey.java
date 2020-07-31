/* Geoff Lange
IT-145
July 20220
geoffrey.lange@snhu.edu
 */

import java.util.Arrays;

public class Monkey extends RescueAnimal {
    // instance variables
    private String species;
    private float tailLength;
    private float height;
    private float bodyLength;
    private float torso;
    private float skull;
    private float neck;

    // Mutators

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setTailLength(float tailLength){
        this.tailLength = tailLength;
    }

    public void setHeight(float height){
        this.height = height;
    }

    public void setBodyLength(float bodyLength){
        this.bodyLength = bodyLength;
    }

    public void setTorso(float torso){
        this.torso = torso;
    }

    public void setSkull(float skull){
        this.skull = skull;
    }

    public void setNeck(float neck){
        this.neck = neck;
    }

    // Accessors

    public String getSpecies(){
        return species;
    }

    public float getTailLength(){
        return tailLength;
    }

    public float getHeight(){
        return height;
    }

    public float getBodyLength(){
        return bodyLength;
    }

    public float getTorso(){
        return torso;
    }

    public float getSkull() {
        return skull;
    }

    public float getNeck(){
        return neck;
    }

    // Constructor
    public Monkey() {
        // Default constructor with no parameters
    }

    // Method to check if Monkey species is valid for a rescue animaol
    public boolean isEligibleMonkey(String species) {
        species.toLowerCase();
        final String[] validSpecies = {"capuchin", "guenon", "macaque", "armoset", "squirrel monkey", "tamarin"
        };

        return Arrays.asList(validSpecies).contains(species);
    }
}
