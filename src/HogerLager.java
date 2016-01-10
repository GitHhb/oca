/**
 * Created by leandro on 9-1-2016.
 */
public class HogerLager {
    public static void main(String[] arg){

    }
}


class Card {
    /* A card deck consists of 52 cards C (4 colors * 13 values),
    *  represented by the numbers Cn, with 0 <= Cn < 52.
    *  Class Card creates a mapping of the card number to its name.
    */
    enum KaartKleur {Schoppen, Ruiten, Harten, Klaver}
    enum KaartWaarde {_1, _2, _3, _4, _5, _6, _7, _8, _9, Boer, Vrouw, Heer, Aas}

    public String cardNrToName(int cardnr) {
        // 0 <= cardnr < 52
        int color = cardnr / 13;
        int value = cardnr % 13;
        return "";

    }
    public int cardNameToNr(String name) { return 0;}
}
