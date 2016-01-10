import java.util.ArrayList;

public class Telefoonboek {
    public static void main(String[] args){
        //ArrayList<PersonData> persons = new ArrayList<>();
        PersonData persons = new PersonData();
        persons.add(new PersonData("Jan", "Jansen", "040123", false));
        persons.add(new PersonData("Piet", "Pieters", "040124", true));
        persons.add(new PersonData("Kees", "Pieters", "040122", false));
        persons.add(new PersonData("Truus", "de Jager", "043944", false));
        persons.add(new PersonData("Klara", "Renders", "29485", false));

        //System.out.println(persons.get(0));
        persons.printAll();

        System.out.println();
        System.out.println("Search on first name:");
        persons.searchFirstName(PersonData.Key.FIRSTNAME, "Piet");
        System.out.println("Search on last name:");
        persons.searchFirstName(PersonData.Key.LASTNAME, "de Jager");
        System.out.println("Search on phone number:");
        persons.searchFirstName(PersonData.Key.PHONENR, "040123");
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

    enum Key {FIRSTNAME, LASTNAME, PHONENR}

    public void searchFirstName (Key sk , String value){
        for (PersonData p: this)
        switch (sk) {
            case FIRSTNAME:
                if (p.firstName.equals(value)) printPerson(p);
                break;
            case LASTNAME:
                if (p.lastName.equals(value)) printPerson(p);
                break;
            case PHONENR:
                if (p.phoneNr.equals(value)) printPerson(p);
        }
    }

    public void sortOnKey (Key sk) {
         switch (sk) {
            case FIRSTNAME:
                //
                break;
            case LASTNAME:
                //
                break;
            case PHONENR:
                //
        }
    }
}
