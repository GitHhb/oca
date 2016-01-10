import java.util.ArrayList;

public class Telefoonboek {
    public static void main(String[] args){
        ArrayList<PersonData> persons = new ArrayList<>();
        persons.add(new PersonData("Jan", "Jansen", "040123", false));
        persons.add(new PersonData("Piet", "Pieters", "040124", true));

        //System.out.println(persons.get(0));
        PersonData.printAll(persons);

    }
}

class PersonData {
    // Kenmerken van een persoon
    String firstName;
    String lastName;
    String phoneNr;
    Boolean phoneNrSecret;

    PersonData(String firstName, String lastName, String phoneNr, Boolean phoneNrSecret){
        this.firstName = firstName;
        this.lastName  = lastName;
        this.phoneNr   = phoneNr;
        this.phoneNrSecret = phoneNrSecret;
        System.out.println("Added: " + firstName);
    }

    public String toString(){
        return firstName + " " + lastName + ", phone: " + (phoneNrSecret? "*******" : phoneNr);
    }

    static public void printAll(ArrayList<PersonData> persons){
        for (PersonData p: persons)
            System.out.println(p);
    }

}
