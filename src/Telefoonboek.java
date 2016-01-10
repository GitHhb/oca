import java.util.ArrayList;

public class Telefoonboek {
    public static void main(String[] args){
        ArrayList<PersonData> persons = new ArrayList<>();
        //PersonData persons = new PersonData();
        persons.add(new PersonData("Jan", "Jansen", "040123", false));
        persons.add(new PersonData("Piet", "Pieters", "040124", true));
        persons.add(new PersonData("Kees", "Pieters", "040122", false));
        persons.add(new PersonData("Truus", "de Jager", "043944", false));
        persons.add(new PersonData("Klara", "Renders", "29485", false));
        System.out.println();

        //System.out.println(persons.get(0));
        PersonData.printAll(persons);
        System.out.println();

        System.out.println("Search on first name:");
        PersonData.searchForKey(PersonData.Key.FIRSTNAME, "Piet", persons);
        System.out.println("Search on last name:");
        PersonData.searchForKey(PersonData.Key.LASTNAME, "de Jager", persons);
        System.out.println("Search on phone number:");
        PersonData.searchForKey(PersonData.Key.PHONENR, "040123", persons);
    }
}

//class PersonData extends ArrayList<PersonData> {
class PersonData{
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
        System.out.print("Added: ");
        printPerson(this);
    }

    // methods
    public String toString(){
        return firstName + " " + lastName + ", phone: " + (phoneNrSecret? "*******" : phoneNr);
    }

    static public void printAll(ArrayList<PersonData> persons){
        for (PersonData p: persons)
            printPerson(p);
    }

    static public void printPerson(PersonData p){
        System.out.println(p);
    }

    enum Key {FIRSTNAME, LASTNAME, PHONENR}

    static public void searchForKey (Key sk , String value, ArrayList<PersonData> persons){
        for (PersonData p: persons)
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
