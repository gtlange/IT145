/* Geoff Lange
IT-145
July 20220
geoffrey.lange@snhu.edu
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class RescueAnimal {

    // Instance variables set to private for encapsulation. Defaults set by type.
    private String name;
    private String type;
    private String gender;
    private int age;
    private float weight;
    private SimpleDateFormat acquisitionDate;
    private SimpleDateFormat statusDate;
    private String acquisitionSource;
    private Boolean reserved;

    private String trainingLocation;
    private SimpleDateFormat trainingStart;
    private SimpleDateFormat trainingEnd;
    private String trainingStatus;

    private String inServiceCountry;
    private String inServiceCity;
    private String inServiceAgency;
    private String inServicePOC;
    private String inServiceEmail;
    private String inServicePhone;
    private String inServicePostalAddress;

    // Constructor
    public RescueAnimal() {
        // Simple constructor that sets all values to the default data type and default values.
    }

    // Accessor Methods -- Set to public for encapsulation. Return type matches the field.
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public float getWeight() {
        return weight;
    }

    public SimpleDateFormat getAcquisitionDate() {
        return acquisitionDate;
    }

    public SimpleDateFormat getStatusDate() {
        return statusDate;
    }

    public String getAcquisitionSource() {
        return acquisitionSource;
    }

    public boolean getReserved() {
        return reserved;
    }

    public String getTrainingLocation() {
        return trainingLocation;
    }

    public SimpleDateFormat getTrainingStart() {
        return trainingStart;
    }
    public SimpleDateFormat getTrainingEnd() {
        return trainingEnd;
    }

    public String getTrainingStatus() {
        return trainingStatus;
    }

    public String getInServiceCountry() {
        return inServiceCountry;
    }

    public String getInServiceCity() {
        return inServiceCity;
    }

    public String getInServiceAgency() {
        return inServiceAgency;
    }

    public String getInServicePOC() {
        return inServicePOC;
    }

    public String getInServiceEmail() {
        return inServiceEmail;
    }

    public String getInServicePhone() {
        return inServicePhone;
    }

    public String getInServicePostalAddress() {
        return inServicePostalAddress;
    }


    // Mutator Methods set to public for encapsulation. Variable parameters named to show user input.

    public void setName(String animalName) {
        name = animalName;
    }

    public void setType(String animalType) {
        type = animalType;
    }

    public void setGender(String animalGender) {
        gender = animalGender;
    }

    public void setAge(int animalAge) {
        age = animalAge;
    }

    public void setWeight(float animalWeight) {
        weight = animalWeight;
    }

    public void setAcquisitionDate(SimpleDateFormat animalAcquisitionDate) {
        acquisitionDate = animalAcquisitionDate;
    }

    public void setStatusDate(SimpleDateFormat animalAcquisitionDate) {
        statusDate = animalAcquisitionDate;
    }

    public void setAcquisitionSource(String animalAcquisitionSource) {
        acquisitionSource = animalAcquisitionSource;
    }

    public void setReserved(Boolean isReserved) {
        reserved = isReserved;
    }

    public void setTrainingLocation(String animalTrainingLocation) {
        trainingLocation = animalTrainingLocation;
    }

    public void setTrainingStart(SimpleDateFormat animalTrainingStart){
        trainingStart = animalTrainingStart;
    }

    public void setTrainingEnd(SimpleDateFormat animalTrainingEnd) {
        trainingEnd = animalTrainingEnd;
    }

    public void setTrainingStatus(String animalTrainingStatus) {
        trainingStatus = animalTrainingStatus;
    }

    public void setInServiceCountry(String serviceCountry) {
        inServiceCountry = serviceCountry;
    }

    public void setInServiceCity(String serviceCity) {
        inServiceCity = serviceCity;
    }

    public void setInServiceAgency(String serviceAgency) {
        inServiceAgency = serviceAgency;
    }

    public void setInServicePOC(String servicePOC) {
        inServicePOC = servicePOC;
    }

    public void setInServiceEmail(String serviceEmail){
        inServiceEmail = serviceEmail;
    }

    public void setInServicePhone(String servicePhone) {
        inServicePhone= servicePhone;
    }

    public void setInServicePostalAddress(String servicePostalAddress) {
        inServicePostalAddress = servicePostalAddress;
    }




}
