import java.util.ArrayList;

public class Gebouw {

    private ArrayList<Brandmelder> brandmelders = new ArrayList<> ();

    private void addBrandmelder (Brandmelder brandmelder) {
        brandmelders.add (brandmelder);
    }

    public static void main (String [] args) {
        Gebouw gebouw = new Gebouw ();
        Brandmelder brandmelderInKantine = new Brandmelder ("kantine");
        Beveiliger mohamed = new Beveiliger ("Mohamed", brandmelderInKantine);
        Brandmelder brandmelderBijIngang = new Brandmelder ("ingang");
        Beveiliger sara = new Beveiliger ("Sara", brandmelderBijIngang);
        gebouw.addBrandmelder (brandmelderInKantine);
        gebouw.addBrandmelder (brandmelderBijIngang);
        brandmelderInKantine.trigger ();
    }
}
