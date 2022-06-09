import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;

public class Beveiliger implements Observer {

    private String naam;

    public Beveiliger (String naam, Brandmelder brandmelder) {
        this.naam = naam;
        brandmelder.addObserver (this);
    }

    @Override
    public void update (Observable o, Object arg) {
        Brandmelder brandmelder = (Brandmelder) o;

        if (brandmelder.getStatus().equals ("stil alarm")) {
            Scanner scanner = new Scanner (System.in);
            System.out.println ("Maak een keuze voor uitzetten brandmelder (1) of voor brand (2)");
            int keuze = scanner.nextInt ();

            if (keuze == 2) {
                System.out.println (this.naam + " zegt dat er brand is op positie " + brandmelder.getPositie ());
            }
            else if (keuze == 1) {
                System.out.println (this.naam + " zegt dat er geen brand is op positie " + brandmelder.getPositie ());
                brandmelder.setOff ();

                if (brandmelder.getStatus().equals ("uit")) {
                    System.out.println ("De brandmelder is uitgezet");
                }
                else {
                    System.out.println (this.naam + ", zet de brandmelder a.u.b. handmatig uit.");
                }
            }

        }
    }
}
