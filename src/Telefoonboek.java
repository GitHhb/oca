import java.util.ArrayList;

public class Telefoonboek {
    public static void main(String[] args){
        //ArrayList<PersonData> persons = new ArrayList<>();
        PersonData persons = new PersonData();
        persons.add(new PersonData("Jan", "Jansen", "040123", false));
        persons.add(new PersonData("Piet", "Pieters", "040124", true));

        //System.out.println(persons.get(0));
        persons.printAll();

        persons.searchFirstName("Piet");
    }
}

class PersonData extends ArrayList<PersonData> {
    // Kenmerken van een persoon
    String firstName;
    String lastName;
    String phoneNr;
    Boolean phoneNrSecret;

    // Constructors
    PersonData() {}

    PersonData(String firstName, String lastName, String phoneNr, Boolean phoneNrSecret){
        this.firstName = firstName;
        this.lastName  = lastName;
        this.phoneNr   = phoneNr;
        this.phoneNrSecret = phoneNrSecret;
        System.out.println("Added: " + firstName);
    }

    // methods
    public String toString(){
        return firstName + " " + lastName + ", phone: " + (phoneNrSecret? "*******" : phoneNr);
    }

    public void printAll(){
        for (PersonData p: this)
            printPerson(p);
    }

    public void printPerson(PersonData p){
        System.out.println(p);
    }

    public void searchFirstName (String firstName){
        for (PersonData p: this)
            if (p.firstName.equals(firstName)) printPerson(p);
    }

}
