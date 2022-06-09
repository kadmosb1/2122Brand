import java.util.Observable;
import java.util.Observer;

public class Brandmelder extends Observable implements Observer {

    private String status = "uit";
    private String positie;

    public Brandmelder (String positie) {
        this.positie = positie;
    }

    public String getStatus () {
        return this.status;
    }

    public String getPositie () {
        return this.positie;
    }

    public void trigger () {
        this.status = "stil alarm";
        setChanged ();
        notifyObservers();
    }

    public void setOff () {
        status = "uit";
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println ("Brandmelder op positie '" + this.positie + "' geeft publiek alarm");
    }
}
